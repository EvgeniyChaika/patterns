package patterns.J2EE;

import patterns.J2EE.mvc.StudentFactory;
import patterns.J2EE.mvc.controller.StudentConroller;
import patterns.J2EE.mvc.model.Student;
import patterns.J2EE.mvc.view.StudentView;

/**
 * Created on 29.08.16.
 */
public class StartJ2EE {

    public static void main(String[] args) {

//--------------------------------------- Model-View-Controller -----------------------------------------------

        Student model = StudentFactory.retriveStudentFromDatabase();
        StudentView studentView = new StudentView();
        StudentConroller studentConroller = new StudentConroller(model, studentView);

        studentConroller.updateView();
        studentConroller.setStudentName("Evgeniy");
        studentConroller.updateView();

//------------------------------------------ Front Controller ------------------------------------------------

//        FrontController frontController = new FrontController();
//        frontController.dispatchRequest("Home");
//        frontController.dispatchRequest("Student");
//        frontController.dispatchRequest("Worker");
    }
}
