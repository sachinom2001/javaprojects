package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationPreparedUpdate {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName ="root";
        String password = "root@123";

        String updatedQuery = "Update applications set size = ? where id = ?";


        try {
        Connection connection = DriverManager.getConnection(jdbcUrl,userName,password);
        PreparedStatement pstmt = connection.prepareStatement(updatedQuery);
        pstmt.setInt(1,300);
        pstmt.setInt(2,19);
        pstmt.execute();


            System.out.println("Inserted data by using prepared statement : ");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
