package patterns.creational.factorymethod.classes.impl;

import patterns.creational.factorymethod.classes.Shape;

/**
 * Created on 17.08.16.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
