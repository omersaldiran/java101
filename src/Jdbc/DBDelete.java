package Jdbc;

import java.sql.*;

public class DBDelete {
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        String stSql = "DELETE FROM student WHERE student_id=5";
        String prSql = "DELETE FROM student WHERE student_id=?";
        String url = "jdbc:postgresql://localhost/university?user=postgres&password=postgres";
        try {
            connect = DriverManager.getConnection(url);
            st = connect.createStatement();
            st.executeUpdate(stSql);
            st.close();

            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,2);
            pr.executeUpdate();
            pr.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
