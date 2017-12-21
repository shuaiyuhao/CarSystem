package carSystem.Info;

/**
 * Created by shuaiyuhao on 2017/12/21.
 */
public class travelInfo {
    private String startDate;
    private String startPlace;
    private String endPlace;
    private String sitNum;
    private String peopleNum;

    public String getstartDate(){return startDate;}
    public String getstartPlace(){return startPlace;}
    public String getendPlace(){return endPlace;}
    public String getsitNum(){return sitNum;}
    public String getpeopleNum(){return peopleNum;}

    public void setstartDate(String startDate){this.startDate = startDate;}
    public void setstartPlace(String startPlace){this.startPlace = startPlace;}
    public void setendPlace(String endPlace){this.endPlace = endPlace;}
    public void setsitNum(String sitNum){this.sitNum = sitNum;}
    public void setpeopleNum(String peopleNum){this.peopleNum = peopleNum;}
}
