package hello;


import DbController.DataBaseController;
import DbModelBackage.ContactNumbers;
import DbModelBackage.Courses;
import DbModelBackage.Student;
import DbModelBackage.Teacher;
import org.primefaces.model.DualListModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.*;

@ManagedBean(name ="CourseBean")
@RequestScoped
public class CourseBean implements Serializable {

    Courses courses;
    private DualListModel<Teacher> dualListModel;

    public void addCourse(Courses courses,List<Teacher> teacherList) {
        Set<Teacher> teacherSet= new HashSet<>(teacherList);
        courses.setCoTeacher(teacherSet);
        DataBaseController dataBaseController = new DataBaseController();
        dataBaseController.addNewCourse(courses);
        this.courses=new Courses();
        teacherList.clear();
        dualListModel.setSource(getAllTeachers());
    }

    public List<Teacher> getAllTeachers(){
return TeacherService.Instance.getTeacherList();
    }


    @PostConstruct
    public void init() {

        courses=new Courses();
        List<Teacher> teacherList =new ArrayList<>();
        dualListModel=new DualListModel<>(new ArrayList<>(getAllTeachers()) ,teacherList);



    }

    public DualListModel<Teacher> getDualListModel() {
        return dualListModel;
    }

    public void setDualListModel(DualListModel<Teacher> dualListModel) {
        this.dualListModel = dualListModel;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }


}
