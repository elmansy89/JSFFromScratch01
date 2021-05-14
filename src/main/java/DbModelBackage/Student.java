package DbModelBackage;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import java.util.Set;


public class Student {

    Integer stId;
    String stName;
    String stGender;
    Date stBirthDay;
    String stSchoolName;
     Date stRegisterDate;
     String stGovernorate;
    String stAddress;
    String stActiveParent;
     String studentParentWork;

Set<ContactNumbers> stParentPhones;

Set<ClassRoom> stClassRoom ;

Set<Session> stSession ;
String stDiscount;
String stStatus;
String stCalendar;

 Set<Materials> stMaterials;


    public Student() {
    }


    public Student(String stName, String stGender, Date stBirthDay, String stSchoolName,
                   Date stRegisterDate, String stGovernorate, String stAddress, String stActiveParent,
                   String studentParentWork, Set<ContactNumbers> stParentPhones, Set<ClassRoom> stClassRoom,
                   Set<Session> stSession, String stDiscount, String stStatus, String stCalendar,
                   Set<Materials> stMaterials) {
        this.stName = stName;
        this.stGender = stGender;
        this.stBirthDay = stBirthDay;
        this.stSchoolName = stSchoolName;
        this.stRegisterDate = stRegisterDate;
        this.stGovernorate = stGovernorate;
        this.stAddress = stAddress;
        this.stActiveParent = stActiveParent;
        this.studentParentWork = studentParentWork;
        this.stParentPhones = stParentPhones;
        this.stClassRoom = stClassRoom;
        this.stSession = stSession;
        this.stDiscount = stDiscount;
        this.stStatus = stStatus;
        this.stCalendar = stCalendar;
        this.stMaterials = stMaterials;
    }

    public Set<Materials> getStMaterials() {
        return stMaterials;
    }

    public void setStMaterials(Set<Materials> stMaterials) {
        this.stMaterials = stMaterials;
    }

    public String getStGender() {
        return stGender;
    }

    public void setStGender(String stGender) {
        this.stGender = stGender;
    }

    public Date getStBirthDay() {
        return stBirthDay;
    }

    public void setStBirthDay(Date stBirthDay) {
        this.stBirthDay = stBirthDay;
    }

    public String getStSchoolName() {
        return stSchoolName;
    }

    public void setStSchoolName(String stSchoolName) {
        this.stSchoolName = stSchoolName;
    }

    public Date getStRegisterDate() {
        return stRegisterDate;
    }

    public void setStRegisterDate(Date stRegisterDate) {
        this.stRegisterDate = stRegisterDate;
    }

    public String getStGovernorate() {
        return stGovernorate;
    }

    public void setStGovernorate(String stGovernorate) {
        this.stGovernorate = stGovernorate;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public String getStActiveParent() {
        return stActiveParent;
    }

    public void setStActiveParent(String stActiveParent) {
        this.stActiveParent = stActiveParent;
    }

    public String getStudentParentWork() {
        return studentParentWork;
    }

    public void setStudentParentWork(String studentParentWork) {
        this.studentParentWork = studentParentWork;
    }

    public String getStStatus() {
        return stStatus;
    }

    public void setStStatus(String stStatus) {
        this.stStatus = stStatus;
    }

    public String getStCalendar() {
        return stCalendar;
    }

    public void setStCalendar(String stCalendar) {
        this.stCalendar = stCalendar;
    }

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public Set<ContactNumbers> getStParentPhones() {
        return stParentPhones;
    }

    public void setStParentPhones(Set<ContactNumbers> stParentPhones) {
        this.stParentPhones = stParentPhones;
    }

    public Set<ClassRoom> getStClassRoom() {
        return stClassRoom;
    }

    public void setStClassRoom(Set<ClassRoom> stClassRoom) {
        this.stClassRoom = stClassRoom;
    }

    public Set<Session> getStSession() {
        return stSession;
    }

    public void setStSession(Set<Session> stSession) {
        this.stSession = stSession;
    }

    public String getStDiscount() {
        return stDiscount;
    }

    public void setStDiscount(String stDiscount) {
        this.stDiscount = stDiscount;
    }
}
