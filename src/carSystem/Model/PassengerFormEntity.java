package carSystem.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "passengerForm", schema = "CAR", catalog = "")
public class PassengerFormEntity implements Serializable {
    private String startDate;
    private String startPlace;
    private String endPlace;
    private String money;
    private String peopleNum;

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
    @Column(name = "money")
    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Basic
    @Column(name = "peopleNum")
    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerFormEntity that = (PassengerFormEntity) o;
        return Objects.equals(startDate, that.startDate) &&
                Objects.equals(startPlace, that.startPlace) &&
                Objects.equals(endPlace, that.endPlace) &&
                Objects.equals(money, that.money) &&
                Objects.equals(peopleNum, that.peopleNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(startDate, startPlace, endPlace, money, peopleNum);
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
