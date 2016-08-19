package patterns.creational.prototype.impl;

import patterns.creational.prototype.Shape;

/**
 * Created on 18.08.16.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
