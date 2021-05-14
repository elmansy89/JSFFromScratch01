package hello;


import DbController.DataBaseController;
import DbModelBackage.ContactNumbers;
import DbModelBackage.Student;
import Wrapper.IdNameWrapper;
import org.glassfish.jersey.inject.hk2.Hk2RequestScope;
import org.primefaces.PrimeFaces;
import sun.security.jca.GetInstance;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.*;

@ManagedBean(name = "editor")
@SessionScoped
public class StudentBean implements Serializable {

    private Date minDate;
    private Date maxDate;
    long oneDay ;
    public List<IdNameWrapper> responseIdNameWrapper;
    public Student student;
    public List<String> Governorate;
    public Set<ContactNumbers> contactNumbersList;
    public boolean showAddPhoneElements ;
    public boolean disableAddStudentAndAddPhoneButton;
    public ContactNumbers contactNumbers;

    public void addStudent(Student student) {
        student.setStRegisterDate(new Date());
        student.setStParentPhones(contactNumbersList);
        DataBaseController dataBaseController = new DataBaseController();
        dataBaseController.addNewStudent(student);
//        PrimeFaces.current().resetInputs(":form:panel");
        contactNumbersList.clear();
        this.student=new Student();
        contactNumbers=new ContactNumbers();
    }

    public List<Student> getLastAddedStudent() {
        DataBaseController dataBaseController = new DataBaseController();
        Student student = dataBaseController.getLastAddedStudent();
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        return studentList;
    }

    public List<ContactNumbers> getLastAddedStudentPhones() {
        DataBaseController dataBaseController = new DataBaseController();
        Student student = dataBaseController.getLastAddedStudent();
        List<ContactNumbers> contactNumbersList=new ArrayList<>();
        contactNumbersList.addAll(student.getStParentPhones());
        return contactNumbersList;
    }

    public void showPhoneElement(){
        showAddPhoneElements=true;
        disableAddStudentAndAddPhoneButton=true;
    }

    public void savePhoneDetails(){
//        ContactNumbers contactNumbers = new ContactNumbers();
//        contactNumbers.setPhName(this.contactNumbers.getPhName());
        contactNumbersList.add(contactNumbers.clone());
        showAddPhoneElements=false;
        disableAddStudentAndAddPhoneButton=false;
        contactNumbers=new ContactNumbers();
        FacesContext.getCurrentInstance()
                .addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Info","Phone number has been added"));
    }

    @PostConstruct
    public void init() {
        Date today = new Date();
        oneDay = 24 * 60 * 60 * 1000;
        minDate = new Date(today.getTime() - (40*365 * oneDay));
        maxDate = new Date(today.getTime() - (2*365 * oneDay));
        Governorate = Arrays.asList("Alexandria", "Aswan", "Asyut", "Beheira", "Beni Suef",
                "Cairo", "Dakahlia", "Damietta", "Faiyum", "Gharbia", "Giza", "Ismailia", "Kafr El Sheikh", "Luxor",
                "Matruh", "Minya", "Monufia", "New Valley", "North Sinai", "Port Said", "Qalyubia", "Qena",
                "Red Sea", "Sharqia", "Sohag", "South Sinai", "Suez");
        student =new Student();
        contactNumbersList =new HashSet<>();
        showAddPhoneElements=false;
        disableAddStudentAndAddPhoneButton=false;
        contactNumbers =new ContactNumbers();
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<IdNameWrapper> getResponseIdNameWrapper() {
        return responseIdNameWrapper;
    }

    public void setResponseIdNameWrapper(List<IdNameWrapper> responseIdNameWrapper) {
        this.responseIdNameWrapper = responseIdNameWrapper;
    }

    public List<String> getGovernorate() {
        return Governorate;
    }

    public void setGovernorate(List<String> governorate) {
        Governorate = governorate;
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

    public Set<ContactNumbers> getContactNumbersList() {
        return contactNumbersList;
    }

    public void setContactNumbersList(Set<ContactNumbers> contactNumbersList) {
        this.contactNumbersList = contactNumbersList;
    }


    public ContactNumbers getContactNumbers() {
        return contactNumbers;
    }

    public void setContactNumbers(ContactNumbers contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public boolean isShowAddPhoneElements() {
        return showAddPhoneElements;
    }

    public void setShowAddPhoneElements(boolean showAddPhoneElements) {
        this.showAddPhoneElements = showAddPhoneElements;
    }

    public boolean isDisableAddStudentAndAddPhoneButton() {
        return disableAddStudentAndAddPhoneButton;
    }

    public void setDisableAddStudentAndAddPhoneButton(boolean disableAddStudentAndAddPhoneButton) {
        this.disableAddStudentAndAddPhoneButton = disableAddStudentAndAddPhoneButton;
    }
}
