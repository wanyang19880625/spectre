package com.github.spectre.hotlog.agent.myagent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println(str);
        return str;
    }
}
