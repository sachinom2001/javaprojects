package com.xworkz.playstore;

import java.sql.*;

public class FetchingData {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "root@123";
        String fetchQuery = "SELECT * from applications";

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            statement = connection.createStatement();
//           boolean fetchResult = statement.execute(fetchQuery);
//            System.out.println(fetchResult);

            ResultSet rs = statement.executeQuery(fetchQuery);

            //for fetching data we use while loop
            while (rs.next()){
                System.out.println("Record Exist !!!!!!");

//                  String name = rs.getString(1);
                String name = rs.getString("name");
                int size = rs.getInt("size");
                String version = rs.getString("version");
                String company = rs.getString("company");

                System.out.println(name+" "+size+" "+version+" "+company);
                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
