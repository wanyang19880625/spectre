package com.github.spectre.hotlog.controller;

import com.github.spectre.hotlog.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private TestService testService;

    @GetMapping(value = "test")
    public String test(@RequestParam String str) {
        testService.hello("hello");
        return "result:"+str;
    }
}
