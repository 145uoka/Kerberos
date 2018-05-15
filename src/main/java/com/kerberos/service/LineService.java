package com.kerberos.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kerberos.constants.SystemCodeConstants;
import com.kerberos.dbflute.exbhv.LinePropertyMBhv;
import com.kerberos.dbflute.exentity.LinePropertyM;
import com.kerberos.dto.AccessTokenDto;
import com.kerberos.dto.IdTokenDto;
import com.kerberos.exception.NotFoundRecordException;

/**
 * LineAPIに関するサービスクラス。
 */
@Service
public class LineService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LoggerService loggerService;

    @Autowired
    LinePropertyMBhv linePropertyMBhv;


    public String getRedirectUrlForOAuth(String appKey, String state) throws NotFoundRecordException {

        OptionalEntity<LinePropertyM> optLinePropertyM = linePropertyMBhv.selectByUniqueOf(appKey);

        if (optLinePropertyM.isPresent()) {
            LinePropertyM entity = optLinePropertyM.get();

            StringBuffer sb = new StringBuffer();
            String authorizeUrl = "https://access.line.me/oauth2/v2.1/authorize?";
            sb.append(authorizeUrl);

            sb.append("response_type=");
            sb.append(entity.getResponseType());
            sb.append("&client_id=");
            sb.append(entity.getClientId());
            sb.append("&redirect_uri=");
            sb.append(entity.getRedirectUri());
            sb.append("&state=");
            sb.append(state);
            sb.append("&scope=");
            sb.append(entity.getScopeVal());

            if (StringUtils.isNotEmpty(entity.getNonce())) {
                sb.append("&nonce=");
                sb.append(entity.getNonce());
            }

            if (StringUtils.isNotEmpty(entity.getNonce())) {
                sb.append("&prompt=");
                sb.append(entity.getPrompt());
            }

            if (StringUtils.isNotEmpty(entity.getNonce())) {
                sb.append("&bot_prompt=");
                sb.append(entity.getBotPrompt());
            }
            return sb.toString();
        }

        throw new NotFoundRecordException();
    }


    public IdTokenDto getIdToken(String code, String appkey) throws Exception {

        List<NameValuePair> params = new ArrayList<NameValuePair>();

        OptionalEntity<LinePropertyM> optLinePropertyM = linePropertyMBhv.selectByUniqueOf(appkey);

        if (optLinePropertyM.isPresent()) {
            LinePropertyM entity = optLinePropertyM.get();

            params.add(new BasicNameValuePair("grant_type", entity.getGrantType()));
            params.add(new BasicNameValuePair("code", code));
            params.add(new BasicNameValuePair("redirect_uri", entity.getRedirectUri()));
            params.add(new BasicNameValuePair("client_id", entity.getClientId()));
            params.add(new BasicNameValuePair("client_secret", entity.getClientSecret()));
        } else {
            throw new NotFoundRecordException();
        }

        HttpPost httpPost = new HttpPost("https://api.line.me/oauth2/v2.1/token");

        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params, SystemCodeConstants.CHARACTER_ENCODING);
        httpPost.setEntity(formEntity);
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpResponse httpResponse = httpClient.execute(httpPost);

        String json = EntityUtils.toString(httpResponse.getEntity(), SystemCodeConstants.CHARACTER_ENCODING);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(json);

        AccessTokenDto accessToken = new AccessTokenDto(
                node.get("scope").asText(),
                node.get("access_token").asText(),
                node.get("token_type").asText(),
                Integer.valueOf(node.get("expires_in").asText()),
                node.get("refresh_token").asText(),
                node.get("id_token").asText()
                );

        return createIdTokenDto(accessToken.id_token);
    }

    private void ouputLogJsonNode(JsonNode node) {
        if (!logger.isDebugEnabled()) {
            return;
        }
        if (node == null) {
            logger.debug("JsonNode is null!!");
            return;
        }
        if (node.get("scope") != null) {
            logger.debug("scope = [" + node.get("scope").asText() + "]");
        } else {
            logger.debug("scope = [null]");
        }
        if (node.get("access_token") != null) {
            logger.debug("access_token = [" + node.get("access_token").asText() + "]");
        } else {
            logger.debug("access_token = [null]");
        }
        if (node.get("token_type") != null) {
            logger.debug("token_type = [" + node.get("token_type").asText() + "]");
        } else {
            logger.debug("token_type = [null]");
        }
        if (node.get("expires_in") != null) {
            logger.debug("expires_in = [" + node.get("expires_in").asText() + "]");
        } else {
            logger.debug("expires_in = [null]");
        }
        if (node.get("refresh_token") != null) {
            logger.debug("refresh_token = [" + node.get("refresh_token").asText() + "]");
        } else {
            logger.debug("refresh_token = [null]");
        }
        if (node.get("id_token") != null) {
            logger.debug("id_token = [" + node.get("id_token").asText() + "]");
        } else {
            logger.debug("id_token = [null]");
        }
    }

    private IdTokenDto createIdTokenDto(String id_token) {
        try {
            DecodedJWT jwt = JWT.decode(id_token);
            return new IdTokenDto(
                    jwt.getClaim("iss").asString(),
                    jwt.getClaim("sub").asString(),
                    jwt.getClaim("aud").asString(),
                    jwt.getClaim("ext").asLong(),
                    jwt.getClaim("iat").asLong(),
                    jwt.getClaim("nonce").asString(),
                    jwt.getClaim("name").asString(),
                    jwt.getClaim("picture").asString(),
                    jwt.getClaim("email").asString());
        } catch (JWTDecodeException e) {
            throw new RuntimeException(e);
        }
    }

}
