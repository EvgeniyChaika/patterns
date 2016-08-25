package patterns.behavioral;

import patterns.behavioral.chainofresponsibility.AbstractLogger;
import patterns.behavioral.chainofresponsibility.LoggerFactory;

/**
 * Created on 25.08.16.
 */
public class StartBehavioral {

    public static void main(String[] args) {

//------------------------------------ Chain of responsibility -----------------------------------------------

        AbstractLogger loggerChain = LoggerFactory.getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
        System.out.println("");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
