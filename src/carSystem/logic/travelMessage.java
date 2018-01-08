package carSystem.logic;

import carSystem.DB_Connect.DB_Connect;
import carSystem.Info.travelInfo;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by shuaiyuhao on 2017/12/21.
 */
public class travelMessage {
    //乘客行程信息存入
    public void savePasTravel(travelInfo travelinfo){
        Connection conn = DB_Connect.getConnection();
        String sql ="insert into passengerForm(startPlace,endPlace,peopleNum,startDate) values(?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,travelinfo.getstartPlace());
            ps.setString(2,travelinfo.getendPlace());
            ps.setString(3,travelinfo.getpeopleNum());
            ps.setString(4,travelinfo.getstartDate());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB_Connect.closeConnection(conn);
        }
    }

    //司机信息存入
    public void saveDriTravel(travelInfo travelinfo){
        Connection conn = DB_Connect.getConnection();
        String sql ="insert into driverForm(startDate,startPlace,endPlace,sitNum) values(?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,travelinfo.getstartDate());
            ps.setString(2,travelinfo.getstartPlace());
            ps.setString(3,travelinfo.getendPlace());
            ps.setString(4,travelinfo.getsitNum());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB_Connect.closeConnection(conn);
        }
    }

//    ArrayList<PassengerFormEntity> PasForm = new ArrayList<>();
//    ResultSet rs = null;
//    Connection conn = DB_Connect.getConnection();
//    String sql = "select * from passengerForm"

    public ArrayList<travelInfo> getPassengerForm() throws SQLException{
        ArrayList<travelInfo> travelInfos = new ArrayList<travelInfo>();
        ResultSet rs = null;
        DB_Connect db = new DB_Connect();
        String sql = "select * from passengerForm";
        rs = db.querySql(sql);
        while (rs.next()){
            travelInfo t = new travelInfo();
            t.setstartDate(rs.getString("startDate"));
            t.setstartPlace(rs.getString("startPlace"));
            t.setendPlace(rs.getString("endPlace"));
            t.setmoney(rs.getString("money"));
            t.setpeopleNum(rs.getString("peopleNum"));
            travelInfos.add(t);
        }
        return travelInfos;


    }

    public ArrayList<travelInfo> getDriverForm() throws SQLException{
        ArrayList<travelInfo> travelInfos = new ArrayList<travelInfo>();
        ResultSet rs = null;
        DB_Connect db = new DB_Connect();
        String sql = "select * from DriverForm";
        rs = db.querySql(sql);
        while (rs.next()){
            travelInfo t = new travelInfo();
            t.setstartDate(rs.getString("startDate"));
            t.setstartPlace(rs.getString("startPlace"));
            t.setendPlace(rs.getString("endPlace"));
            t.setpeopleNum(rs.getString("sitNum"));
            travelInfos.add(t);
        }
        return travelInfos;


    }



}
