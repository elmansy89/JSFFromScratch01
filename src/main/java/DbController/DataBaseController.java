package DbController;

import DbModelBackage.ClassRoom;
import DbModelBackage.Courses;
import DbModelBackage.Student;
import DbModelBackage.Teacher;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class DataBaseController {
    String serviceURL = "http://localhost:8888";

    public WebTarget webTarget(String target) {
        ClientConfig config = new ClientConfig();
        config.register(JacksonFeature.class);
        Client client = ClientBuilder.newClient(config);
        return client.target(target);
    }
    ///////////////////////////////////////////////////////////////
    /*  Student */

    public void addNewStudent(Student student) {
        WebTarget target = webTarget(serviceURL);
        target.path("/student/addNewStudent")
                .request()
                .post(Entity.entity(student, MediaType.APPLICATION_JSON));
    }

    public Iterable<Student> getAllStudents() {
        WebTarget target = webTarget(serviceURL);
        return target.path("/student/getAllStudents")
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .get(Response.class).readEntity(new GenericType<List<Student>>() {
                });
    }
//
//    public Student getStudentByName(String name){
//        WebTarget target =webTarget("http://localhost:8888/student");
//        return target.path("getLastAddedStudent")
//                .path(name)
//                .request()
//                .accept(MediaType.APPLICATION_JSON)
//                .
//    }

    public Student getLastAddedStudent() {
        WebTarget target = webTarget(serviceURL);
        return target.path("/student/getLastAddedStudent").request()
                .accept(MediaType.APPLICATION_JSON)
                .get(Student.class);
    }

///////////////////////////////////////////////////////////////
    /*  Teacher */

    public void addNewTeacher(Teacher teacher) {
        WebTarget target = webTarget(serviceURL);
        target.path("/teacher/addNewTeacher")
                .request()
                .post(Entity.entity(teacher, MediaType.APPLICATION_JSON));
    }

    public Teacher getLastAddedTeacher() {
        WebTarget target = webTarget(serviceURL);
        return target.path("/teacher/getLastAddedTeacher").request()
                .accept(MediaType.APPLICATION_JSON)
                .get(Teacher.class);
    }

    public Iterable<Teacher> getAllTeachers() {
        WebTarget target = webTarget(serviceURL);
        return target.path("/teacher/getAllTeachers")
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .get(Response.class).readEntity(new GenericType<List<Teacher>>() {
                });
    }


///////////////////////////////////////////////////////////////
    /* Courses */

    public void addNewCourse(Courses courses) {
        WebTarget target = webTarget(serviceURL);
        target.path("/courses/addNewCourse")
                .request()
                .post(Entity.entity(courses, MediaType.APPLICATION_JSON));
    }

    public Iterable<Courses> getAllCources() {
        WebTarget target = webTarget(serviceURL);
        return target.path("/courses/getAllCourses")
                .request()
                .accept(MediaType.APPLICATION_JSON)
                .get(Response.class).readEntity(new GenericType<List<Courses>>() {
                });
    }


///////////////////////////////////////////////////////////////
    /* Class Room */

    public void addNewClassRoom(ClassRoom classRoom) {
        WebTarget target = webTarget(serviceURL);
        target.path("/classRoom/addNewClassRoom")
                .request()
                .post(Entity.entity(classRoom, MediaType.APPLICATION_JSON));
    }


///////////////////////////////////////////////////////////////
    /* Constractor */

    public DataBaseController() {
    }
}
