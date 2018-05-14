package com.kerberos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.support.WebContentGenerator;

import com.kerberos.dto.UserInfoDto;

/**
 * コントローラ基底クラス
 * 画面の制御処理
 *
 * @author kawata
 * @version 1.0
 */
@SessionAttributes({"scopedTarget.userInfo"})
public abstract class BaseController extends WebContentGenerator {

    @Autowired
    protected MessageSource messageSource;

    @Autowired
    protected UserInfoDto userInfo;

    /**
     * formキー
     */
    protected static final String MODEL_KEY_FORM = "form";

    public static final String ERRORS_MODEL_KEY = BindingResult.MODEL_KEY_PREFIX + MODEL_KEY_FORM;

    /**
     * リダイレクトパスの生成。
     * @param path リダイレクト先
     * @return リダイレクト指定文字列
     */
    protected String redirect(String path) {
        return "redirect:" + path;
    }

    /**
     * フォワードパスの生成。
     * @param path フォワード先
     * @return フォワード指定文字列
     */
    protected String forward(String path) {
        return "forward:" + path;
    }

    /**
     * セッションユーザ情報取得
     *
     * @return ユーザ情報
     */
    protected UserInfoDto getUserInfo() {
        return userInfo;
    }

    /**
     * Controllerに送信できるリストのサイズはデフォルトで256のため、拡張する.
     *
     * @param dataBinder
     */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        // this will allow 10000 size of array.
        dataBinder.setAutoGrowCollectionLimit(100000);
    }

}
