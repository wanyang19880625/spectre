package com.github.spectre.hotlog.service.impl;

import com.github.spectre.hotlog.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author:wanyang1
 * @date:2018/12/30 18:21
 */
@Service
public class TestServiceImpl implements TestService{

    public String hello(String hello) {
        return hello;
    }
}
