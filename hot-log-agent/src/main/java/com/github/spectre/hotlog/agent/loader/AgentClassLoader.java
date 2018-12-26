package com.github.spectre.hotlog.agent.loader;

import java.util.logging.Logger;

/**
 * agent classloader
 * load classes for the agent
 *
 * @author:wanyang1
 * @date:2018/12/25 14:53
 */
public class AgentClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
