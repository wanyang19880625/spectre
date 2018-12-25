package com.github.spectre.hotlog.agent;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/11/29 23:42.
 */
public class Account {

    public void operation() {
        System.out.println("operation...");
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
