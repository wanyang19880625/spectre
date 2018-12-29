package com.github.spectre.hotlog.agent.loader;

import com.github.spectre.hotlog.agent.myagent.HotLogAgent;

/**
 * hot log agent classloader
 * load classes for the agent
 *
 * @author:wanyang1
 * @date:2018/12/25 14:53
 */
public class HotLogClassLoader extends ClassLoader {

    private static volatile HotLogClassLoader hotLogClassLoader;

    public HotLogClassLoader(ClassLoader parent) {
        super(parent);
    }

    public static HotLogClassLoader getClassLoader() {
        if (null == hotLogClassLoader) {
            synchronized (HotLogClassLoader.class) {
                if (null == hotLogClassLoader) {
                    hotLogClassLoader = new HotLogClassLoader(HotLogAgent.class.getClassLoader());
                }
            }
        }

        return hotLogClassLoader;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
