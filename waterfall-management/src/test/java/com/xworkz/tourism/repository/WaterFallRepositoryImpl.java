package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFall;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WaterFallRepositoryImpl implements WaterFallRepository{

    String jdbcUrl = "jdbc:mysql://localhost:3306/tourism";
    String userName = "root";
    String password = "root@123";

    @Override
    public void saveWaterFall(WaterFall waterFall) {
        System.out.println("Calling Waterfall Repository impl !!!");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String insertedQuery = "INSERT INTO WATERFALL (name,place,river_name,state) " +
                "values(?,?,?,?)";

        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
           connection = DriverManager.getConnection(jdbcUrl,userName,password);
           pstmt = connection.prepareStatement(insertedQuery);

           pstmt.setString(1,waterFall.getName());
            pstmt.setString(2, waterFall.getPlace());
            pstmt.setString(3,waterFall.getRiver_name());
            pstmt.setString(4,waterFall.getState());
            pstmt.execute();
            System.out.println("insertion is done :");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt!=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void saveWaterFall(List<WaterFall> waterFalls) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String insertQuery = "INSERT INTO WATERFALL (NAME_PLACE,RIVER_NAME,STATE) " +
                "VALUES (?,?,?,?)";

        Connection connection = null;
        PreparedStatement pstmt = null;
        try {
           connection = DriverManager.getConnection(jdbcUrl,userName,password);
           pstmt = connection.prepareStatement(insertQuery);

           for (WaterFall waterFall :waterFalls) {
               System.out.println();
               pstmt.setString(1, waterFall.getName());
               pstmt.setString(2, waterFall.getPlace());
               pstmt.setString(3, waterFall.getRiver_name());
               pstmt.setString(4, waterFall.getState());
               pstmt.execute();

           }
            System.out.println("insertion is done :");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt!=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void updateRiverByName(String existingWaterfallName, String updatedRiverName) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        String updateQuery = "update waterfall set river_name=? where name=?";

        Connection connection = null;
        PreparedStatement pstmt = null;
        try{
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            pstmt = connection.prepareStatement(updateQuery);

            pstmt.setString(1,updatedRiverName);
            pstmt.setString(2,existingWaterfallName);

            pstmt.executeUpdate();
            System.out.println("data updated successfully : ");

        }catch (SQLException e){
                throw new RuntimeException();
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt!=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public boolean deleteWaterFallByName(String waterFallName) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            throw new RuntimeException();
        }

        String deletedQuery = "delete from waterfall where name=? ";

        Connection connection = null;
        PreparedStatement pstmt = null;

        try{
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            pstmt = connection.prepareStatement(deletedQuery);

            pstmt.setString(1,waterFallName);
            pstmt.executeUpdate();
            System.out.println("data deleted successfully : ");
            return true;

        }catch (SQLException e){
            throw new RuntimeException();
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt!=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public WaterFall getWaterFallByName(String waterFallName) {
        WaterFall waterFall = new WaterFall();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            throw new RuntimeException();
        }

        String fetchQuery = "select * from waterfall where name=?";

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            pstmt = connection.prepareStatement(fetchQuery);

            pstmt.setString(1,waterFallName);
            rs = pstmt.executeQuery();

            while (rs.next()){
                waterFall.setName(rs.getString("name"));
                waterFall.setPlace(rs.getString("place"));
                waterFall.setRiver_name(rs.getString("river_name"));
                waterFall.setState(rs.getString("state"));
            }

        }catch (SQLException e){
            throw new RuntimeException();
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt!=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return waterFall;
    }

    @Override
    public List<WaterFall> getAllWaterFalls() {
        List<WaterFall> waterFalls = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            throw new RuntimeException();
        }

        String fetchQuery = "select * from waterfall";
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            pstmt = connection.prepareStatement(fetchQuery);
            rs = pstmt.executeQuery();

            while (rs.next()){
                WaterFall waterFall = new WaterFall(rs.getString("name"),
                        rs.getString("place"),
                        rs.getString("river_name"),
                        rs.getString("state"));
                waterFalls.add(waterFall);
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt!=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return waterFalls;
    }

    @Override
    public String getRiverNameByName(String waterFallName) {
        String riverName = " ";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String fetchQuery = "select river_name from waterfall where name=?";

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            pstmt = connection.prepareStatement(fetchQuery);

            pstmt.setString(1,waterFallName);
            rs = pstmt.executeQuery();

            while (rs.next()){
                riverName = rs.getString("river_name");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pstmt!=null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return riverName;
    }

}



