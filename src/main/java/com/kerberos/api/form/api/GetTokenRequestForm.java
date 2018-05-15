package com.kerberos.api.form.api;

import java.io.Serializable;

/**
 * GetTokenRequestDto。
 *
 * @author 
 */
public class GetTokenRequestForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** clientId */
    private String clientId;

    /** clientSecret */
    private String clientSecret;

    /** code */
    private String code;

    /**
     * clientIdの取得。
     *
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * clientIdを設定。
     *
     * @param clientId clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * clientSecretの取得。
     *
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * clientSecretを設定。
     *
     * @param clientSecret clientSecret
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * codeの取得。
     *
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * codeを設定。
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

}
