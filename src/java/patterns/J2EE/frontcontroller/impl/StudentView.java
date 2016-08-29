package patterns.J2EE.frontcontroller.impl;

import patterns.J2EE.frontcontroller.View;

/**
 * Created on 29.08.16.
 */
public class StudentView implements View {

    @Override
    public void show() {
        System.out.println("Displaying Student Page");
    }
}
