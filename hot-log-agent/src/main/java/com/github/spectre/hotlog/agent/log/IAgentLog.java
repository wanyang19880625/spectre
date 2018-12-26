package com.github.spectre.hotlog.agent.log;

/**
 * agent log interface
 * just like {@link org.apache.commons.logging.Log}
 *
 * @author:wanyang1
 * @date:2018/12/25 15:39
 */
public interface IAgentLog {

    void error(Object object);

    void error(Object object, Throwable throwable);

    void warn(Object object);

    void warn(Object object, Throwable throwable);

    void info(Object object);

    void info(Object object, Throwable throwable);

    void debug(Object object);

    void debug(Object object, Throwable throwable);

}
