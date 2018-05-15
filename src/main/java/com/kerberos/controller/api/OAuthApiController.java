package com.kerberos.controller.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kerberos.api.form.api.GetTokenRequestForm;
import com.kerberos.dto.AccessTokenDto;
import com.kerberos.dto.IdTokenDto;
import com.kerberos.dto.api.OAuthTokenDto;
import com.kerberos.exception.NotFoundRecordException;
import com.kerberos.service.LineService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class OAuthApiController {

    private static final Logger logger = LoggerFactory.getLogger(OAuthApiController.class);

    @Autowired
    LineService lineService;

    /**
     * Simply selects the home view to render by returning its name.
     * @throws NotFoundRecordException
     */
    @RequestMapping(value = "/api/getToken", method = RequestMethod.POST)
    @ResponseBody
    public OAuthTokenDto getToken(@RequestBody @Valid GetTokenRequestForm form, Errors errors){

        OAuthTokenDto oAuthTokenDto = new OAuthTokenDto();

        try {
            AccessTokenDto accessTokenDto = lineService.getIdToken(form.getCode(), form.getAppKey());

            IdTokenDto idTokenDto = lineService.createIdTokenDto(accessTokenDto.id_token);

            if (!logger.isDebugEnabled()) {
                idTokenDto.toString();
            }

            oAuthTokenDto.setLineEmail(idTokenDto.getEmail());
            oAuthTokenDto.setLineId(idTokenDto.getSub());
            oAuthTokenDto.setLineName(idTokenDto.getName());
        } catch (Exception e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        return oAuthTokenDto;
    }

}
