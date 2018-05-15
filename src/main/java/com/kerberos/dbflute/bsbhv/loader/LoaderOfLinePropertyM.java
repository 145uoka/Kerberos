package com.kerberos.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.kerberos.dbflute.exbhv.*;
import com.kerberos.dbflute.exentity.*;

/**
 * The referrer loader of line_property_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     line_prop_id
 *
 * [column]
 *     line_prop_id, app_key, response_type, client_id, redirect_uri, scope_val, nonce, prompt, bot_prompt, client_secret, grant_type, delete_flag, register_datetime, update_datetime
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLinePropertyM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LinePropertyM> _selectedList;
    protected BehaviorSelector _selector;
    protected LinePropertyMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLinePropertyM ready(List<LinePropertyM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LinePropertyMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LinePropertyMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<LinePropertyM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
