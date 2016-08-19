package patterns.creational.builder.classes.packing.impl;

import patterns.creational.builder.classes.packing.Packing;

/**
 * Created on 18.08.16.
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
