package Jdbc;

import java.sql.*;

public class DBTrans {
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        String url = "jdbc:postgresql://localhost/university?user=postgres&password=postgres";
        try {
            connect = DriverManager.getConnection(url);
            connect.setAutoCommit(false);
            PreparedStatement pr = connect.prepareStatement("INSERT INTO student (student_name,student_class) VALUES (?,?)");
            pr.setString(1,"Zeynep");
            pr.setInt(2,4);
            pr.executeUpdate();

            if(true){
                throw new SQLException();
            }

            pr.setString(1,"Doğu");
            pr.setInt(2,3);
            pr.executeUpdate();

            connect.commit();

        }catch (SQLException e){
            if(connect!=null){
                try {
                    connect.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}
