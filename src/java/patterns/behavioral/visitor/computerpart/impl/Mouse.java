package patterns.behavioral.visitor.computerpart.impl;

import patterns.behavioral.visitor.computerpart.ComputerPart;
import patterns.behavioral.visitor.computerpartvisitor.ComputerPartVisitor;

/**
 * Created on 29.08.16.
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
