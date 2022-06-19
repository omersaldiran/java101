package Jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class DBUpdate {
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        String stSql = "UPDATE student SET student_name='Ahmet ÇELİK' WHERE student_id=5";
        String prSql = "UPDATE student SET student_name=? WHERE student_id=?";
        String url = "jdbc:postgresql://localhost/university?user=postgres&password=postgres";
        try {
            connect = DriverManager.getConnection(url);
            st = connect.createStatement();
            //st.executeUpdate(stSql);
            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setString(1,"Ahmet Özkan");
            pr.setInt(2,5);
            pr.executeUpdate();
            pr.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
