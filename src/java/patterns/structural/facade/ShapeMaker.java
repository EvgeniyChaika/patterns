package patterns.structural.facade;

import patterns.structural.facade.impl.Circle;
import patterns.structural.facade.impl.Rectangle;
import patterns.structural.facade.impl.Square;

/**
 * Created on 25.08.16.
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
