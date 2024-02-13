package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationPreparedInsert {

    public static void main(String args[]){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "root@123";
        String insertQuery = "INSERT INTO APPLICATIONS (ID,NAME,VERSION,SIZE,COMPANY) VALUES (?,?,?,?,?)";

//        String updateQuery = "Update applications set size = ? where id = ? ";

        try {
           Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
           PreparedStatement pstmt = connection.prepareStatement(insertQuery);
//           pstmt.setInt(1,18);
//           pstmt.setString(2,"Oyo");
//           pstmt.setDouble(3,5.1);
//           pstmt.setInt(4,200);
//           pstmt.setString(5,"Oyo Company");
//           pstmt.execute();

           pstmt.setInt(1,19);
           pstmt.setString(2,"Uber");
           pstmt.setDouble(3,5.2);
           pstmt.setInt(4,180);
           pstmt.setString(5,"Uber Company");
           pstmt.execute();

            System.out.println("Inserted data by using prepared statement : ");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
