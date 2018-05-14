package com.kerberos.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.kerberos.dbflute.allcommon.EntityDefinedCommonColumn;
import com.kerberos.dbflute.allcommon.DBMetaInstanceHandler;
import com.kerberos.dbflute.exentity.*;

/**
 * The entity of line_property_m as TABLE. <br>
 * LINEプロパティマスタ
 * <pre>
 * [primary-key]
 *     line_prop_id
 *
 * [column]
 *     line_prop_id, app_key, response_type, client_id, redirect_uri, state_val, scope_val, nonce, prompt, bot_prompt, delete_flag, register_datetime, update_datetime, client_secret, grant_type
 *
 * [sequence]
 *     line_property_m_line_prop_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer linePropId = entity.getLinePropId();
 * String appKey = entity.getAppKey();
 * String responseType = entity.getResponseType();
 * String clientId = entity.getClientId();
 * String redirectUri = entity.getRedirectUri();
 * String stateVal = entity.getStateVal();
 * String scopeVal = entity.getScopeVal();
 * String nonce = entity.getNonce();
 * String prompt = entity.getPrompt();
 * String botPrompt = entity.getBotPrompt();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String clientSecret = entity.getClientSecret();
 * String grantType = entity.getGrantType();
 * entity.setLinePropId(linePropId);
 * entity.setAppKey(appKey);
 * entity.setResponseType(responseType);
 * entity.setClientId(clientId);
 * entity.setRedirectUri(redirectUri);
 * entity.setStateVal(stateVal);
 * entity.setScopeVal(scopeVal);
 * entity.setNonce(nonce);
 * entity.setPrompt(prompt);
 * entity.setBotPrompt(botPrompt);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setClientSecret(clientSecret);
 * entity.setGrantType(grantType);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLinePropertyM extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** line_prop_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _linePropId;

    /** app_key: {UQ, NotNull, text(2147483647)} */
    protected String _appKey;

    /** response_type: {NotNull, text(2147483647), default=['code'::text]} */
    protected String _responseType;

    /** client_id: {NotNull, text(2147483647)} */
    protected String _clientId;

    /** redirect_uri: {NotNull, text(2147483647)} */
    protected String _redirectUri;

    /** state_val: {NotNull, text(2147483647)} */
    protected String _stateVal;

    /** scope_val: {NotNull, text(2147483647)} */
    protected String _scopeVal;

    /** nonce: {text(2147483647)} */
    protected String _nonce;

    /** prompt: {text(2147483647)} */
    protected String _prompt;

    /** bot_prompt: {text(2147483647)} */
    protected String _botPrompt;

    /** delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** client_secret: {NotNull, text(2147483647)} */
    protected String _clientSecret;

    /** grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]} */
    protected String _grantType;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "line_property_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_linePropId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param appKey : UQ, NotNull, text(2147483647). (NotNull)
     */
    public void uniqueBy(String appKey) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("appKey");
        setAppKey(appKey);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLinePropertyM) {
            BsLinePropertyM other = (BsLinePropertyM)obj;
            if (!xSV(_linePropId, other._linePropId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _linePropId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_linePropId));
        sb.append(dm).append(xfND(_appKey));
        sb.append(dm).append(xfND(_responseType));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_redirectUri));
        sb.append(dm).append(xfND(_stateVal));
        sb.append(dm).append(xfND(_scopeVal));
        sb.append(dm).append(xfND(_nonce));
        sb.append(dm).append(xfND(_prompt));
        sb.append(dm).append(xfND(_botPrompt));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_clientSecret));
        sb.append(dm).append(xfND(_grantType));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public LinePropertyM clone() {
        return (LinePropertyM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] line_prop_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'line_prop_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getLinePropId() {
        checkSpecifiedProperty("linePropId");
        return _linePropId;
    }

    /**
     * [set] line_prop_id: {PK, ID, NotNull, serial(10)} <br>
     * @param linePropId The value of the column 'line_prop_id'. (basically NotNull if update: for the constraint)
     */
    public void setLinePropId(Integer linePropId) {
        registerModifiedProperty("linePropId");
        _linePropId = linePropId;
    }

    /**
     * [get] app_key: {UQ, NotNull, text(2147483647)} <br>
     * @return The value of the column 'app_key'. (basically NotNull if selected: for the constraint)
     */
    public String getAppKey() {
        checkSpecifiedProperty("appKey");
        return _appKey;
    }

    /**
     * [set] app_key: {UQ, NotNull, text(2147483647)} <br>
     * @param appKey The value of the column 'app_key'. (basically NotNull if update: for the constraint)
     */
    public void setAppKey(String appKey) {
        registerModifiedProperty("appKey");
        _appKey = appKey;
    }

    /**
     * [get] response_type: {NotNull, text(2147483647), default=['code'::text]} <br>
     * この値を指定することにより、LINEプラットフォームから認可コードが返されます。
     * @return The value of the column 'response_type'. (basically NotNull if selected: for the constraint)
     */
    public String getResponseType() {
        checkSpecifiedProperty("responseType");
        return _responseType;
    }

    /**
     * [set] response_type: {NotNull, text(2147483647), default=['code'::text]} <br>
     * この値を指定することにより、LINEプラットフォームから認可コードが返されます。
     * @param responseType The value of the column 'response_type'. (basically NotNull if update: for the constraint)
     */
    public void setResponseType(String responseType) {
        registerModifiedProperty("responseType");
        _responseType = responseType;
    }

    /**
     * [get] client_id: {NotNull, text(2147483647)} <br>
     * チャネルID。LINEが発行した、チャネル固有の識別子。
     * @return The value of the column 'client_id'. (basically NotNull if selected: for the constraint)
     */
    public String getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] client_id: {NotNull, text(2147483647)} <br>
     * チャネルID。LINEが発行した、チャネル固有の識別子。
     * @param clientId The value of the column 'client_id'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(String clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] redirect_uri: {NotNull, text(2147483647)} <br>
     * コールバックURL。認証と認可の後にユーザーがリダイレクトされるURLです。コンソールでチャネル向けに登録したコールバックURLと一致する必要があります。
     * @return The value of the column 'redirect_uri'. (basically NotNull if selected: for the constraint)
     */
    public String getRedirectUri() {
        checkSpecifiedProperty("redirectUri");
        return _redirectUri;
    }

    /**
     * [set] redirect_uri: {NotNull, text(2147483647)} <br>
     * コールバックURL。認証と認可の後にユーザーがリダイレクトされるURLです。コンソールでチャネル向けに登録したコールバックURLと一致する必要があります。
     * @param redirectUri The value of the column 'redirect_uri'. (basically NotNull if update: for the constraint)
     */
    public void setRedirectUri(String redirectUri) {
        registerModifiedProperty("redirectUri");
        _redirectUri = redirectUri;
    }

    /**
     * [get] state_val: {NotNull, text(2147483647)} <br>
     * クロスサイトリクエストフォージェリ防止用の固有な英数字の文字列。アプリ側でランダムに生成する必要があります。URLエンコードされた文字列は使用できません。
     * @return The value of the column 'state_val'. (basically NotNull if selected: for the constraint)
     */
    public String getStateVal() {
        checkSpecifiedProperty("stateVal");
        return _stateVal;
    }

    /**
     * [set] state_val: {NotNull, text(2147483647)} <br>
     * クロスサイトリクエストフォージェリ防止用の固有な英数字の文字列。アプリ側でランダムに生成する必要があります。URLエンコードされた文字列は使用できません。
     * @param stateVal The value of the column 'state_val'. (basically NotNull if update: for the constraint)
     */
    public void setStateVal(String stateVal) {
        registerModifiedProperty("stateVal");
        _stateVal = stateVal;
    }

    /**
     * [get] scope_val: {NotNull, text(2147483647)} <br>
     * ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。詳しくは、「スコープ」を参照してください。ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。<br>
     * profile：ユーザーのプロフィール情報を取得する権限です。<br>
     * openid：IDトークンを取得する権限です。詳しくは、「IDトークン」を参照してください。<br>
     * email：ユーザーのメールアドレスを取得する権限です。openidを同時に指定する必要があります。詳しくは、「IDトークン」を参照してください。
     * @return The value of the column 'scope_val'. (basically NotNull if selected: for the constraint)
     */
    public String getScopeVal() {
        checkSpecifiedProperty("scopeVal");
        return _scopeVal;
    }

    /**
     * [set] scope_val: {NotNull, text(2147483647)} <br>
     * ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。詳しくは、「スコープ」を参照してください。ユーザーが付与する権限。URLエンコードされた空白文字（%20）で区切って、複数のスコープを指定できます。<br>
     * profile：ユーザーのプロフィール情報を取得する権限です。<br>
     * openid：IDトークンを取得する権限です。詳しくは、「IDトークン」を参照してください。<br>
     * email：ユーザーのメールアドレスを取得する権限です。openidを同時に指定する必要があります。詳しくは、「IDトークン」を参照してください。
     * @param scopeVal The value of the column 'scope_val'. (basically NotNull if update: for the constraint)
     */
    public void setScopeVal(String scopeVal) {
        registerModifiedProperty("scopeVal");
        _scopeVal = scopeVal;
    }

    /**
     * [get] nonce: {text(2147483647)} <br>
     * リプレイアタックを防止するための文字列。この値はレスポンスで返されるIDトークンに含まれます。
     * @return The value of the column 'nonce'. (NullAllowed even if selected: for no constraint)
     */
    public String getNonce() {
        checkSpecifiedProperty("nonce");
        return _nonce;
    }

    /**
     * [set] nonce: {text(2147483647)} <br>
     * リプレイアタックを防止するための文字列。この値はレスポンスで返されるIDトークンに含まれます。
     * @param nonce The value of the column 'nonce'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNonce(String nonce) {
        registerModifiedProperty("nonce");
        _nonce = nonce;
    }

    /**
     * [get] prompt: {text(2147483647)} <br>
     * consent。ユーザーが要求された権限をすべて付与済みであっても、強制的に同意画面を表示します。
     * @return The value of the column 'prompt'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrompt() {
        checkSpecifiedProperty("prompt");
        return _prompt;
    }

    /**
     * [set] prompt: {text(2147483647)} <br>
     * consent。ユーザーが要求された権限をすべて付与済みであっても、強制的に同意画面を表示します。
     * @param prompt The value of the column 'prompt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrompt(String prompt) {
        registerModifiedProperty("prompt");
        _prompt = prompt;
    }

    /**
     * [get] bot_prompt: {text(2147483647)} <br>
     * ボットを友だち追加するオプションをユーザーのログイン時に表示します。normalまたはaggressiveを指定します。詳しくは、「ボットをLINEログインのチャネルにリンクする」を参照してください。
     * @return The value of the column 'bot_prompt'. (NullAllowed even if selected: for no constraint)
     */
    public String getBotPrompt() {
        checkSpecifiedProperty("botPrompt");
        return _botPrompt;
    }

    /**
     * [set] bot_prompt: {text(2147483647)} <br>
     * ボットを友だち追加するオプションをユーザーのログイン時に表示します。normalまたはaggressiveを指定します。詳しくは、「ボットをLINEログインのチャネルにリンクする」を参照してください。
     * @param botPrompt The value of the column 'bot_prompt'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBotPrompt(String botPrompt) {
        registerModifiedProperty("botPrompt");
        _botPrompt = botPrompt;
    }

    /**
     * [get] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] update_datetime: {timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] client_secret: {NotNull, text(2147483647)} <br>
     * チャネルシークレット
     * @return The value of the column 'client_secret'. (basically NotNull if selected: for the constraint)
     */
    public String getClientSecret() {
        checkSpecifiedProperty("clientSecret");
        return _clientSecret;
    }

    /**
     * [set] client_secret: {NotNull, text(2147483647)} <br>
     * チャネルシークレット
     * @param clientSecret The value of the column 'client_secret'. (basically NotNull if update: for the constraint)
     */
    public void setClientSecret(String clientSecret) {
        registerModifiedProperty("clientSecret");
        _clientSecret = clientSecret;
    }

    /**
     * [get] grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]} <br>
     * authorization_code
     * @return The value of the column 'grant_type'. (basically NotNull if selected: for the constraint)
     */
    public String getGrantType() {
        checkSpecifiedProperty("grantType");
        return _grantType;
    }

    /**
     * [set] grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]} <br>
     * authorization_code
     * @param grantType The value of the column 'grant_type'. (basically NotNull if update: for the constraint)
     */
    public void setGrantType(String grantType) {
        registerModifiedProperty("grantType");
        _grantType = grantType;
    }
}
