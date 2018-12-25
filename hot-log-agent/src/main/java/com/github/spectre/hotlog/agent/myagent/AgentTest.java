package com.github.spectre.hotlog.agent.myagent;

/**
 * Author:wanyang
 * Mail:wanyangnumberone@aliyun.com
 * https://github.com/wanyang19880625
 * Created by wanyang on 2018/12/8 14:46.
 */
public class AgentTest {

    private void fun1(String str) throws Exception {
        System.out.println("this is fun 1.");
        Thread.sleep(500);
    }

    private void fun2(String str) throws Exception {
        System.out.println("this is fun 2.");
        Thread.sleep(500);
    }

    private void fun3(TestArgs args) throws Exception{
        System.out.println("this is fun 3");
        Thread.sleep(500);
    }

    public static void main(String[] args) throws Exception {
        AgentTest test = new AgentTest();
        test.fun1("fun1 test");
        test.fun2("fun2 test");
        TestArgs args1 = new TestArgs();
        args1.setId(1);
        args1.setName("fun3 test");
        test.fun3(args1);
    }
}
