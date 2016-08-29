package patterns.behavioral.visitor.computerpartvisitor;

import patterns.behavioral.visitor.computerpart.impl.Computer;
import patterns.behavioral.visitor.computerpart.impl.Keyboard;
import patterns.behavioral.visitor.computerpart.impl.Monitor;
import patterns.behavioral.visitor.computerpart.impl.Mouse;

/**
 * Created on 29.08.16.
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Monitor monitor);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);
}
