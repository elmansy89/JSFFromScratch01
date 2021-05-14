package DbModelBackage;

import com.fasterxml.jackson.annotation.JsonBackReference;


import java.util.Date;
import java.util.List;
import java.util.Set;

public class Teacher {

    Integer teId;
    String teName;

    List<ContactNumbers> tePhones;
    Date teBirthDay;
    String teGraduation;
    String stGovernorate;
    Date teJoinDate;

    Set<Session> teSessions;

    Set<Courses> teCources;

    Set<ClassRoom> teClassRoom;
    String teAvailability;
    String teCalendar;
    String teStatus;

    public Teacher() {
    }

    public Teacher(Integer teId, String teName, List<ContactNumbers> tePhones, Date teBirthDay,
                   String teGraduation, String stGovernorate, Date teJoinDate, Set<Session> teSessions,
                   Set<Courses> teCources, Set<ClassRoom> teClassRoom, String teAvailability,
                   String teCalendar, String teStatus) {
        this.teId = teId;
        this.teName = teName;
        this.tePhones = tePhones;
        this.teBirthDay = teBirthDay;
        this.teGraduation = teGraduation;
        this.stGovernorate = stGovernorate;
        this.teJoinDate = teJoinDate;
        this.teSessions = teSessions;
        this.teCources = teCources;
        this.teClassRoom = teClassRoom;
        this.teAvailability = teAvailability;
        this.teCalendar = teCalendar;
        this.teStatus = teStatus;
    }

    public String getTeStatus() {
        return teStatus;
    }

    public void setTeStatus(String teStatus) {
        this.teStatus = teStatus;
    }

    public Integer getTeId() {
        return teId;
    }

    public void setTeId(Integer teId) {
        this.teId = teId;
    }

    public String getTeName() {
        return teName;
    }

    public void setTeName(String teName) {
        this.teName = teName;
    }

    public List<ContactNumbers> getTePhones() {
        return tePhones;
    }

    public void setTePhones(List<ContactNumbers> tePhones) {
        this.tePhones = tePhones;
    }

    public Date getTeBirthDay() {
        return teBirthDay;
    }

    public void setTeBirthDay(Date teBirthDay) {
        this.teBirthDay = teBirthDay;
    }

    public String getTeGraduation() {
        return teGraduation;
    }

    public void setTeGraduation(String teGraduation) {
        this.teGraduation = teGraduation;
    }

    public String getStGovernorate() {
        return stGovernorate;
    }

    public void setStGovernorate(String stGovernorate) {
        this.stGovernorate = stGovernorate;
    }

    public Date getTeJoinDate() {
        return teJoinDate;
    }

    public void setTeJoinDate(Date teJoinDate) {
        this.teJoinDate = teJoinDate;
    }

    public Set<Session> getTeSessions() {
        return teSessions;
    }

    public void setTeSessions(Set<Session> teSessions) {
        this.teSessions = teSessions;
    }

    public Set<Courses> getTeCources() {
        return teCources;
    }

    public void setTeCources(Set<Courses> teCources) {
        this.teCources = teCources;
    }

    public Set<ClassRoom> getTeClassRoom() {
        return teClassRoom;
    }

    public void setTeClassRoom(Set<ClassRoom> teClassRoom) {
        this.teClassRoom = teClassRoom;
    }

    public String getTeAvailability() {
        return teAvailability;
    }

    public void setTeAvailability(String teAvailability) {
        this.teAvailability = teAvailability;
    }

    public String getTeCalendar() {
        return teCalendar;
    }

    public void setTeCalendar(String teCalendar) {
        this.teCalendar = teCalendar;
    }
}

