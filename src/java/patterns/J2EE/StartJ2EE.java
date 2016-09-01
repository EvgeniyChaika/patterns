package patterns.J2EE;

import patterns.J2EE.dataaccessobject.Student;
import patterns.J2EE.dataaccessobject.StudentDao;
import patterns.J2EE.dataaccessobject.impl.StudentDaoImpl;

/**
 * Created on 29.08.16.
 */
public class StartJ2EE {

    public static void main(String[] args) {

//--------------------------------------- Model-View-Controller -----------------------------------------------

//        Student model = StudentFactory.retriveStudentFromDatabase();
//        StudentView studentView = new StudentView();
//        StudentConroller studentConroller = new StudentConroller(model, studentView);
//
//        studentConroller.updateView();
//        studentConroller.setStudentName("Evgeniy");
//        studentConroller.updateView();

//----------------------------------------- Business Delegate -------------------------------------------------

//        BusinessDelegate businessDelegate = new BusinessDelegate();
//        businessDelegate.setServiceType("EJB");
//
//        Client client = new Client(businessDelegate);
//        client.doTask();
//
//        businessDelegate.setServiceType("JMS");
//        client.doTask();

//-------------------------------------------Composite Entity -------------------------------------------------

//        Client client = new Client();
//
//        client.setData("Test", "Data");
//        client.printData();
//        client.setData("Second test", "New data");
//        client.printData();

//------------------------------------------ Data Access Object -----------------------------------------------

        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student : [ RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ] ");
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Mike");
        studentDao.updateStudent(student);

        studentDao.getStudent(0);
        System.out.println("Student : [ RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ] ");

//------------------------------------------ Front Controller -------------------------------------------------

//        FrontController frontController = new FrontController();
//        frontController.dispatchRequest("Home");
//        frontController.dispatchRequest("Student");
//        frontController.dispatchRequest("Worker");
    }
}
