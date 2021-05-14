package hello;


import DbModelBackage.Teacher;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "teacherConverter")
public class TeacherConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        Teacher teacher =TeacherService.Instance.getTeacherFromGetAllTeacherstById(s);
        return teacher;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((Teacher)o).getTeId().toString();
    }
}
