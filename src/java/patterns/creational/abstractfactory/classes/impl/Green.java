package patterns.creational.abstractfactory.classes.impl;

import patterns.creational.abstractfactory.classes.Color;

/**
 * Created on 17.08.16.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
