package Jdbc;

import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        String sql = "SELECT * FROM student";
        String url = "jdbc:postgresql://localhost/university?user=postgres&password=postgres";
        try {
            connect = DriverManager.getConnection(url);
            st = connect.createStatement();
            ResultSet data =  st.executeQuery(sql);
            while (data.next()){
                System.out.println("Student ID : " + data.getInt("student_id"));
                System.out.println("Student Name : " + data.getString("student_name"));
                System.out.println("Student Class : " + data.getInt("student_class"));
                System.out.println("*************************");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
