package patterns.creational.builder.classes.item;

import patterns.creational.builder.classes.packing.Packing;

/**
 * Created on 18.08.16.
 */
public interface Item {

    public String name();

    public Packing packing();

    public float price();
}
