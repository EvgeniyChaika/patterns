package patterns.behavioral.strategy.impl;

import patterns.behavioral.strategy.Strategy;

/**
 * Created on 29.08.16.
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
