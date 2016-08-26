package patterns.behavioral.interpreter;

import patterns.behavioral.interpreter.impl.AndExpression;
import patterns.behavioral.interpreter.impl.OrExpression;
import patterns.behavioral.interpreter.impl.TerminalExpression;

/**
 * Created on 26.08.16.
 */
public class CheckExpression {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julia = new TerminalExpression("Julia");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julia, married);
    }
}