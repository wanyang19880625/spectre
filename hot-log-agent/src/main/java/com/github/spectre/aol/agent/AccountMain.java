package com.github.spectre.aol.agent;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/11/29 23:41.
 */
public class AccountMain {

    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            new Account().operation();
            Thread.sleep(5000);
        }

    }
}
