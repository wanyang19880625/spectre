package com.github.spectre.hotlog.agent.myagent;

import com.alibaba.fastjson.JSON;
import net.bytebuddy.implementation.bind.annotation.AllArguments;
import net.bytebuddy.implementation.bind.annotation.Origin;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import net.bytebuddy.implementation.bind.annotation.SuperCall;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/12/8 14:38.
 */
public class TimeInterceptor {
    @RuntimeType
    public static Object intercept(@Origin Method method, @SuperCall Callable<?> callable,@AllArguments Object[] allArguments)
            throws Exception {
        long start = System.currentTimeMillis();

        System.out.println(method+":"+JSON.toJSONString(allArguments));
        try {
            // 原有函数执行
            Object object = callable.call();
            System.out.println(JSON.toJSONString(object));
            return object;
        } finally {
            System.out.println(method + ": took " + (System.currentTimeMillis() - start) + "ms");
        }
    }
}
