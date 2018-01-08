package carSystem.DB_Connect;

import java.sql.*;

/**
 * Created by shuaiyuhao on 2017/12/20.
 */
public class DB_Connect {
    private java.sql.Connection connection = null;
    public static Connection getConnection() {
        Connection conn = null;
        String driver = "com.mysql.jdbc.Driver";
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://127.0.0.1:3306/CAR?charaterEncoding=utf-8&useSSL=true";
            conn = DriverManager.getConnection(url,"root","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public ResultSet querySql(String sqlTxt) throws SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/CAR";

        Statement stmt = null;
        ResultSet rs = null;
        try{
            Class.forName(driver);
            this.connection = DriverManager.getConnection(url, "root", "123456");
            stmt = (Statement) this.connection.createStatement();
            rs = stmt.executeQuery(sqlTxt);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }

        return rs;
    }
    public static void closeConnection(Connection conn){
        // 判断conn是否为空
        if(conn != null){
            try {
                conn.close();	// 关闭数据库连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
