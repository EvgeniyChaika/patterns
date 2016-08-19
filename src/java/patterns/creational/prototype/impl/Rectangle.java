package patterns.creational.prototype.impl;

import patterns.creational.prototype.Shape;

/**
 * Created on 18.08.16.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
