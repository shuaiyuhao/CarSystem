package carSystem.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "User", schema = "CAR", catalog = "")
public class UserEntity {
    private String userCode;
    private String userName;
    private String passWord;
    private Timestamp regisData;
    private String gender;
    private Integer phoneNumber;

    @Basic
    @Column(name = "userCode")
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Id
    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "passWord")
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Basic
    @Column(name = "regisData")
    public Timestamp getRegisData() {
        return regisData;
    }

    public void setRegisData(Timestamp regisData) {
        this.regisData = regisData;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "phoneNumber")
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(userCode, that.userCode) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(passWord, that.passWord) &&
                Objects.equals(regisData, that.regisData) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userCode, userName, passWord, regisData, gender, phoneNumber);
    }
}
