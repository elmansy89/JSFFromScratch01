package DbModelBackage;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;
import java.util.Set;


public class ClassRoom {

    Integer crId;

    Set<Session> crSession;

    Courses crCourse;
    String crName;
    Integer crNumberOfSessions;
    Date crStartDate;
    String crSessionDuration;
    String crDiscount;
    String crDuration;
    String crStatus;
    Set<Student> crStudent;
    String crTotalePrice;
    Set<Teacher> crTeacher;
    String crAvailability;
    Set<MaterialList> crMaterialList;


    public ClassRoom() {
    }

    public ClassRoom(Integer crId, Set<Session> crSession, Courses crCourse, String crName,
                     Integer crNumberOfSessions, Date crStartDate, String crSessionDuration,
                     String crDiscount, String crDuration, String crStatus, Set<Student> crStudent,
                     String crTotalePrice, Set<Teacher> crTeacher,
                     String crAvailability, Set<MaterialList> crMaterialList) {
        this.crId = crId;
        this.crSession = crSession;
        this.crCourse = crCourse;
        this.crName = crName;
        this.crNumberOfSessions = crNumberOfSessions;
        this.crStartDate = crStartDate;
        this.crSessionDuration = crSessionDuration;
        this.crDiscount = crDiscount;
        this.crDuration = crDuration;
        this.crStatus = crStatus;
        this.crStudent = crStudent;
        this.crTotalePrice = crTotalePrice;
        this.crTeacher = crTeacher;
        this.crAvailability = crAvailability;
        this.crMaterialList = crMaterialList;
    }

    public Set<MaterialList> getCrMaterialList() {
        return crMaterialList;
    }

    public void setCrMaterialList(Set<MaterialList> crMaterialList) {
        this.crMaterialList = crMaterialList;
    }

    public Integer getCrId() {
        return crId;
    }

    public void setCrId(Integer crId) {
        this.crId = crId;
    }

    public Set<Session> getCrSession() {
        return crSession;
    }

    public void setCrSession(Set<Session> crSession) {
        this.crSession = crSession;
    }

    public Courses getCrCourse() {
        return crCourse;
    }

    public void setCrCourse(Courses crCourse) {
        this.crCourse = crCourse;
    }

    public String getCrName() {
        return crName;
    }

    public void setCrName(String crName) {
        this.crName = crName;
    }

    public Integer getCrNumberOfSessions() {
        return crNumberOfSessions;
    }

    public void setCrNumberOfSessions(Integer crNumberOfSessions) {
        this.crNumberOfSessions = crNumberOfSessions;
    }

    public Date getCrStartDate() {
        return crStartDate;
    }

    public void setCrStartDate(Date crStartDate) {
        this.crStartDate = crStartDate;
    }

    public String getCrSessionDuration() {
        return crSessionDuration;
    }

    public void setCrSessionDuration(String crSessionDuration) {
        this.crSessionDuration = crSessionDuration;
    }

    public String getCrDiscount() {
        return crDiscount;
    }

    public void setCrDiscount(String crDiscount) {
        this.crDiscount = crDiscount;
    }

    public String getCrDuration() {
        return crDuration;
    }

    public void setCrDuration(String crDuration) {
        this.crDuration = crDuration;
    }

    public String getCrStatus() {
        return crStatus;
    }

    public void setCrStatus(String crStatus) {
        this.crStatus = crStatus;
    }

    public Set<Student> getCrStudent() {
        return crStudent;
    }

    public void setCrStudent(Set<Student> crStudent) {
        this.crStudent = crStudent;
    }

    public String getCrTotalePrice() {
        return crTotalePrice;
    }

    public void setCrTotalePrice(String crTotalePrice) {
        this.crTotalePrice = crTotalePrice;
    }

    public Set<Teacher> getCrTeacher() {
        return crTeacher;
    }

    public void setCrTeacher(Set<Teacher> crTeacher) {
        this.crTeacher = crTeacher;
    }

    public String getCrAvailability() {
        return crAvailability;
    }

    public void setCrAvailability(String crAvailability) {
        this.crAvailability = crAvailability;
    }
}
