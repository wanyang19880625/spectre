package com.github.spectre.aol.agent.myagent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/12/23 22:08.
 */
@Controller
public class TestNormalController {

    @GetMapping(value = "id")
    @ResponseBody
    public void test(@RequestParam("user") String id) {
        System.out.println(id);
    }
}
