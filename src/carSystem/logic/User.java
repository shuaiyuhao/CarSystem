package carSystem.logic;

import carSystem.DB_Connect.DB_Connect;
import carSystem.Info.userInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by shuaiyuhao on 2017/12/20.
 */
public class User {
    //用户登陆
    public userInfo login(String userName, String passWord) {
        userInfo user_info = null;
        Connection conn = DB_Connect.getConnection();
        //根据用户名和密码查询用户信息
        String sql = "select * from User where userName = ? and passWord = ?";
        try {
            // 获取PreparedStatement对象
            PreparedStatement ps = conn.prepareStatement(sql);
            // 对SQL语句的占位符参数进行动态赋值
            ps.setString(1, userName);
            ps.setString(2, passWord);
            // 执行查询获取结果集
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user_info = new userInfo();
                user_info.setuserName(rs.getString("username"));
                user_info.setpassWord(rs.getString("password"));
                rs.close();
                ps.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DB_Connect.closeConnection(conn);
        }
        return user_info;
    }
    //用户注册
    public void saveUser(userInfo userinfo){
        Connection conn = DB_Connect.getConnection();
        String sql = "INSERT into User(userName,passWord) values(?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,userinfo.getuserName());
            ps.setString(2,userinfo.getpassWord());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB_Connect.closeConnection(conn);
        }
    }

    //判断用户是否存在
    public boolean userIsExist(String userName){
        Connection conn = DB_Connect.getConnection();
        String sql = "select * from User where userName = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            // 对用户对象属性赋值
            ps.setString(1,userName);
            // 执行查询获取结果集
            ResultSet rs = ps.executeQuery();
            if(!rs.next()){
                // 如果无效则证明此用户名可用
                return true;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DB_Connect.closeConnection(conn);
        }
        return false;
    }

}
