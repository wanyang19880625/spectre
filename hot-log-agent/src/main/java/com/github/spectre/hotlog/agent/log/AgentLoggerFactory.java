package com.github.spectre.hotlog.agent.log;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

/**
 * @author:wanyang1
 * @date:2018/12/26 18:08
 */
public class AgentLoggerFactory {

    private static final String project = "hot-log-agent";

    public static Logger getLogger(String name) {
        Logger logger = (Logger) LoggerFactory.getLogger(name);
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern("[" + project
                + "]%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] [%-5level] %logger{30}.%method:%line [%X{reqKey}] - %msg%n");
        encoder.start();

        ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<ILoggingEvent>();
        consoleAppender.setContext(loggerContext);
        consoleAppender.setEncoder(encoder);
        consoleAppender.start();

        logger.addAppender(consoleAppender);
        logger.setLevel(Level.INFO);
        logger.setAdditive(false);
        return logger;
    }

    public static Logger getLogger(Class<?> clazz) {
        Logger logger = getLogger(clazz.getName());

        return logger;
    }
}
