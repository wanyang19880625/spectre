package com.github.spectre.hotlog.agent.log;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * @author:wanyang1
 * @date:2018/12/25 18:49
 */
public class AgentLogRecord extends LogRecord {

    public AgentLogRecord(Level level, String msg) {
        super(level, msg);
    }

    public void write(){
        LogRecord record = new LogRecord(this.getLevel(), this.getMessage());
        record.setThreadID(this.getThreadID());
        record.setLoggerName(this.getLoggerName());
    }
}
