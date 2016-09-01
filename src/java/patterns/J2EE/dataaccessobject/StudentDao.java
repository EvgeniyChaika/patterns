package patterns.J2EE.dataaccessobject;

import java.util.List;

/**
 * Created on 01.09.16.
 */
public interface StudentDao {

    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
