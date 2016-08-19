package patterns.creational.builder.classes.impl;

import patterns.creational.builder.classes.item.impl.Burger;

/**
 * Created on 18.08.16.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
