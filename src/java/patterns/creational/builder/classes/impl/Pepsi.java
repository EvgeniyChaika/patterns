package patterns.creational.builder.classes.impl;

import patterns.creational.builder.classes.item.impl.ColdDrink;

/**
 * Created on 18.08.16.
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
