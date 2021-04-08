package DBConnection;
//get data form database//
import java.sql.*;

public class ReceiveData {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String password = "*****";
        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "SELECT * FROM table.name";
            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("columnname"));


            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }}

