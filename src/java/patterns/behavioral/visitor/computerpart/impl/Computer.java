package patterns.behavioral.visitor.computerpart.impl;

import patterns.behavioral.visitor.computerpart.ComputerPart;
import patterns.behavioral.visitor.computerpartvisitor.ComputerPartVisitor;

/**
 * Created on 29.08.16.
 */
public class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart : parts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
