package com.github.spectre.hotlog.agent.loader;

/**
 * @author:wanyang1
 * @date:2018/12/25 14:53
 */
public class AgentClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
