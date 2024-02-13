package com.xworkz.playstore;

import java.sql.*;

public class FetchingPreparedData {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "root@123";
        String fetchQuery = "SELECT * FROM APPLICATIONS";

        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
           connection = DriverManager.getConnection(jdbcUrl,userName,password);
           pstmt = connection.prepareStatement(fetchQuery);
//           pstmt.setInt(1,1);
           ResultSet rs = pstmt.executeQuery();

           while (rs.next()){
               System.out.println("{ id = "+ rs.getInt(1)+" "+", name = "+rs.getString(2)+" "+
                       ", version =" +rs.getDouble(3)+" "+", size = "+rs.getInt(4)+" "+
                               ", company = "+rs.getString(5)+" }");
               System.out.println();
           }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
