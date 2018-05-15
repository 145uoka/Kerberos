package com.kerberos.api.form;

/**
 * OAuthExRequestForm。
 *
 * @author
 */
public class OAuthExRequestForm {

    /** state */
    private String state;

    /** exRedirectUrl */
    private String exRedirectUrl;

    /**
     * stateの取得。
     *
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * stateを設定。
     *
     * @param state state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * exRedirectUrlの取得。
     *
     * @return exRedirectUrl
     */
    public String getExRedirectUrl() {
        return this.exRedirectUrl;
    }

    /**
     * exRedirectUrlを設定。
     *
     * @param exRedirectUrl exRedirectUrl
     */
    public void setExRedirectUrl(String exRedirectUrl) {
        this.exRedirectUrl = exRedirectUrl;
    }

}
