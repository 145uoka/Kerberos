package com.kerberos.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 呼び覚ましのコントローラー．
 *
 */
@RestController
public class WakeUpRestController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/api/wakeup", method = RequestMethod.GET)
    @ResponseBody
    public String wakeup() {

        logger.debug("[CALL] : WakeUP!!");

        return "success";
    }
}
