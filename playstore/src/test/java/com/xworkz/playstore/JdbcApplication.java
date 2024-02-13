package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplication {

    public static void main(String[] args) {

        // To perform JDBC Operation
        // Steps for JDBC - 6 steps

        // 1. Load and register Driver Class = Create an object of a class
        // 2. Get connection from Database (DriverManager class)
        // 3. Create a Statement
        // 4. Execute sql queries or sql statements
        // 5. Process the result from Resultant data
        // 6. Close the Costly Resources -
              //Connection , Statement


        // 1. Load and register Driver Class = Create an object of a class --
        try {
            Class.forName("com.mysql.jdbc.Driver");  //Driver-class , forName("FQCN") -fully qualified class name
                                                                // forName , getConnection - static methods
            System.out.println(" Loading Driver Class !!!!!!!!!!!!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "root@123";
        String insertQuery ="INSERT INTO applications (id,name,version,size,company) VALUES(11,'Snapchat',3.1,50,'META')";

        String query1="INSERT INTO applications (id,name,version,size,company) VALUES(12,'Hotstar',3.2,50,'META')";

        String query2="INSERT INTO applications (id,name,version,size,company) VALUES(13,'Amazon',2.6,100,'META')";

        String query3 = "INSERT INTO applications (id,name,version,size,company) VALUES (7,'Xworkz',4.1,150,'META')";

        String query4 = "INSERT INTO APPLICATIONS (ID,NAME,VERSION,SIZE,COMPANY) VALUES (14,'YOUTUBE',4.3,200,'META')";

        String query5 = "INSERT INTO APPLICATIONS (ID,NAME,VERSION,SIZE,COMPANY) VALUES (15,'GOOGLE',4.5,200,'META')";

        String query6 = "INSERT INTO APPLICATIONS (ID,NAME,VERSION,SIZE,COMPANY) VALUES(16,'CHROME',4.7,180,'META')";

        Connection conn = null;
        Statement stm = null;
        try {
            conn = DriverManager.getConnection(jdbcUrl,userName,password);
            stm = conn.createStatement();

//            boolean result = stm.execute(insertQuery);
//            boolean result1 = stm.execute(query1);
            boolean result2 = stm.execute(query6);

            System.out.println("Execute return type = "+ result2);

            System.out.println("Insert data into database !!!!!!!!!!!!");
            System.out.println("Get Connection from database");
        } catch (Exception e) {
//            throw new RuntimeException(e);
//            System.out.println("you entered incorrect url !!");
        }

        // 6. Close the Costly  Resources --
        finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Close the connection !!!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stm != null) {
                try {
                    stm.close();
                    System.out.println(" Close the Statement !!!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
