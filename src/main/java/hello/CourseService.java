package hello;


import DbController.DataBaseController;
import DbModelBackage.Courses;

import java.util.ArrayList;
import java.util.List;


public enum CourseService {
    Instance;

    private final List<Courses> coursesList;

    CourseService() {
        coursesList = getAllCources();
    }

    public List<Courses> getAllCources() {
        DataBaseController dataBaseController = new DataBaseController();
        Iterable<Courses> coursesIterable = dataBaseController.getAllCources();
        List<Courses> coursesList = new ArrayList<>();
        coursesIterable.forEach(coursesList::add);
        return coursesList;
    }

    public Courses getCourceFromGetAllCourcestById(String id) {
        return coursesList.stream()
                .filter(e ->e.getCoId().toString().equals(id))
                .findAny().orElse(null);
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }
}

