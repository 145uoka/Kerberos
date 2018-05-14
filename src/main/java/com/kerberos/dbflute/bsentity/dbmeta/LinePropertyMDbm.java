package com.kerberos.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.kerberos.dbflute.allcommon.*;
import com.kerberos.dbflute.exentity.*;

/**
 * The DB meta of line_property_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LinePropertyMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LinePropertyMDbm _instance = new LinePropertyMDbm();
    private LinePropertyMDbm() {}
    public static LinePropertyMDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getLinePropId(), (et, vl) -> ((LinePropertyM)et).setLinePropId(cti(vl)), "linePropId");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getAppKey(), (et, vl) -> ((LinePropertyM)et).setAppKey((String)vl), "appKey");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getResponseType(), (et, vl) -> ((LinePropertyM)et).setResponseType((String)vl), "responseType");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getClientId(), (et, vl) -> ((LinePropertyM)et).setClientId((String)vl), "clientId");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getRedirectUri(), (et, vl) -> ((LinePropertyM)et).setRedirectUri((String)vl), "redirectUri");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getStateVal(), (et, vl) -> ((LinePropertyM)et).setStateVal((String)vl), "stateVal");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getScopeVal(), (et, vl) -> ((LinePropertyM)et).setScopeVal((String)vl), "scopeVal");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getNonce(), (et, vl) -> ((LinePropertyM)et).setNonce((String)vl), "nonce");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getPrompt(), (et, vl) -> ((LinePropertyM)et).setPrompt((String)vl), "prompt");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getBotPrompt(), (et, vl) -> ((LinePropertyM)et).setBotPrompt((String)vl), "botPrompt");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getDeleteFlag(), (et, vl) -> ((LinePropertyM)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getRegisterDatetime(), (et, vl) -> ((LinePropertyM)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getUpdateDatetime(), (et, vl) -> ((LinePropertyM)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getClientSecret(), (et, vl) -> ((LinePropertyM)et).setClientSecret((String)vl), "clientSecret");
        setupEpg(_epgMap, et -> ((LinePropertyM)et).getGrantType(), (et, vl) -> ((LinePropertyM)et).setGrantType((String)vl), "grantType");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "line_property_m";
    protected final String _tableDispName = "line_property_m";
    protected final String _tablePropertyName = "linePropertyM";
    protected final TableSqlName _tableSqlName = new TableSqlName("line_property_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnLinePropId = cci("line_prop_id", "line_prop_id", null, null, Integer.class, "linePropId", null, true, true, true, "serial", 10, 0, null, "nextval('line_property_m_line_prop_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAppKey = cci("app_key", "app_key", null, null, String.class, "appKey", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResponseType = cci("response_type", "response_type", null, null, String.class, "responseType", null, false, false, true, "text", 2147483647, 0, null, "'code'::text", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("client_id", "client_id", null, null, String.class, "clientId", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRedirectUri = cci("redirect_uri", "redirect_uri", null, null, String.class, "redirectUri", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStateVal = cci("state_val", "state_val", null, null, String.class, "stateVal", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScopeVal = cci("scope_val", "scope_val", null, null, String.class, "scopeVal", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNonce = cci("nonce", "nonce", null, null, String.class, "nonce", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrompt = cci("prompt", "prompt", null, null, String.class, "prompt", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBotPrompt = cci("bot_prompt", "bot_prompt", null, null, String.class, "botPrompt", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientSecret = cci("client_secret", "client_secret", null, null, String.class, "clientSecret", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGrantType = cci("grant_type", "grant_type", null, null, String.class, "grantType", null, false, false, true, "text", 2147483647, 0, null, "'authorization_code。付与タイプを指定します。'::text", false, null, null, null, null, null, false);

    /**
     * line_prop_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLinePropId() { return _columnLinePropId; }
    /**
     * app_key: {UQ, NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAppKey() { return _columnAppKey; }
    /**
     * response_type: {NotNull, text(2147483647), default=['code'::text]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResponseType() { return _columnResponseType; }
    /**
     * client_id: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * redirect_uri: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRedirectUri() { return _columnRedirectUri; }
    /**
     * state_val: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStateVal() { return _columnStateVal; }
    /**
     * scope_val: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScopeVal() { return _columnScopeVal; }
    /**
     * nonce: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNonce() { return _columnNonce; }
    /**
     * prompt: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrompt() { return _columnPrompt; }
    /**
     * bot_prompt: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBotPrompt() { return _columnBotPrompt; }
    /**
     * delete_flag: {NotNull, bool(1), default=[false]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlag() { return _columnDeleteFlag; }
    /**
     * register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * update_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * client_secret: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientSecret() { return _columnClientSecret; }
    /**
     * grant_type: {NotNull, text(2147483647), default=['authorization_code。付与タイプを指定します。'::text]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGrantType() { return _columnGrantType; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnLinePropId());
        ls.add(columnAppKey());
        ls.add(columnResponseType());
        ls.add(columnClientId());
        ls.add(columnRedirectUri());
        ls.add(columnStateVal());
        ls.add(columnScopeVal());
        ls.add(columnNonce());
        ls.add(columnPrompt());
        ls.add(columnBotPrompt());
        ls.add(columnDeleteFlag());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        ls.add(columnClientSecret());
        ls.add(columnGrantType());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnLinePropId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnAppKey()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "line_property_m_line_prop_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.kerberos.dbflute.exentity.LinePropertyM"; }
    public String getConditionBeanTypeName() { return "com.kerberos.dbflute.cbean.LinePropertyMCB"; }
    public String getBehaviorTypeName() { return "com.kerberos.dbflute.exbhv.LinePropertyMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LinePropertyM> getEntityType() { return LinePropertyM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LinePropertyM newEntity() { return new LinePropertyM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((LinePropertyM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((LinePropertyM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
