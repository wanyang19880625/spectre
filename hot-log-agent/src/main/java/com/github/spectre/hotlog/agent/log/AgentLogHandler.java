package com.github.spectre.hotlog.agent.log;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/**
 * @author:wanyang1
 * @date:2018/12/26 10:16
 */
public class AgentLogHandler extends StreamHandler {

    public AgentLogHandler(){
        setOutputStream(System.out);
        setFormatter(new AgentLogFormatter());
    }

    @Override
    public synchronized void publish(LogRecord record) {
        super.publish(record);
        flush();
    }
}
