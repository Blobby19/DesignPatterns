package fr.itv95.dataaccessobject;

import java.util.List;

/**
 * Created by Luc on 17/10/2016.
 */
public interface StudentDao {
    List<Student> getAllStudent();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
