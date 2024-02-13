package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteApplications {

    public static void main(String args[]){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "root@123";
        String deletedQuery = "DELETE FROM APPLICATIONS WHERE ID=7 ";

        Connection connection = null;
        Statement statement = null;
        try {
            System.out.println("Loading Driver Class --------");
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            statement = connection.createStatement();

            boolean deletedResult = statement.execute(deletedQuery);
            System.out.println("data deletion is executed = "+deletedResult);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (connection!=null) {
                try {
                    connection.close();
                    System.out.println("Close the connection -------");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (statement!=null) {
                try {
                    statement.close();
                    System.out.println("Close the statement -------");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
