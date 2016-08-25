package patterns.behavioral.chainofresponsibility.impl;

import patterns.behavioral.chainofresponsibility.AbstractLogger;

/**
 * Created on 25.08.16.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console : Logger " + message);
    }
}
