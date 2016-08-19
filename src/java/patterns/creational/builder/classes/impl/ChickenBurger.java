package patterns.creational.builder.classes.impl;

import patterns.creational.builder.classes.item.impl.Burger;

/**
 * Created on 18.08.16.
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
