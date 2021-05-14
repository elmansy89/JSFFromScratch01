package DbModelBackage;

import java.util.Set;

public class Materials {

    Integer maId;
    String maName;
    String maUnitPrice;
    String maDiscount;
    Set<Student> maStudent;

    public Materials() {
    }

    public Materials(Integer maId, String maName, String maUnitPrice, String maDiscount,
                     Set<Student> maStudent) {
        this.maId = maId;
        this.maName = maName;
        this.maUnitPrice = maUnitPrice;
        this.maDiscount = maDiscount;
        this.maStudent = maStudent;

    }

    public Integer getMaId() {
        return maId;
    }

    public void setMaId(Integer maId) {
        this.maId = maId;
    }

    public String getMaName() {
        return maName;
    }

    public void setMaName(String maName) {
        this.maName = maName;
    }

    public String getMaUnitPrice() {
        return maUnitPrice;
    }

    public void setMaUnitPrice(String maUnitPrice) {
        this.maUnitPrice = maUnitPrice;
    }

    public String getMaDiscount() {
        return maDiscount;
    }

    public void setMaDiscount(String maDiscount) {
        this.maDiscount = maDiscount;
    }

    public Set<Student> getMaStudent() {
        return maStudent;
    }

    public void setMaStudent(Set<Student> maStudent) {
        this.maStudent = maStudent;
    }

}
