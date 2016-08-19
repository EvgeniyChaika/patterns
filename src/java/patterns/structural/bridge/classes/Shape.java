package patterns.structural.bridge.classes;

import patterns.structural.bridge.DrawAPI;

/**
 * Created on 19.08.16.
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
