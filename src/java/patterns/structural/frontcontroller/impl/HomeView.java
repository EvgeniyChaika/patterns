package patterns.structural.frontcontroller.impl;

import patterns.structural.frontcontroller.View;

/**
 * Created on 29.08.16.
 */
public class HomeView implements View {

    @Override
    public void show() {
        System.out.println("Displaying Home Page");
    }
}
