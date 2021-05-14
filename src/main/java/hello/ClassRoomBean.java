package hello;

import DbController.DataBaseController;
import DbModelBackage.ClassRoom;
import DbModelBackage.Courses;
import DbModelBackage.Student;
import DbModelBackage.Teacher;
import org.primefaces.model.DualListModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.*;

@ManagedBean(name = "ClassRoomBean")
@ViewScoped
public class ClassRoomBean implements Serializable {

    ClassRoom classRoom;
    private Courses courses;
    private DualListModel<Teacher> dualListModelTeacher;
    private DualListModel<Student> studentDualListModel;
    Date minDateofClassRoomStart;

    public void addClassRoom(ClassRoom classRoom) {
        classRoom.setCrCourse(courses);
        Set<Teacher> teacherSet = new HashSet<>(dualListModelTeacher.getTarget());
        classRoom.setCrTeacher(teacherSet);
        Set<Student> studentSet = new HashSet<>(studentDualListModel.getTarget());
        classRoom.setCrStudent(studentSet);
        DataBaseController dataBaseController = new DataBaseController();
        dataBaseController.addNewClassRoom(classRoom);
        this.classRoom = new ClassRoom();
        dualListModelTeacher = new DualListModel<>();
        studentDualListModel = new DualListModel<>();
    }

    public List<Courses> getAllCourses() {
        return CourseService.Instance.getCoursesList();
    }

    public void getTeacherListFromCourse() {
        dualListModelTeacher.setSource(new ArrayList<>(courses.getCoTeacher()));
    }

    public List<Student> getAllStudents() {
        return StudentService.Instance.getAllStudents();
    }

    @PostConstruct
    public void init() {
        courses = new Courses();
        classRoom = new ClassRoom();
        List<Teacher> teacherList = new ArrayList<>();
        minDateofClassRoomStart = new Date();
        dualListModelTeacher = new DualListModel<>
                (new ArrayList<>(), teacherList);
        List<Student> studentList = new ArrayList<>();
        studentDualListModel = new DualListModel<>(new ArrayList<>(getAllStudents()), studentList);

    }

    public DualListModel<Student> getStudentDualListModel() {
        return studentDualListModel;
    }

    public void setStudentDualListModel(DualListModel<Student> studentDualListModel) {
        this.studentDualListModel = studentDualListModel;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public DualListModel<Teacher> getDualListModelTeacher() {
        return dualListModelTeacher;
    }

    public void setDualListModelTeacher(DualListModel<Teacher> dualListModelTeacher) {
        this.dualListModelTeacher = dualListModelTeacher;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Date getMinDateofClassRoomStart() {
        return minDateofClassRoomStart;
    }

    public void setMinDateofClassRoomStart(Date minDateofClassRoomStart) {
        this.minDateofClassRoomStart = minDateofClassRoomStart;
    }
}
