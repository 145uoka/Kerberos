package com.kerberos.controller;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kerberos.api.form.OAuthExResultForm;
import com.kerberos.common.BeforeLogin;
import com.kerberos.dbflute.exbhv.LinePropertyMBhv;
import com.kerberos.dbflute.exentity.LinePropertyM;
import com.kerberos.dto.AccessTokenDto;
import com.kerberos.dto.IdTokenDto;
import com.kerberos.exception.IllegalRequestParamException;
import com.kerberos.exception.NotFoundRecordException;
import com.kerberos.service.LineService;
import com.kerberos.service.LoggerService;

/**
 * ログイン用コントローラ。
 *
 */
@BeforeLogin
@Controller
@RequestMapping(value = "/oauth")
public class OAuthController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LoggerService loggerService;

    @Autowired
    LineService lineService;

    @Autowired
    LinePropertyMBhv linePropertyMBhv;

    @RequestMapping(value = "/line/{appKey}", method = RequestMethod.GET)
    public String lineLogin(@PathVariable String appKey, HttpSession session) throws Exception {

        String state = "hoge";
        String redirectUri = lineService.getRedirectUrlForOAuth(appKey, state);
        session.setAttribute("appkey", appKey);
        session.setAttribute("state", state);

        return super.redirect(redirectUri);
    }

    @RequestMapping(value = "/line/callback", method = RequestMethod.GET)
    public String callback(@RequestParam("code") String code,
            @RequestParam("state") String state, HttpSession session) throws Exception {

        String appkey = (String)session.getAttribute("appkey");
        String orgState = (String)session.getAttribute("state");

        if (!StringUtils.equals(state, orgState)) {
            throw new IllegalRequestParamException("state", orgState, state);
        }

        OptionalEntity<LinePropertyM> optLinePropertyM = linePropertyMBhv.selectByUniqueOf(appkey);

        if (!optLinePropertyM.isPresent()) {
            throw new NotFoundRecordException();
        }

        AccessTokenDto accessTokenDto = lineService.getIdToken(code, appkey);

        IdTokenDto idTokenDto = lineService.createIdTokenDto(accessTokenDto.id_token);

        if (!logger.isDebugEnabled()) {
            idTokenDto.toString();
        }

        OAuthExResultForm form = createOAuthExResultForm(
                "0",null,null,"state-hoge","state-code", idTokenDto.toString());

        session.invalidate();
        String urlParam = createRedirectUrlParam(form);

        return redirect(optLinePropertyM.get().getExRedirectUri() + urlParam);
    }

    private OAuthExResultForm createOAuthExResultForm(String result, String errorCode, String errorDescription,
            String state, String code, String itToken) {

        OAuthExResultForm oAuthExResultForm = new OAuthExResultForm();
        oAuthExResultForm.setResult(result);
        oAuthExResultForm.setErrorCode(errorCode);
        oAuthExResultForm.setErrorDescription(errorDescription);
        oAuthExResultForm.setState(state);
        oAuthExResultForm.setCode(code);
        oAuthExResultForm.setItToken(itToken);

        return oAuthExResultForm;
    }

    private String createRedirectUrlParam(OAuthExResultForm oAuthExResultForm) throws IllegalAccessException,
    InvocationTargetException, NoSuchMethodException, UnsupportedEncodingException {

        Map<String, String> map = BeanUtils.describe(oAuthExResultForm);

        boolean isFirstParam = true;

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<String, String> entry : map.entrySet()) {
            if (StringUtils.isNotEmpty(entry.getValue())) {
                if (isFirstParam) {
                    sb.append("?");
                    isFirstParam = false;
                } else {
                    sb.append("&");
                }

                sb.append(entry.getKey());
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        }
        return sb.toString();
    }

}
