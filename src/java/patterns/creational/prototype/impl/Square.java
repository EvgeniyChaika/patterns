package patterns.creational.prototype.impl;

import patterns.creational.prototype.Shape;

/**
 * Created on 18.08.16.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
