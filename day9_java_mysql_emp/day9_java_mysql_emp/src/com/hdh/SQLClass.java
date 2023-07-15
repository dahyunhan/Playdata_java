package com.hdh;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLClass {
    public SQLClass() {
    }

    DBConnector dbConnector = new DBConnector();

    public void close(ResultSet rs, PreparedStatement psmst) {

        try {

            rs.close();
            psmst.close();
        } catch (SQLException e) {
            System.out.println("close err : " + e.getMessage());
        }
    }

//    public void selectClose(ResultSet rs, Statement smst){
//        try {
//
//            rs.close();
//            smst.close();
//        } catch (SQLException e) {
//            System.out.println("close err : " + e.getMessage());
//        }
//    }


    public void selectAll() {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = dbConnector.conn.createStatement();
            rs = stmt.executeQuery("select *from employee");

            while (rs.next()) {

                String names = rs.getString("empName");
                System.out.println(names);
            }
        } catch (SQLException e) {
            System.out.println("select error! : " + e.getMessage());
        }
//        finally{
//
//            try{
//                dbConnector.conn.close();
//                System.out.println("end all");
//            }catch(SQLException e){
//                System.out.println("close err! : "+e.getMessage());
//            }
//        }
//        finally {
//
//            try {
//              rs.close();
//              stmt.close();
//                dbConnector.conn.close();
//
//            } catch (SQLException e) {
//                System.out.println("close err! : " + e.getMessage());
    }
//}
//    }

//    public void selectOne() {
//
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        int idx = 1;
//        String query = "select *from testdb where id = ?";
//
//        try {
//            pstmt = dbConnector.conn.prepareStatement(query);
//            pstmt.setInt(1, idx);
//            rs = pstmt.executeQuery();
//            while (rs.next()) {
//
//                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
//
//
//            }
//
//        } catch (SQLException e) {
//            System.out.println("selectOne err! : " + e.getMessage());
//        } finally {
//
//            try {
//
//                dbConnector.conn.close();
//                System.out.println("end all");
//            } catch (SQLException e) {
//                System.out.println("close err! : " + e.getMessage());
//            }
//        }
//        close(rs, pstmt);
//
//    }

    public void insert() {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = "insert into employee values (seq_no,?,?,?,?,?,?,?,?)";

        try {
            pstmt = dbConnector.conn.prepareStatement(query);
            System.out.println("입력 요망");
            Scanner scanner = new Scanner(System.in);
            int empNo = scanner.nextInt();
            pstmt.setInt(1, empNo);
            String empName = scanner.next();
            pstmt.setString(2, empName);
            String job = scanner.next();
            pstmt.setString(3, job);
            String mgr = scanner.next();
            pstmt.setString(4, mgr);
            String hireDate = scanner.next();
            pstmt.setString(5, hireDate);
            int sale = scanner.nextInt();
            pstmt.setInt(6, sale);
            String commission = scanner.next();
            pstmt.setString(7, commission);
            int depNo = scanner.nextInt();
            pstmt.setInt(8, depNo);
            rs = pstmt.executeQuery();

//            while (rs.next()) {
//
//                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
//                System.out.println("잘들어감");
//
//            }

        } catch (SQLException e) {
            System.out.println("selectOne err! : " + e.getMessage());
        }
//        finally{
//
//        try{
//
//        dbConnector.conn.close();
//        System.out.println("end all");
//        }catch(SQLException e){
//        System.out.println("close err! : "+e.getMessage());
//        }
//        }
//        close(rs, pstmt);
    }

    public void update() {

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String query = "update employee set sale=sale*1.1";

        try {
            pstmt = dbConnector.conn.prepareStatement(query);

            rs = pstmt.executeQuery();
//            while (rs.next()) {
//
//                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
//
//
//            }

        } catch (SQLException e) {
            System.out.println("selectOne err! : " + e.getMessage());
        }
//        finally{
//
//        try{
//
//        dbConnector.conn.close();
//        System.out.println("end all");
//        }catch(SQLException e){
//        System.out.println("close err! : "+e.getMessage());
//        }
//        }
//        close(rs, pstmt);
    }

    public void delete() {

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String query = "delete from  employee where job=?";

        try {
            pstmt = dbConnector.conn.prepareStatement(query);
            pstmt.setString(1, "과장");
            rs = pstmt.executeQuery();
//            while (rs.next()) {
//
//                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
//
//
//            }

        } catch (SQLException e) {
            System.out.println("selectOne err! : " + e.getMessage());
        }
//        finally{
//
//        try{
//        dbConnector.conn.close();
//        System.out.println("end all");
//        }catch(SQLException e){
//        System.out.println("close err! : "+e.getMessage());
//        }
//        }
//        close(rs, pstmt);
    }
}
