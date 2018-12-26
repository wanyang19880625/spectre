package com.github.spectre.hotlog.agent.log;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * @author:wanyang1
 * @date:2018/12/26 10:42
 */
public class AgentLogFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getLoggerName()+record.getLevel();
    }
}
