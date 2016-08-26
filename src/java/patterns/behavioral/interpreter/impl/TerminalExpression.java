package patterns.behavioral.interpreter.impl;

import patterns.behavioral.interpreter.Expression;

/**
 * Created on 26.08.16.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}