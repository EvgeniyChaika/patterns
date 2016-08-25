package patterns.structural.facade.impl;

import patterns.structural.facade.Shape;

/**
 * Created on 25.08.16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle : draw()");
    }
}
