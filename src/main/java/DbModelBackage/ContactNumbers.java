package DbModelBackage;

import com.fasterxml.jackson.annotation.JsonBackReference;



public class ContactNumbers implements Cloneable{

    Integer phId;
    Student student;
    Teacher teacher;
    String phName;
    String phNumber;
    String phType;


    public ContactNumbers(Integer phId, Student student, Teacher teacher,
                          String phName, String phNumber, String phType) {
        this.phId = phId;
        this.student = student;
        this.teacher = teacher;
        this.phName = phName;
        this.phNumber = phNumber;
        this.phType = phType;
    }

    public ContactNumbers() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getPhType() {
        return phType;
    }

    public void setPhType(String phType) {
        this.phType = phType;
    }

    public Integer getPhId() {
        return phId;
    }

    public void setPhId(Integer phId) {
        this.phId = phId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getPhName() {
        return phName;
    }

    public void setPhName(String phName) {
        this.phName = phName;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    @Override
    public ContactNumbers clone() {
        ContactNumbers o = null;
        try {
            o = (ContactNumbers) super.clone();
        } catch (CloneNotSupportedException ex) {
        }
        return o;
    }
}
