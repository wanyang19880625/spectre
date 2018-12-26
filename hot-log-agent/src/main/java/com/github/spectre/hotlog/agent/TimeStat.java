package com.github.spectre.hotlog.agent;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/12/2 23:26.
 */
public class TimeStat {

    static ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();
    public static void start() {
        threadLocal.set(System.currentTimeMillis());
    }
    public static void end() {
        long time = System.currentTimeMillis() - threadLocal.get();
        System.out.print(Thread.currentThread().getStackTrace()[2] + "方法耗费时间: ");
        System.out.println(time + "毫秒");
    }

}
