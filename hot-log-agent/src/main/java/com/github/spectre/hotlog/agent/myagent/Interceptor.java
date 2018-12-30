package com.github.spectre.hotlog.agent.myagent;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

import net.bytebuddy.implementation.bind.annotation.*;
import org.slf4j.Logger;

import com.alibaba.fastjson.JSON;
import com.github.spectre.hotlog.agent.log.AgentLoggerFactory;

import org.springframework.stereotype.Controller;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/12/8 14:38.
 */
public class Interceptor {

    private static final Logger logger = AgentLoggerFactory.getLogger(Interceptor.class);

    @RuntimeType
    public static Object intercept(@This Object obj, @Origin Method method, @SuperCall Callable<?> callable, @AllArguments Object[] allArguments)
            throws Exception {
        EnhanceInstance enhanceInstance = (EnhanceInstance)obj;
        Annotation[] annotations = method.getDeclaringClass().getDeclaredAnnotations();
        for (Annotation annotation:annotations) {
            logger.info("name:"+annotation.annotationType().getSimpleName());
        }
        try {
            if (null != allArguments && 0 != allArguments.length) {
                for (Object args : allArguments) {
                    logger.info(method + ":" + JSON.toJSONString(args));
                }
            }
        } catch (Exception e) {

        } finally {
            // 原有函数执行
            Object object = callable.call();
            if (null != object) {
                logger.info(method + ":" + object.toString());
            }
            return object;
        }
    }
}
