package hello;

import DbModelBackage.Courses;
import DbModelBackage.Teacher;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "courseConverter")
public class CourceConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        Courses courses=CourseService.Instance.getCourceFromGetAllCourcestById(s);
            return courses;

    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((Courses)o).getCoId().toString();

    }
}
