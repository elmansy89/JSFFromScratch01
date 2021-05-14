package hello;

import DbController.DataBaseController;
import DbModelBackage.Student;
import DbModelBackage.Teacher;

import java.util.ArrayList;
import java.util.List;

public enum StudentService {

    Instance;

    private final List<Student> studentList;

    StudentService() {
        studentList = getAllStudents();
    }

    public List<Student> getAllStudents() {
        DataBaseController dataBaseController = new DataBaseController();
        Iterable<Student> studentIterable = dataBaseController.getAllStudents();
        List<Student> studentList = new ArrayList<>();
        studentIterable.forEach(studentList::add);
        return studentList;
    }

    public Student getStudentFromGetAllStudentById(String id) {
        return studentList.stream()
                .filter(e -> e.getStId().toString().equals(id))
                .findAny().orElse(null);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
