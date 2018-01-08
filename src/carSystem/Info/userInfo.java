package carSystem.Info;

/**
 * Created by shuaiyuhao on 2017/12/20.
 */
public class userInfo {
    private String userName;
    private String passWord;
    private String phoneNumber;
    private String gender;
    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }
    public String getpassWord() {
        return passWord;
    }
    public void setpassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setGender(String gender){this.gender = gender;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
}
