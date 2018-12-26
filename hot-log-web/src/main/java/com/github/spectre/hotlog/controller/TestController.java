package com.github.spectre.hotlog.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/12/23 21:38.
 */
@RestController
public class TestController {

    @GetMapping(value = "test")
    public String test(@RequestParam String str) {
        Logger logger = Logger.getLogger(TestController.class.getName());
        logger.log(Level.INFO,str);
        logger.log(Level.FINE,str);
        logger.info("test application");
        Log log = LogFactory.getLog(TestController.class);
        log.info("log");
        log.debug("debug");
//		logger.addHandler();
//		logger.log();
//		logger.info();
        return str;
    }
}
