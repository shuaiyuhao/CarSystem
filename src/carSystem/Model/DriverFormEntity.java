package carSystem.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "driverForm", schema = "CAR", catalog = "")
public class DriverFormEntity implements Serializable {
    private String startDate;
    private String startPlace;
    private String endPlace;
    private String goStatus;
    private Integer sitNum;

    @Basic
    @Column(name = "startDate")
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "startPlace")
    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    @Basic
    @Column(name = "endPlace")
    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    @Basic
    @Column(name = "goStatus")
    public String getGoStatus() {
        return goStatus;
    }

    public void setGoStatus(String goStatus) {
        this.goStatus = goStatus;
    }

    @Basic
    @Column(name = "sitNum")
    public Integer getSitNum() {
        return sitNum;
    }

    public void setSitNum(Integer sitNum) {
        this.sitNum = sitNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverFormEntity that = (DriverFormEntity) o;
        return Objects.equals(startDate, that.startDate) &&
                Objects.equals(startPlace, that.startPlace) &&
                Objects.equals(endPlace, that.endPlace) &&
                Objects.equals(goStatus, that.goStatus) &&
                Objects.equals(sitNum, that.sitNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(startDate, startPlace, endPlace, goStatus, sitNum);
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
