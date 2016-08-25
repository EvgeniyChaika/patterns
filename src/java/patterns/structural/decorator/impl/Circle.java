package patterns.structural.decorator.impl;

import patterns.structural.decorator.Shape;

/**
 * Created on 25.08.16.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape : Circle");
    }
}
