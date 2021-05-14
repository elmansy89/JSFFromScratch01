package hello;


import DbController.DataBaseController;
import DbModelBackage.ContactNumbers;
import DbModelBackage.Student;
import DbModelBackage.Teacher;
import Wrapper.IdNameWrapper;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.*;

@ManagedBean(name ="TeacherBean")
@SessionScoped
public class TeacherBean implements Serializable {

    private Date minDate;
    private Date maxDate;
    long oneDay;
    public Teacher teacher;
    public List<String> Governorate;
    public List<ContactNumbers> contactNumbersList;
    public boolean showAddPhoneElements ;
    public boolean disableAddTeacherAndAddPhoneButton;
    public ContactNumbers contactNumbers;

    public void addTeacher(Teacher teacher) {
        teacher.setTeJoinDate(new Date());
        teacher.setTePhones(contactNumbersList);
        DataBaseController dataBaseController = new DataBaseController();
        dataBaseController.addNewTeacher(teacher);
        contactNumbersList.clear();
        this.teacher=new Teacher();
        contactNumbers=new ContactNumbers();
    }

    public List<Teacher> getLastAddedTeacher() {
        DataBaseController dataBaseController = new DataBaseController();
        Teacher teacher = dataBaseController.getLastAddedTeacher();
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher);
        return teacherList;
    }

    public List<ContactNumbers> getAddedTeacherPhones() {
        DataBaseController dataBaseController = new DataBaseController();
        Teacher teacher = dataBaseController.getLastAddedTeacher();
        List<ContactNumbers> contactNumbersList=new ArrayList<>();
        contactNumbersList.addAll(teacher.getTePhones());
        return contactNumbersList;
    }

    public void showPhoneElement(){
        showAddPhoneElements=true;
        disableAddTeacherAndAddPhoneButton=true;
    }

    public void savePhoneDetails(){
        contactNumbersList.add(contactNumbers.clone());
        showAddPhoneElements=false;
        disableAddTeacherAndAddPhoneButton=false;
        contactNumbers=new ContactNumbers();
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Info","Phone number has been added"));
    }


    @PostConstruct
    public void init() {
        Date today = new Date();
        oneDay = 24 * 60 * 60 * 1000;
        minDate = new Date(today.getTime() - (50*365 * oneDay));
        maxDate = new Date(today.getTime() - (20*365 * oneDay));
        Governorate = Arrays.asList("Alexandria", "Aswan", "Asyut", "Beheira", "Beni Suef",
                "Cairo", "Dakahlia", "Damietta", "Faiyum", "Gharbia", "Giza", "Ismailia", "Kafr El Sheikh", "Luxor",
                "Matruh", "Minya", "Monufia", "New Valley", "North Sinai", "Port Said", "Qalyubia", "Qena",
                "Red Sea", "Sharqia", "Sohag", "South Sinai", "Suez");
        teacher =new Teacher();
        contactNumbersList =new ArrayList<>();
        showAddPhoneElements=false;
        disableAddTeacherAndAddPhoneButton=false;
        contactNumbers =new ContactNumbers();
    }


    public Date getMinDate() {
        return minDate;
    }

    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    public Date getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }

    public long getOneDay() {
        return oneDay;
    }

    public void setOneDay(long oneDay) {
        this.oneDay = oneDay;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<String> getGovernorate() {
        return Governorate;
    }

    public void setGovernorate(List<String> governorate) {
        Governorate = governorate;
    }

    public List<ContactNumbers> getContactNumbersList() {
        return contactNumbersList;
    }

    public void setContactNumbersList(List<ContactNumbers> contactNumbersList) {
        this.contactNumbersList = contactNumbersList;
    }

    public boolean isShowAddPhoneElements() {
        return showAddPhoneElements;
    }

    public void setShowAddPhoneElements(boolean showAddPhoneElements) {
        this.showAddPhoneElements = showAddPhoneElements;
    }

    public boolean isDisableAddTeacherAndAddPhoneButton() {
        return disableAddTeacherAndAddPhoneButton;
    }

    public void setDisableAddTeacherAndAddPhoneButton(boolean disableAddTeacherAndAddPhoneButton) {
        this.disableAddTeacherAndAddPhoneButton = disableAddTeacherAndAddPhoneButton;
    }

    public ContactNumbers getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ContactNumbers contactNumbers) {
        this.contactNumbers = contactNumbers;
    }
}
