package patterns.creational.builder.classes.item.impl;

import patterns.creational.builder.classes.item.Item;
import patterns.creational.builder.classes.packing.Packing;
import patterns.creational.builder.classes.packing.impl.Wrapper;

/**
 * Created on 18.08.16.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
