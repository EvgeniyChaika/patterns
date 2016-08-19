package patterns.creational.builder;

import patterns.creational.builder.classes.impl.ChickenBurger;
import patterns.creational.builder.classes.impl.Coke;
import patterns.creational.builder.classes.impl.Pepsi;
import patterns.creational.builder.classes.impl.VegBurger;

/**
 * Created on 18.08.16.
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
