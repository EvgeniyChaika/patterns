package patterns.behavioral.chainofresponsibility.impl;

import patterns.behavioral.chainofresponsibility.AbstractLogger;

/**
 * Created on 25.08.16.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standart Console : Logger " + message);
    }
}
