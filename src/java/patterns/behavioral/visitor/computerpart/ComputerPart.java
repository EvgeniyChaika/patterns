package patterns.behavioral.visitor.computerpart;

import patterns.behavioral.visitor.computerpartvisitor.ComputerPartVisitor;

/**
 * Created on 29.08.16.
 */
public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
