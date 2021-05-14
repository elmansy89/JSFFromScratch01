package DbModelBackage;
import java.util.Date;
import java.util.Set;


public class Session {

    Integer seId;
    ClassRoom seClassRoom;
    Date seDate;
    String seLocation;
    String seType;
    Set<Student> seStudentAttendance ;
    Teacher seTeacher;

    public Session() {
    }

    public Session(Integer seId, ClassRoom seClassRoom, Date seDate, String seLocation,
                   String seType, Set<Student> seStudentAttendance, Teacher seTeacher) {
        this.seId = seId;
        this.seClassRoom = seClassRoom;
        this.seDate = seDate;
        this.seLocation = seLocation;
        this.seType = seType;
        this.seStudentAttendance = seStudentAttendance;
        this.seTeacher = seTeacher;
    }

    public Integer getSeId() {
        return seId;
    }

    public void setSeId(Integer seId) {
        this.seId = seId;
    }

    public ClassRoom getSeClassRoom() {
        return seClassRoom;
    }

    public void setSeClassRoom(ClassRoom seClassRoom) {
        this.seClassRoom = seClassRoom;
    }

    public Date getSeDate() {
        return seDate;
    }

    public void setSeDate(Date seDate) {
        this.seDate = seDate;
    }

    public String getSeLocation() {
        return seLocation;
    }

    public void setSeLocation(String seLocation) {
        this.seLocation = seLocation;
    }

    public String getSeType() {
        return seType;
    }

    public void setSeType(String seType) {
        this.seType = seType;
    }

    public Set<Student> getSeStudentAttendance() {
        return seStudentAttendance;
    }

    public void setSeStudentAttendance(Set<Student> seStudentAttendance) {
        this.seStudentAttendance = seStudentAttendance;
    }

    public Teacher getSeTeacher() {
        return seTeacher;
    }

    public void setSeTeacher(Teacher seTeacher) {
        this.seTeacher = seTeacher;
    }

}
