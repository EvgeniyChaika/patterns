package patterns.behavioral.chainofresponsibility;

import patterns.behavioral.chainofresponsibility.impl.ConsoleLogger;
import patterns.behavioral.chainofresponsibility.impl.ErrorLogger;
import patterns.behavioral.chainofresponsibility.impl.FileLogger;

/**
 * Created on 25.08.16.
 */
public class LoggerFactory {

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
