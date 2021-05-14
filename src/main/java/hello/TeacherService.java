package hello;

import DbController.DataBaseController;
import DbModelBackage.Teacher;

import java.util.ArrayList;
import java.util.List;


public enum TeacherService {
    Instance;

        private final List<Teacher> teacherList;

       TeacherService() {
            teacherList = getAllTeachers();
        }

        public List<Teacher> getAllTeachers() {
            DataBaseController dataBaseController = new DataBaseController();
            Iterable<Teacher> teacherIterable = dataBaseController.getAllTeachers();
            List<Teacher> teacherList = new ArrayList<>();
            teacherIterable.forEach(teacherList::add);
            return teacherList;
        }

        public Teacher getTeacherFromGetAllTeacherstById(String id) {
            return teacherList.stream()
                    .filter(e -> e.getTeId().toString().equals(id))
                    .findAny().orElse(null);
        }

        public List<Teacher> getTeacherList() {
            return teacherList;
        }


    }
