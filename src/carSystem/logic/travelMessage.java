package carSystem.logic;

import carSystem.DB_Connect.DB_Connect;
import carSystem.Info.travelInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
