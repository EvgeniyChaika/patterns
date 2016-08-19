package patterns.structural.bridge.classes.impl;

import patterns.structural.bridge.DrawAPI;
import patterns.structural.bridge.classes.Shape;

/**
 * Created on 19.08.16.
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
