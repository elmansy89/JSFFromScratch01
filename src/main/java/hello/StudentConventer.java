package hello;

import DbModelBackage.Student;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "studentConventer")
public class StudentConventer implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        Student student =StudentService.Instance.getStudentFromGetAllStudentById(s);
        return student;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((Student)o).getStId().toString();
    }
}
