package Jdbc;

import java.sql.*;

public class DBInsert {
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        String sql = "INSERT INTO student (student_name,student_class) VALUES ('Büşra',5)";
        String prsql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";
        String url = "jdbc:postgresql://localhost/university?user=postgres&password=postgres";
        try {
            connect = DriverManager.getConnection(url);
            //st = connect.createStatement();
            //st.executeUpdate(sql);

            PreparedStatement prst = connect.prepareStatement(prsql);
            prst.setString(1,"Ahmet");
            prst.setInt(2,7);
            prst.executeUpdate();
            prst.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
