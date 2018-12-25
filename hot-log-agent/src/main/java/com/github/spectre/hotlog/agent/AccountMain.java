package com.github.spectre.hotlog.agent;

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
