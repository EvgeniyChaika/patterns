package patterns.J2EE.mvc.controller;

import patterns.J2EE.mvc.model.Student;
import patterns.J2EE.mvc.view.StudentView;

/**
 * Created on 29.08.16.
 */
public class StudentConroller {

    private Student model;
    private StudentView studentView;

    public StudentConroller(Student model, StudentView studentView) {
        this.model = model;
        this.studentView = studentView;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        studentView.printStudentDetails(model.getName(), getStudentRollNo());
    }
}
