package patterns.J2EE.frontcontroller;

import patterns.J2EE.frontcontroller.impl.HomeView;
import patterns.J2EE.frontcontroller.impl.StudentView;

/**
 * Created on 29.08.16.
 */
public class Dispather {

    private HomeView homeView;

    private StudentView studentView;

    public Dispather() {
        this.homeView = new HomeView();
        this.studentView = new StudentView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
