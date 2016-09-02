package patterns.J2EE.transferobject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 02.09.16.
 */
public class StudentBO {

    private List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert", 0);
        StudentVO student2 = new StudentVO("John", 1);
        students.add(student1);
        students.add(student2);
    }

    public void deleteStudents(StudentVO student) {
        students.remove(student.getRollNo());
        System.out.println("Student : RollNo " + student.getRollNo() + ", deleted from database");
    }

    public List<StudentVO> getAllStudents() {
        return students;
    }

    public StudentVO getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student : RollNo " + student.getRollNo() + ", updated in the database");
    }
}
