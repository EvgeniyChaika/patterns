package patterns.creational.factorymethod;

import patterns.creational.abstractfactory.AbstractFactory;
import patterns.creational.abstractfactory.classes.Color;
import patterns.creational.abstractfactory.classes.TypeColor;
import patterns.creational.factorymethod.classes.Shape;
import patterns.creational.factorymethod.classes.TypeShape;
import patterns.creational.factorymethod.classes.impl.Circle;
import patterns.creational.factorymethod.classes.impl.Rectangle;
import patterns.creational.factorymethod.classes.impl.Square;

/**
 * Created on 17.08.16.
 */
public class ShapeFactory extends AbstractFactory{

    //use getShape method to get object of type shape
    @Override
    public Shape getShape(TypeShape shapeType){
        Shape shape = null;
        switch (shapeType) {
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
        }
        return shape;
    }

    @Override
    public Color getColor(TypeColor colorType){
        return null;
    }
}
