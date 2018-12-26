package com.github.spectre.hotlog.agent.myagent;

import java.lang.instrument.Instrumentation;

import ch.qos.logback.classic.PatternLayout;
import com.github.spectre.hotlog.agent.log.AgentLoggerFactory;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.JavaModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/12/8 14:37.
 */
public class HotLogAgent {

    private static final Logger logger = AgentLoggerFactory.getLogger(HotLogAgent.class);

    public static void premain(String agentArgs, Instrumentation inst) {
        logger.info("Hot log agent start...");

        AgentBuilder.Transformer transformer = new AgentBuilder.Transformer() {
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader) {
                return builder
                        .method(ElementMatchers.any()) // 拦截任意方法
                        .intercept(MethodDelegation.to(TimeInterceptor.class)); // 委托
            }
        };

        AgentBuilder.Listener listener = new AgentBuilder.Listener() {
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module, DynamicType dynamicType) {
                
            }

            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule module) {

            }

            public void onError(String typeName, ClassLoader classLoader, JavaModule module, Throwable throwable) {

            }

            public void onComplete(String typeName, ClassLoader classLoader, JavaModule module) {

            }
        };

        new AgentBuilder
                .Default()
                .type(ElementMatchers.nameStartsWith("com.github.spectre.hotlog.agent.myagent")) // 指定需要拦截的类
                .transform(transformer)
                .with(listener)
                .installOn(inst);
    }
}
