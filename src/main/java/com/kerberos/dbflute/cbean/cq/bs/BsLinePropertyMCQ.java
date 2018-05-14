package com.kerberos.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.kerberos.dbflute.cbean.cq.ciq.*;
import com.kerberos.dbflute.cbean.*;
import com.kerberos.dbflute.cbean.cq.*;

/**
 * The base condition-query of line_property_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsLinePropertyMCQ extends AbstractBsLinePropertyMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LinePropertyMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLinePropertyMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from line_property_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LinePropertyMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LinePropertyMCIQ xcreateCIQ() {
        LinePropertyMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LinePropertyMCIQ xnewCIQ() {
        return new LinePropertyMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join line_property_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LinePropertyMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LinePropertyMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _linePropId;
    public ConditionValue xdfgetLinePropId()
    { if (_linePropId == null) { _linePropId = nCV(); }
      return _linePropId; }
    protected ConditionValue xgetCValueLinePropId() { return xdfgetLinePropId(); }

    /**
     * Add order-by as ascend. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_LinePropId_Asc() { regOBA("line_prop_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_LinePropId_Desc() { regOBD("line_prop_id"); return this; }

    protected ConditionValue _appKey;
    public ConditionValue xdfgetAppKey()
    { if (_appKey == null) { _appKey = nCV(); }
      return _appKey; }
    protected ConditionValue xgetCValueAppKey() { return xdfgetAppKey(); }

    /**
     * Add order-by as ascend. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_AppKey_Asc() { regOBA("app_key"); return this; }

    /**
     * Add order-by as descend. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_AppKey_Desc() { regOBD("app_key"); return this; }

    protected ConditionValue _responseType;
    public ConditionValue xdfgetResponseType()
    { if (_responseType == null) { _responseType = nCV(); }
      return _responseType; }
    protected ConditionValue xgetCValueResponseType() { return xdfgetResponseType(); }

    /**
     * Add order-by as ascend. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ResponseType_Asc() { regOBA("response_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ResponseType_Desc() { regOBD("response_type"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * client_id: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ClientId_Asc() { regOBA("client_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * client_id: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ClientId_Desc() { regOBD("client_id"); return this; }

    protected ConditionValue _redirectUri;
    public ConditionValue xdfgetRedirectUri()
    { if (_redirectUri == null) { _redirectUri = nCV(); }
      return _redirectUri; }
    protected ConditionValue xgetCValueRedirectUri() { return xdfgetRedirectUri(); }

    /**
     * Add order-by as ascend. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_RedirectUri_Asc() { regOBA("redirect_uri"); return this; }

    /**
     * Add order-by as descend. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_RedirectUri_Desc() { regOBD("redirect_uri"); return this; }

    protected ConditionValue _stateVal;
    public ConditionValue xdfgetStateVal()
    { if (_stateVal == null) { _stateVal = nCV(); }
      return _stateVal; }
    protected ConditionValue xgetCValueStateVal() { return xdfgetStateVal(); }

    /**
     * Add order-by as ascend. <br>
     * state_val: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_StateVal_Asc() { regOBA("state_val"); return this; }

    /**
     * Add order-by as descend. <br>
     * state_val: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_StateVal_Desc() { regOBD("state_val"); return this; }

    protected ConditionValue _scopeVal;
    public ConditionValue xdfgetScopeVal()
    { if (_scopeVal == null) { _scopeVal = nCV(); }
      return _scopeVal; }
    protected ConditionValue xgetCValueScopeVal() { return xdfgetScopeVal(); }

    /**
     * Add order-by as ascend. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ScopeVal_Asc() { regOBA("scope_val"); return this; }

    /**
     * Add order-by as descend. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ScopeVal_Desc() { regOBD("scope_val"); return this; }

    protected ConditionValue _nonce;
    public ConditionValue xdfgetNonce()
    { if (_nonce == null) { _nonce = nCV(); }
      return _nonce; }
    protected ConditionValue xgetCValueNonce() { return xdfgetNonce(); }

    /**
     * Add order-by as ascend. <br>
     * nonce: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_Nonce_Asc() { regOBA("nonce"); return this; }

    /**
     * Add order-by as descend. <br>
     * nonce: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_Nonce_Desc() { regOBD("nonce"); return this; }

    protected ConditionValue _prompt;
    public ConditionValue xdfgetPrompt()
    { if (_prompt == null) { _prompt = nCV(); }
      return _prompt; }
    protected ConditionValue xgetCValuePrompt() { return xdfgetPrompt(); }

    /**
     * Add order-by as ascend. <br>
     * prompt: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_Prompt_Asc() { regOBA("prompt"); return this; }

    /**
     * Add order-by as descend. <br>
     * prompt: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_Prompt_Desc() { regOBD("prompt"); return this; }

    protected ConditionValue _botPrompt;
    public ConditionValue xdfgetBotPrompt()
    { if (_botPrompt == null) { _botPrompt = nCV(); }
      return _botPrompt; }
    protected ConditionValue xgetCValueBotPrompt() { return xdfgetBotPrompt(); }

    /**
     * Add order-by as ascend. <br>
     * bot_prompt: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_BotPrompt_Asc() { regOBA("bot_prompt"); return this; }

    /**
     * Add order-by as descend. <br>
     * bot_prompt: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_BotPrompt_Desc() { regOBD("bot_prompt"); return this; }

    protected ConditionValue _deleteFlag;
    public ConditionValue xdfgetDeleteFlag()
    { if (_deleteFlag == null) { _deleteFlag = nCV(); }
      return _deleteFlag; }
    protected ConditionValue xgetCValueDeleteFlag() { return xdfgetDeleteFlag(); }

    /**
     * Add order-by as ascend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    protected ConditionValue _clientSecret;
    public ConditionValue xdfgetClientSecret()
    { if (_clientSecret == null) { _clientSecret = nCV(); }
      return _clientSecret; }
    protected ConditionValue xgetCValueClientSecret() { return xdfgetClientSecret(); }

    /**
     * Add order-by as ascend. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ClientSecret_Asc() { regOBA("client_secret"); return this; }

    /**
     * Add order-by as descend. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_ClientSecret_Desc() { regOBD("client_secret"); return this; }

    protected ConditionValue _grantType;
    public ConditionValue xdfgetGrantType()
    { if (_grantType == null) { _grantType = nCV(); }
      return _grantType; }
    protected ConditionValue xgetCValueGrantType() { return xdfgetGrantType(); }

    /**
     * Add order-by as ascend. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_GrantType_Asc() { regOBA("grant_type"); return this; }

    /**
     * Add order-by as descend. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addOrderBy_GrantType_Desc() { regOBD("grant_type"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLinePropertyMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LinePropertyMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LinePropertyMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LinePropertyMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LinePropertyMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LinePropertyMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LinePropertyMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LinePropertyMCQ> _myselfExistsMap;
    public Map<String, LinePropertyMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LinePropertyMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LinePropertyMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LinePropertyMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LinePropertyMCB.class.getName(); }
    protected String xCQ() { return LinePropertyMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
