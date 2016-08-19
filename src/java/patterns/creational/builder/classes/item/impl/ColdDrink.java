package patterns.creational.builder.classes.item.impl;

import patterns.creational.builder.classes.item.Item;
import patterns.creational.builder.classes.packing.Packing;
import patterns.creational.builder.classes.packing.impl.Bottle;

/**
 * Created on 18.08.16.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
