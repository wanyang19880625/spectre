package com.github.spectre.aol.agent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/11/28 22:15.
 */
public class AgentTest {

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("Agent premain args:"+args);
    }

    public static void agentmain(String args, Instrumentation instrumentation) {
        System.out.println("Agent agentmain args:"+args);
        instrumentation.addTransformer(new ClassFileTransformer() {

            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
                                    ProtectionDomain protectionDomain, byte[] classfileBuffer)
                    throws IllegalClassFormatException {
                System.out.println("agentmain load Class  :" + className);
                return classfileBuffer;
            }
        }, true);
//        instrumentation.retransformClasses(Account.class);
    }
}
