package patterns.behavioral.visitor.computerpartvisitor.impl;

import patterns.behavioral.visitor.computerpart.impl.Computer;
import patterns.behavioral.visitor.computerpart.impl.Keyboard;
import patterns.behavioral.visitor.computerpart.impl.Monitor;
import patterns.behavioral.visitor.computerpart.impl.Mouse;
import patterns.behavioral.visitor.computerpartvisitor.ComputerPartVisitor;

/**
 * Created on 29.08.16.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }
}
