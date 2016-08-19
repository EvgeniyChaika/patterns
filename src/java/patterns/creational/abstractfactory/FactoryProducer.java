package patterns.creational.abstractfactory;

import patterns.creational.factorymethod.ShapeFactory;

/**
 * Created on 17.08.16.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(TypeFactory typeFactory){
        AbstractFactory factory = null;
        switch (typeFactory){
            case COLOR:
                factory = new ColorFactory();
                break;
            case SHAPE:
                factory = new ShapeFactory();
        }
        return factory;
    }
}
