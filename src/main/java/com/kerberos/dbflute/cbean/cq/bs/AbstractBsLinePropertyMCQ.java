package com.kerberos.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.kerberos.dbflute.allcommon.*;
import com.kerberos.dbflute.cbean.*;
import com.kerberos.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of line_property_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLinePropertyMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLinePropertyMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "line_property_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropId The value of linePropId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLinePropId_Equal(Integer linePropId) {
        doSetLinePropId_Equal(linePropId);
    }

    protected void doSetLinePropId_Equal(Integer linePropId) {
        regLinePropId(CK_EQ, linePropId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropId The value of linePropId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLinePropId_NotEqual(Integer linePropId) {
        doSetLinePropId_NotEqual(linePropId);
    }

    protected void doSetLinePropId_NotEqual(Integer linePropId) {
        regLinePropId(CK_NES, linePropId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropId The value of linePropId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLinePropId_GreaterThan(Integer linePropId) {
        regLinePropId(CK_GT, linePropId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropId The value of linePropId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLinePropId_LessThan(Integer linePropId) {
        regLinePropId(CK_LT, linePropId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropId The value of linePropId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLinePropId_GreaterEqual(Integer linePropId) {
        regLinePropId(CK_GE, linePropId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropId The value of linePropId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLinePropId_LessEqual(Integer linePropId) {
        regLinePropId(CK_LE, linePropId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of linePropId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of linePropId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLinePropId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLinePropId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of linePropId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of linePropId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLinePropId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLinePropId(), "line_prop_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropIdList The collection of linePropId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinePropId_InScope(Collection<Integer> linePropIdList) {
        doSetLinePropId_InScope(linePropIdList);
    }

    protected void doSetLinePropId_InScope(Collection<Integer> linePropIdList) {
        regINS(CK_INS, cTL(linePropIdList), xgetCValueLinePropId(), "line_prop_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @param linePropIdList The collection of linePropId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinePropId_NotInScope(Collection<Integer> linePropIdList) {
        doSetLinePropId_NotInScope(linePropIdList);
    }

    protected void doSetLinePropId_NotInScope(Collection<Integer> linePropIdList) {
        regINS(CK_NINS, cTL(linePropIdList), xgetCValueLinePropId(), "line_prop_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     */
    public void setLinePropId_IsNull() { regLinePropId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     */
    public void setLinePropId_IsNotNull() { regLinePropId(CK_ISNN, DOBJ); }

    protected void regLinePropId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinePropId(), "line_prop_id"); }
    protected abstract ConditionValue xgetCValueLinePropId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_Equal(String appKey) {
        doSetAppKey_Equal(fRES(appKey));
    }

    protected void doSetAppKey_Equal(String appKey) {
        regAppKey(CK_EQ, appKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_NotEqual(String appKey) {
        doSetAppKey_NotEqual(fRES(appKey));
    }

    protected void doSetAppKey_NotEqual(String appKey) {
        regAppKey(CK_NES, appKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_GreaterThan(String appKey) {
        regAppKey(CK_GT, fRES(appKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_LessThan(String appKey) {
        regAppKey(CK_LT, fRES(appKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_GreaterEqual(String appKey) {
        regAppKey(CK_GE, fRES(appKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_LessEqual(String appKey) {
        regAppKey(CK_LE, fRES(appKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKeyList The collection of appKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_InScope(Collection<String> appKeyList) {
        doSetAppKey_InScope(appKeyList);
    }

    protected void doSetAppKey_InScope(Collection<String> appKeyList) {
        regINS(CK_INS, cTL(appKeyList), xgetCValueAppKey(), "app_key");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKeyList The collection of appKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_NotInScope(Collection<String> appKeyList) {
        doSetAppKey_NotInScope(appKeyList);
    }

    protected void doSetAppKey_NotInScope(Collection<String> appKeyList) {
        regINS(CK_NINS, cTL(appKeyList), xgetCValueAppKey(), "app_key");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)} <br>
     * <pre>e.g. setAppKey_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param appKey The value of appKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAppKey_LikeSearch(String appKey, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAppKey_LikeSearch(appKey, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)} <br>
     * <pre>e.g. setAppKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param appKey The value of appKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAppKey_LikeSearch(String appKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(appKey), xgetCValueAppKey(), "app_key", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAppKey_NotLikeSearch(String appKey, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAppKey_NotLikeSearch(appKey, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * app_key: {UQ, NotNull, text(2147483647)}
     * @param appKey The value of appKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAppKey_NotLikeSearch(String appKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(appKey), xgetCValueAppKey(), "app_key", likeSearchOption);
    }

    protected void regAppKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAppKey(), "app_key"); }
    protected abstract ConditionValue xgetCValueAppKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_Equal(String responseType) {
        doSetResponseType_Equal(fRES(responseType));
    }

    protected void doSetResponseType_Equal(String responseType) {
        regResponseType(CK_EQ, responseType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_NotEqual(String responseType) {
        doSetResponseType_NotEqual(fRES(responseType));
    }

    protected void doSetResponseType_NotEqual(String responseType) {
        regResponseType(CK_NES, responseType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_GreaterThan(String responseType) {
        regResponseType(CK_GT, fRES(responseType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_LessThan(String responseType) {
        regResponseType(CK_LT, fRES(responseType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_GreaterEqual(String responseType) {
        regResponseType(CK_GE, fRES(responseType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_LessEqual(String responseType) {
        regResponseType(CK_LE, fRES(responseType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseTypeList The collection of responseType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_InScope(Collection<String> responseTypeList) {
        doSetResponseType_InScope(responseTypeList);
    }

    protected void doSetResponseType_InScope(Collection<String> responseTypeList) {
        regINS(CK_INS, cTL(responseTypeList), xgetCValueResponseType(), "response_type");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseTypeList The collection of responseType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResponseType_NotInScope(Collection<String> responseTypeList) {
        doSetResponseType_NotInScope(responseTypeList);
    }

    protected void doSetResponseType_NotInScope(Collection<String> responseTypeList) {
        regINS(CK_NINS, cTL(responseTypeList), xgetCValueResponseType(), "response_type");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]} <br>
     * <pre>e.g. setResponseType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param responseType The value of responseType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setResponseType_LikeSearch(String responseType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setResponseType_LikeSearch(responseType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]} <br>
     * <pre>e.g. setResponseType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param responseType The value of responseType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setResponseType_LikeSearch(String responseType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(responseType), xgetCValueResponseType(), "response_type", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setResponseType_NotLikeSearch(String responseType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setResponseType_NotLikeSearch(responseType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @param responseType The value of responseType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setResponseType_NotLikeSearch(String responseType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(responseType), xgetCValueResponseType(), "response_type", likeSearchOption);
    }

    protected void regResponseType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResponseType(), "response_type"); }
    protected abstract ConditionValue xgetCValueResponseType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_Equal(String clientId) {
        doSetClientId_Equal(fRES(clientId));
    }

    protected void doSetClientId_Equal(String clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(String clientId) {
        doSetClientId_NotEqual(fRES(clientId));
    }

    protected void doSetClientId_NotEqual(String clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(String clientId) {
        regClientId(CK_GT, fRES(clientId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_LessThan(String clientId) {
        regClientId(CK_LT, fRES(clientId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(String clientId) {
        regClientId(CK_GE, fRES(clientId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(String clientId) {
        regClientId(CK_LE, fRES(clientId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<String> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<String> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "client_id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<String> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<String> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "client_id");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_id: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clientId The value of clientId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientId_LikeSearch(String clientId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientId_LikeSearch(clientId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_id: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientId The value of clientId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setClientId_LikeSearch(String clientId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientId), xgetCValueClientId(), "client_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientId_NotLikeSearch(String clientId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientId_NotLikeSearch(clientId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setClientId_NotLikeSearch(String clientId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientId), xgetCValueClientId(), "client_id", likeSearchOption);
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "client_id"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_Equal(String redirectUri) {
        doSetRedirectUri_Equal(fRES(redirectUri));
    }

    protected void doSetRedirectUri_Equal(String redirectUri) {
        regRedirectUri(CK_EQ, redirectUri);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_NotEqual(String redirectUri) {
        doSetRedirectUri_NotEqual(fRES(redirectUri));
    }

    protected void doSetRedirectUri_NotEqual(String redirectUri) {
        regRedirectUri(CK_NES, redirectUri);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_GreaterThan(String redirectUri) {
        regRedirectUri(CK_GT, fRES(redirectUri));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_LessThan(String redirectUri) {
        regRedirectUri(CK_LT, fRES(redirectUri));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_GreaterEqual(String redirectUri) {
        regRedirectUri(CK_GE, fRES(redirectUri));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_LessEqual(String redirectUri) {
        regRedirectUri(CK_LE, fRES(redirectUri));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUriList The collection of redirectUri as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_InScope(Collection<String> redirectUriList) {
        doSetRedirectUri_InScope(redirectUriList);
    }

    protected void doSetRedirectUri_InScope(Collection<String> redirectUriList) {
        regINS(CK_INS, cTL(redirectUriList), xgetCValueRedirectUri(), "redirect_uri");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUriList The collection of redirectUri as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUri_NotInScope(Collection<String> redirectUriList) {
        doSetRedirectUri_NotInScope(redirectUriList);
    }

    protected void doSetRedirectUri_NotInScope(Collection<String> redirectUriList) {
        regINS(CK_NINS, cTL(redirectUriList), xgetCValueRedirectUri(), "redirect_uri");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setRedirectUri_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param redirectUri The value of redirectUri as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRedirectUri_LikeSearch(String redirectUri, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRedirectUri_LikeSearch(redirectUri, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setRedirectUri_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param redirectUri The value of redirectUri as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRedirectUri_LikeSearch(String redirectUri, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(redirectUri), xgetCValueRedirectUri(), "redirect_uri", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRedirectUri_NotLikeSearch(String redirectUri, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRedirectUri_NotLikeSearch(redirectUri, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * redirect_uri: {NotNull, text(2147483647)}
     * @param redirectUri The value of redirectUri as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRedirectUri_NotLikeSearch(String redirectUri, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(redirectUri), xgetCValueRedirectUri(), "redirect_uri", likeSearchOption);
    }

    protected void regRedirectUri(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRedirectUri(), "redirect_uri"); }
    protected abstract ConditionValue xgetCValueRedirectUri();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_Equal(String stateVal) {
        doSetStateVal_Equal(fRES(stateVal));
    }

    protected void doSetStateVal_Equal(String stateVal) {
        regStateVal(CK_EQ, stateVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_NotEqual(String stateVal) {
        doSetStateVal_NotEqual(fRES(stateVal));
    }

    protected void doSetStateVal_NotEqual(String stateVal) {
        regStateVal(CK_NES, stateVal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_GreaterThan(String stateVal) {
        regStateVal(CK_GT, fRES(stateVal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_LessThan(String stateVal) {
        regStateVal(CK_LT, fRES(stateVal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_GreaterEqual(String stateVal) {
        regStateVal(CK_GE, fRES(stateVal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_LessEqual(String stateVal) {
        regStateVal(CK_LE, fRES(stateVal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateValList The collection of stateVal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_InScope(Collection<String> stateValList) {
        doSetStateVal_InScope(stateValList);
    }

    protected void doSetStateVal_InScope(Collection<String> stateValList) {
        regINS(CK_INS, cTL(stateValList), xgetCValueStateVal(), "state_val");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateValList The collection of stateVal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStateVal_NotInScope(Collection<String> stateValList) {
        doSetStateVal_NotInScope(stateValList);
    }

    protected void doSetStateVal_NotInScope(Collection<String> stateValList) {
        regINS(CK_NINS, cTL(stateValList), xgetCValueStateVal(), "state_val");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * state_val: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setStateVal_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param stateVal The value of stateVal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStateVal_LikeSearch(String stateVal, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStateVal_LikeSearch(stateVal, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * state_val: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setStateVal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stateVal The value of stateVal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setStateVal_LikeSearch(String stateVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stateVal), xgetCValueStateVal(), "state_val", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setStateVal_NotLikeSearch(String stateVal, ConditionOptionCall<LikeSearchOption> opLambda) {
        setStateVal_NotLikeSearch(stateVal, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * state_val: {NotNull, text(2147483647)}
     * @param stateVal The value of stateVal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setStateVal_NotLikeSearch(String stateVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stateVal), xgetCValueStateVal(), "state_val", likeSearchOption);
    }

    protected void regStateVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStateVal(), "state_val"); }
    protected abstract ConditionValue xgetCValueStateVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_Equal(String scopeVal) {
        doSetScopeVal_Equal(fRES(scopeVal));
    }

    protected void doSetScopeVal_Equal(String scopeVal) {
        regScopeVal(CK_EQ, scopeVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_NotEqual(String scopeVal) {
        doSetScopeVal_NotEqual(fRES(scopeVal));
    }

    protected void doSetScopeVal_NotEqual(String scopeVal) {
        regScopeVal(CK_NES, scopeVal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_GreaterThan(String scopeVal) {
        regScopeVal(CK_GT, fRES(scopeVal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_LessThan(String scopeVal) {
        regScopeVal(CK_LT, fRES(scopeVal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_GreaterEqual(String scopeVal) {
        regScopeVal(CK_GE, fRES(scopeVal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_LessEqual(String scopeVal) {
        regScopeVal(CK_LE, fRES(scopeVal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeValList The collection of scopeVal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_InScope(Collection<String> scopeValList) {
        doSetScopeVal_InScope(scopeValList);
    }

    protected void doSetScopeVal_InScope(Collection<String> scopeValList) {
        regINS(CK_INS, cTL(scopeValList), xgetCValueScopeVal(), "scope_val");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeValList The collection of scopeVal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScopeVal_NotInScope(Collection<String> scopeValList) {
        doSetScopeVal_NotInScope(scopeValList);
    }

    protected void doSetScopeVal_NotInScope(Collection<String> scopeValList) {
        regINS(CK_NINS, cTL(scopeValList), xgetCValueScopeVal(), "scope_val");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scope_val: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setScopeVal_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param scopeVal The value of scopeVal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScopeVal_LikeSearch(String scopeVal, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScopeVal_LikeSearch(scopeVal, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scope_val: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setScopeVal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scopeVal The value of scopeVal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setScopeVal_LikeSearch(String scopeVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scopeVal), xgetCValueScopeVal(), "scope_val", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setScopeVal_NotLikeSearch(String scopeVal, ConditionOptionCall<LikeSearchOption> opLambda) {
        setScopeVal_NotLikeSearch(scopeVal, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * scope_val: {NotNull, text(2147483647)}
     * @param scopeVal The value of scopeVal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setScopeVal_NotLikeSearch(String scopeVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scopeVal), xgetCValueScopeVal(), "scope_val", likeSearchOption);
    }

    protected void regScopeVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScopeVal(), "scope_val"); }
    protected abstract ConditionValue xgetCValueScopeVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_Equal(String nonce) {
        doSetNonce_Equal(fRES(nonce));
    }

    protected void doSetNonce_Equal(String nonce) {
        regNonce(CK_EQ, nonce);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_NotEqual(String nonce) {
        doSetNonce_NotEqual(fRES(nonce));
    }

    protected void doSetNonce_NotEqual(String nonce) {
        regNonce(CK_NES, nonce);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_GreaterThan(String nonce) {
        regNonce(CK_GT, fRES(nonce));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_LessThan(String nonce) {
        regNonce(CK_LT, fRES(nonce));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_GreaterEqual(String nonce) {
        regNonce(CK_GE, fRES(nonce));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_LessEqual(String nonce) {
        regNonce(CK_LE, fRES(nonce));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonceList The collection of nonce as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_InScope(Collection<String> nonceList) {
        doSetNonce_InScope(nonceList);
    }

    protected void doSetNonce_InScope(Collection<String> nonceList) {
        regINS(CK_INS, cTL(nonceList), xgetCValueNonce(), "nonce");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonceList The collection of nonce as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNonce_NotInScope(Collection<String> nonceList) {
        doSetNonce_NotInScope(nonceList);
    }

    protected void doSetNonce_NotInScope(Collection<String> nonceList) {
        regINS(CK_NINS, cTL(nonceList), xgetCValueNonce(), "nonce");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * nonce: {text(2147483647)} <br>
     * <pre>e.g. setNonce_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param nonce The value of nonce as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNonce_LikeSearch(String nonce, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNonce_LikeSearch(nonce, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * nonce: {text(2147483647)} <br>
     * <pre>e.g. setNonce_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nonce The value of nonce as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setNonce_LikeSearch(String nonce, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nonce), xgetCValueNonce(), "nonce", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setNonce_NotLikeSearch(String nonce, ConditionOptionCall<LikeSearchOption> opLambda) {
        setNonce_NotLikeSearch(nonce, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * nonce: {text(2147483647)}
     * @param nonce The value of nonce as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setNonce_NotLikeSearch(String nonce, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nonce), xgetCValueNonce(), "nonce", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     */
    public void setNonce_IsNull() { regNonce(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     */
    public void setNonce_IsNullOrEmpty() { regNonce(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * nonce: {text(2147483647)}
     */
    public void setNonce_IsNotNull() { regNonce(CK_ISNN, DOBJ); }

    protected void regNonce(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNonce(), "nonce"); }
    protected abstract ConditionValue xgetCValueNonce();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_Equal(String prompt) {
        doSetPrompt_Equal(fRES(prompt));
    }

    protected void doSetPrompt_Equal(String prompt) {
        regPrompt(CK_EQ, prompt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_NotEqual(String prompt) {
        doSetPrompt_NotEqual(fRES(prompt));
    }

    protected void doSetPrompt_NotEqual(String prompt) {
        regPrompt(CK_NES, prompt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_GreaterThan(String prompt) {
        regPrompt(CK_GT, fRES(prompt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_LessThan(String prompt) {
        regPrompt(CK_LT, fRES(prompt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_GreaterEqual(String prompt) {
        regPrompt(CK_GE, fRES(prompt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_LessEqual(String prompt) {
        regPrompt(CK_LE, fRES(prompt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prompt: {text(2147483647)}
     * @param promptList The collection of prompt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_InScope(Collection<String> promptList) {
        doSetPrompt_InScope(promptList);
    }

    protected void doSetPrompt_InScope(Collection<String> promptList) {
        regINS(CK_INS, cTL(promptList), xgetCValuePrompt(), "prompt");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prompt: {text(2147483647)}
     * @param promptList The collection of prompt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrompt_NotInScope(Collection<String> promptList) {
        doSetPrompt_NotInScope(promptList);
    }

    protected void doSetPrompt_NotInScope(Collection<String> promptList) {
        regINS(CK_NINS, cTL(promptList), xgetCValuePrompt(), "prompt");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prompt: {text(2147483647)} <br>
     * <pre>e.g. setPrompt_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param prompt The value of prompt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrompt_LikeSearch(String prompt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrompt_LikeSearch(prompt, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prompt: {text(2147483647)} <br>
     * <pre>e.g. setPrompt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prompt The value of prompt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPrompt_LikeSearch(String prompt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prompt), xgetCValuePrompt(), "prompt", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrompt_NotLikeSearch(String prompt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrompt_NotLikeSearch(prompt, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prompt: {text(2147483647)}
     * @param prompt The value of prompt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPrompt_NotLikeSearch(String prompt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prompt), xgetCValuePrompt(), "prompt", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     */
    public void setPrompt_IsNull() { regPrompt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     */
    public void setPrompt_IsNullOrEmpty() { regPrompt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * prompt: {text(2147483647)}
     */
    public void setPrompt_IsNotNull() { regPrompt(CK_ISNN, DOBJ); }

    protected void regPrompt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrompt(), "prompt"); }
    protected abstract ConditionValue xgetCValuePrompt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_Equal(String botPrompt) {
        doSetBotPrompt_Equal(fRES(botPrompt));
    }

    protected void doSetBotPrompt_Equal(String botPrompt) {
        regBotPrompt(CK_EQ, botPrompt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_NotEqual(String botPrompt) {
        doSetBotPrompt_NotEqual(fRES(botPrompt));
    }

    protected void doSetBotPrompt_NotEqual(String botPrompt) {
        regBotPrompt(CK_NES, botPrompt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_GreaterThan(String botPrompt) {
        regBotPrompt(CK_GT, fRES(botPrompt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_LessThan(String botPrompt) {
        regBotPrompt(CK_LT, fRES(botPrompt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_GreaterEqual(String botPrompt) {
        regBotPrompt(CK_GE, fRES(botPrompt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_LessEqual(String botPrompt) {
        regBotPrompt(CK_LE, fRES(botPrompt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPromptList The collection of botPrompt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_InScope(Collection<String> botPromptList) {
        doSetBotPrompt_InScope(botPromptList);
    }

    protected void doSetBotPrompt_InScope(Collection<String> botPromptList) {
        regINS(CK_INS, cTL(botPromptList), xgetCValueBotPrompt(), "bot_prompt");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPromptList The collection of botPrompt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBotPrompt_NotInScope(Collection<String> botPromptList) {
        doSetBotPrompt_NotInScope(botPromptList);
    }

    protected void doSetBotPrompt_NotInScope(Collection<String> botPromptList) {
        regINS(CK_NINS, cTL(botPromptList), xgetCValueBotPrompt(), "bot_prompt");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bot_prompt: {text(2147483647)} <br>
     * <pre>e.g. setBotPrompt_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param botPrompt The value of botPrompt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBotPrompt_LikeSearch(String botPrompt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBotPrompt_LikeSearch(botPrompt, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bot_prompt: {text(2147483647)} <br>
     * <pre>e.g. setBotPrompt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param botPrompt The value of botPrompt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setBotPrompt_LikeSearch(String botPrompt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(botPrompt), xgetCValueBotPrompt(), "bot_prompt", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setBotPrompt_NotLikeSearch(String botPrompt, ConditionOptionCall<LikeSearchOption> opLambda) {
        setBotPrompt_NotLikeSearch(botPrompt, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * bot_prompt: {text(2147483647)}
     * @param botPrompt The value of botPrompt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setBotPrompt_NotLikeSearch(String botPrompt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(botPrompt), xgetCValueBotPrompt(), "bot_prompt", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     */
    public void setBotPrompt_IsNull() { regBotPrompt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     */
    public void setBotPrompt_IsNullOrEmpty() { regBotPrompt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * bot_prompt: {text(2147483647)}
     */
    public void setBotPrompt_IsNotNull() { regBotPrompt(CK_ISNN, DOBJ); }

    protected void regBotPrompt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBotPrompt(), "bot_prompt"); }
    protected abstract ConditionValue xgetCValueBotPrompt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_Equal(String clientSecret) {
        doSetClientSecret_Equal(fRES(clientSecret));
    }

    protected void doSetClientSecret_Equal(String clientSecret) {
        regClientSecret(CK_EQ, clientSecret);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_NotEqual(String clientSecret) {
        doSetClientSecret_NotEqual(fRES(clientSecret));
    }

    protected void doSetClientSecret_NotEqual(String clientSecret) {
        regClientSecret(CK_NES, clientSecret);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_GreaterThan(String clientSecret) {
        regClientSecret(CK_GT, fRES(clientSecret));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_LessThan(String clientSecret) {
        regClientSecret(CK_LT, fRES(clientSecret));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_GreaterEqual(String clientSecret) {
        regClientSecret(CK_GE, fRES(clientSecret));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_LessEqual(String clientSecret) {
        regClientSecret(CK_LE, fRES(clientSecret));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecretList The collection of clientSecret as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_InScope(Collection<String> clientSecretList) {
        doSetClientSecret_InScope(clientSecretList);
    }

    protected void doSetClientSecret_InScope(Collection<String> clientSecretList) {
        regINS(CK_INS, cTL(clientSecretList), xgetCValueClientSecret(), "client_secret");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecretList The collection of clientSecret as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_NotInScope(Collection<String> clientSecretList) {
        doSetClientSecret_NotInScope(clientSecretList);
    }

    protected void doSetClientSecret_NotInScope(Collection<String> clientSecretList) {
        regINS(CK_NINS, cTL(clientSecretList), xgetCValueClientSecret(), "client_secret");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_secret: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientSecret_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clientSecret The value of clientSecret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientSecret_LikeSearch(String clientSecret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientSecret_LikeSearch(clientSecret, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_secret: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientSecret_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientSecret The value of clientSecret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setClientSecret_LikeSearch(String clientSecret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientSecret), xgetCValueClientSecret(), "client_secret", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientSecret_NotLikeSearch(String clientSecret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientSecret_NotLikeSearch(clientSecret, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setClientSecret_NotLikeSearch(String clientSecret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientSecret), xgetCValueClientSecret(), "client_secret", likeSearchOption);
    }

    protected void regClientSecret(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientSecret(), "client_secret"); }
    protected abstract ConditionValue xgetCValueClientSecret();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_Equal(String grantType) {
        doSetGrantType_Equal(fRES(grantType));
    }

    protected void doSetGrantType_Equal(String grantType) {
        regGrantType(CK_EQ, grantType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_NotEqual(String grantType) {
        doSetGrantType_NotEqual(fRES(grantType));
    }

    protected void doSetGrantType_NotEqual(String grantType) {
        regGrantType(CK_NES, grantType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_GreaterThan(String grantType) {
        regGrantType(CK_GT, fRES(grantType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_LessThan(String grantType) {
        regGrantType(CK_LT, fRES(grantType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_GreaterEqual(String grantType) {
        regGrantType(CK_GE, fRES(grantType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_LessEqual(String grantType) {
        regGrantType(CK_LE, fRES(grantType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantTypeList The collection of grantType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_InScope(Collection<String> grantTypeList) {
        doSetGrantType_InScope(grantTypeList);
    }

    protected void doSetGrantType_InScope(Collection<String> grantTypeList) {
        regINS(CK_INS, cTL(grantTypeList), xgetCValueGrantType(), "grant_type");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantTypeList The collection of grantType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrantType_NotInScope(Collection<String> grantTypeList) {
        doSetGrantType_NotInScope(grantTypeList);
    }

    protected void doSetGrantType_NotInScope(Collection<String> grantTypeList) {
        regINS(CK_NINS, cTL(grantTypeList), xgetCValueGrantType(), "grant_type");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]} <br>
     * <pre>e.g. setGrantType_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param grantType The value of grantType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGrantType_LikeSearch(String grantType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGrantType_LikeSearch(grantType, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]} <br>
     * <pre>e.g. setGrantType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param grantType The value of grantType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setGrantType_LikeSearch(String grantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(grantType), xgetCValueGrantType(), "grant_type", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setGrantType_NotLikeSearch(String grantType, ConditionOptionCall<LikeSearchOption> opLambda) {
        setGrantType_NotLikeSearch(grantType, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @param grantType The value of grantType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setGrantType_NotLikeSearch(String grantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(grantType), xgetCValueGrantType(), "grant_type", likeSearchOption);
    }

    protected void regGrantType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrantType(), "grant_type"); }
    protected abstract ConditionValue xgetCValueGrantType();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LinePropertyMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, LinePropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LinePropertyMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, LinePropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LinePropertyMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, LinePropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LinePropertyMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, LinePropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LinePropertyMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, LinePropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LinePropertyMCB&gt;() {
     *     public void query(LinePropertyMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<LinePropertyMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, LinePropertyMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        LinePropertyMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(LinePropertyMCQ sq);

    protected LinePropertyMCB xcreateScalarConditionCB() {
        LinePropertyMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected LinePropertyMCB xcreateScalarConditionPartitionByCB() {
        LinePropertyMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<LinePropertyMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LinePropertyMCB cb = new LinePropertyMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "line_prop_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(LinePropertyMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LinePropertyMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(LinePropertyMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        LinePropertyMCB cb = new LinePropertyMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "line_prop_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(LinePropertyMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<LinePropertyMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        LinePropertyMCB cb = new LinePropertyMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(LinePropertyMCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected LinePropertyMCB newMyCB() {
        return new LinePropertyMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return LinePropertyMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
