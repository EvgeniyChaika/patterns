package patterns.behavioral.chainofresponsibility.impl;

import patterns.behavioral.chainofresponsibility.AbstractLogger;

/**
 * Created on 25.08.16.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File : Logger " + message);
    }
}
