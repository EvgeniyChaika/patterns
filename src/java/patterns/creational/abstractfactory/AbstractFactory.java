package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.classes.Color;
import patterns.creational.abstractfactory.classes.TypeColor;
import patterns.creational.factorymethod.classes.Shape;
import patterns.creational.factorymethod.classes.TypeShape;

/**
 * Created on 17.08.16.
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(TypeShape shapeType);

    public abstract Color getColor(TypeColor colorType);
}
