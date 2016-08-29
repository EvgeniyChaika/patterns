package patterns.J2EE.mvc;

import patterns.J2EE.mvc.model.Student;

/**
 * Created on 29.08.16.
 */
public class StudentFactory {

    private static String[] names = {"John", "Mike", "Bob", "Lora", "Lisa"};
    private static String[] rollNo = {"2", "4", "3", "77", "33"};

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName(String.valueOf(names[(int) (Math.random() * names.length)]));
        student.setRollNo(String.valueOf(rollNo[(int) (Math.random() * rollNo.length)]));
        return student;
    }
}
