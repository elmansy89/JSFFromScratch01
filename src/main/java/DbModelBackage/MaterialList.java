package DbModelBackage;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Set;


public class MaterialList {


    Integer mlId;
    String mlName;
    String mlUnitPrice;
    String mlDiscount;
    Set<ClassRoom> mlClassRoom;

    public MaterialList() {
    }

    public MaterialList(Integer mlId, String mlName, String mlUnitPrice, String mlDiscount,
                        Set<ClassRoom> mlClassRoom) {
        this.mlId = mlId;
        this.mlName = mlName;
        this.mlUnitPrice = mlUnitPrice;
        this.mlDiscount = mlDiscount;
        this.mlClassRoom = mlClassRoom;
    }

    public Integer getMlId() {
        return mlId;
    }

    public void setMlId(Integer mlId) {
        this.mlId = mlId;
    }

    public String getMlName() {
        return mlName;
    }

    public void setMlName(String mlName) {
        this.mlName = mlName;
    }

    public String getMlUnitPrice() {
        return mlUnitPrice;
    }

    public void setMlUnitPrice(String mlUnitPrice) {
        this.mlUnitPrice = mlUnitPrice;
    }

    public String getMlDiscount() {
        return mlDiscount;
    }

    public void setMlDiscount(String mlDiscount) {
        this.mlDiscount = mlDiscount;
    }

    public Set<ClassRoom> getMlClassRoom() {
        return mlClassRoom;
    }

    public void setMlClassRoom(Set<ClassRoom> mlClassRoom) {
        this.mlClassRoom = mlClassRoom;
    }
}
