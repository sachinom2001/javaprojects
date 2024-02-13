package com.xworkz.playstore;

import java.sql.*;

public class ApplicationsUpdate {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "root@123";

//        String updatedQuery = "UPDATE applications SET SIZE=250 WHERE NAME='Snapchat'";

        String updatedQuery1 = "UPDATE applications SET VERSION=3 WHERE NAME='FACEBOOK'";

        String updatedQuery2 = "UPDATE applications SET VERSION=4 , SIZE=300 WHERE NAME='TWITTER'";

        String updatedQuery3 = "UPDATE applications SET SIZE=230 WHERE NAME='HOTSTAR' ";

        String updatedQuery4 = "UPDATE applications SET VERSION=5 WHERE ID=9";

        String updatedQuery5 = "UPDATE applications SET SIZE=180 WHERE ID=10 ";

        String updatedQuery6 = "UPDATE applications SET VERSION=3.6 , SIZE=300 WHERE NAME='NAUKRI'";

        String updatedQuery7 = "UPDATE applications SET SIZE=400 WHERE ID=5";

        String updatedQuery8 = "UPDATE applications SET VERSION=4.3 WHERE NAME='INSTAGRAM'";

        String updatedQuery9 = "UPDATE applications SET SIZE=250 WHERE ID=6";

        String updatedQuery10 = "UPDATE applications SET VERSION=3.8 WHERE ID=7 ";

        Connection connection = null;
        Statement statement = null;
        try {
            System.out.println("Loading Driver class !!!!!!");
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            statement = connection.createStatement();

           boolean updatedResult1 = statement.execute(updatedQuery1);
           boolean updateResult2 = statement.execute(updatedQuery2);
           boolean updateResult3 = statement.execute(updatedQuery3);
           boolean updateResult4 = statement.execute(updatedQuery4);
           boolean updateResult5 = statement.execute(updatedQuery5);
           boolean updateResult6 = statement.execute(updatedQuery6);
           boolean updateResult7 = statement.execute(updatedQuery7);
           boolean updateResult8 = statement.execute(updatedQuery8);
           boolean updateResult9 = statement.execute(updatedQuery9);
           boolean updateResult10 = statement.execute(updatedQuery10);

           System.out.println("data updated is executed = "+ updatedResult1+" "+updateResult2+" "+updateResult3+" "+updateResult4+
                   " "+updateResult5+" "+updateResult6+" "+updateResult7+" "+updateResult8+" "+updateResult9+" "+updateResult10);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection!=null) {
                try {
                    connection.close();
                    System.out.println("Close the connection !!!!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (statement!=null) {
                try {
                    statement.close();
                    System.out.println("Close the statement !!!!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
