package com.kerberos.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kerberos.common.BeforeLogin;
import com.kerberos.dto.IdTokenDto;
import com.kerberos.service.LineService;
import com.kerberos.service.LoggerService;

/**
 * ログイン用コントローラ。
 *
 * @author ishigouoka_k
 */
@BeforeLogin
@Controller
public class LoginController extends BaseController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LoggerService loggerService;

    @Autowired
    LineService lineService;

    @RequestMapping(value = "/oauth/{appKey}", method = RequestMethod.GET)
    public String lineLogin(@PathVariable String appKey, HttpSession session) throws Exception {

        String state = "hoge";
        String redirectUri = lineService.getRedirectUrlForOAuth(appKey, state);
        session.setAttribute("appkey", appKey);
        session.setAttribute("state", state);

        return super.redirect(redirectUri);
    }

    @RequestMapping(value = "/oauth/callback", method = RequestMethod.GET)
    public String callback(@RequestParam("code") String code,
            @RequestParam("state") String state, HttpSession session) throws Exception {

        String appkey = (String)session.getAttribute("appkey");
        String orgState = (String)session.getAttribute("state");

        IdTokenDto idToken = lineService.getIdToken(code, appkey);

        session.invalidate();

        logger.info(idToken.toString());

        return redirect("/");
    }

}
