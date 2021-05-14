package DbModelBackage;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Iterator;
import java.util.Set;

public class Courses {

    Integer coId;
    String coName;
    Set<ClassRoom> coClassRoom;
    String coNetUnitPrice;
    String coDiscount;
    String coStauts;
    Set<Teacher> coTeacher;

    public Courses() {
    }

    public Courses(Integer coId, String coName, Set<ClassRoom> coClassRoom, String coNetUnitPrice,
                   String coDiscount, String coStauts, Set<Teacher> coTeacher) {
        this.coId = coId;
        this.coName = coName;
        this.coClassRoom = coClassRoom;
        this.coNetUnitPrice = coNetUnitPrice;
        this.coDiscount = coDiscount;
        this.coStauts = coStauts;
        this.coTeacher = coTeacher;
    }

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public Set<ClassRoom> getCoClassRoom() {
        return coClassRoom;
    }

    public void setCoClassRoom(Set<ClassRoom> coClassRoom) {
        this.coClassRoom = coClassRoom;
    }

    public String getCoNetUnitPrice() {
        return coNetUnitPrice;
    }

    public void setCoNetUnitPrice(String coNetUnitPrice) {
        this.coNetUnitPrice = coNetUnitPrice;
    }

    public String getCoDiscount() {
        return coDiscount;
    }

    public void setCoDiscount(String coDiscount) {
        this.coDiscount = coDiscount;
    }

    public String getCoStauts() {
        return coStauts;
    }

    public void setCoStauts(String coStauts) {
        this.coStauts = coStauts;
    }

    public Set<Teacher> getCoTeacher() {
        return coTeacher;
    }

    public void setCoTeacher(Set<Teacher> coTeacher) {
        this.coTeacher = coTeacher;
    }

    //////////////////////////////////////////////////////////////////////////////////////

    public void releaseTeacherFromListOfTeachersByTeacherId(Set<Teacher> coTeacher, Integer id) {
        Teacher x=new Teacher();
        for(Iterator<Teacher> teacherIterator = coTeacher.iterator(); teacherIterator.hasNext();)
        {
            x=teacherIterator.next();
            if(x.getTeId().equals(id))
            {
                teacherIterator.remove();
            }
        }
        this.coTeacher=coTeacher;
    }

}
