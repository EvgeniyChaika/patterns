package patterns.creational.builder.classes.impl;

import patterns.creational.builder.classes.item.impl.ColdDrink;

/**
 * Created on 18.08.16.
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
