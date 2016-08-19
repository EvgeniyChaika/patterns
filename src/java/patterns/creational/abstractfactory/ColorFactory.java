package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.classes.Color;
import patterns.creational.abstractfactory.classes.TypeColor;
import patterns.creational.abstractfactory.classes.impl.Blue;
import patterns.creational.abstractfactory.classes.impl.Green;
import patterns.creational.abstractfactory.classes.impl.Red;
import patterns.creational.factorymethod.classes.Shape;
import patterns.creational.factorymethod.classes.TypeShape;

/**
 * Created on 17.08.16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(TypeShape shapeType) {
        return null;
    }

    @Override
    public Color getColor(TypeColor colorType) {

        Color color = null;
        switch (colorType){
            case RED:
                color = new Red();
                break;
            case BLUE:
                color = new Blue();
                break;
            case GREEN:
                color = new Green();
                break;
        }
        return color;
    }
}
