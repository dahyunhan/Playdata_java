package com.hdh.db;

import com.hdh.dto.Students;

import java.sql.*;
import java.util.ArrayList;

public class MySQLconnector {
    private String driver = "org.mariadb.jdbc.Driver";
    private String url = "jdbc:mariadb://localhost:3306/db_bootcamp";
    private String id_mysql = "root";
    private String pw_mysql = ""; // 본인 비밀번호
    public Connection conn = null;
    ArrayList<Students> selectAll = null;

    public MySQLconnector() { // 기본 생성자
    }

    /**
     * MySQL Connect Method
     **/
    public void connectMySQL() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, id_mysql, pw_mysql);
            System.out.println(" MySQL 접속 성공 !!!");

        } catch (ClassNotFoundException e) {
            System.out.println("Class.forName(driver) ERR : " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("getConnection() ERR : " + e.getMessage());
        }
    } //  connectMySQL() END

    /**
     * 테이블 데이터 전체 조회
     **/
    public void selectAll() {
        String selectAllQuery = "select * from bootcamp2";
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(selectAllQuery);

            while (rs.next()) {
                selectAll = new ArrayList<Students>();

                String cName = rs.getString("cName");
                String cRating = rs.getString("cRating");
                String cJoinDate = rs.getString("cJoinDate");
                String cLastDate = rs.getString("cLastDate");
                int cVisitNo = rs.getInt("cVisitNo");
                int cPostNo = rs.getInt("cPostNo");
                int cCommentNo = rs.getInt("cCommentNo");
                String cGenger = rs.getString("cGenger");
                String cAge = rs.getString("cAge");

                selectAll.add(new Students(cName, cRating, cJoinDate, cLastDate, cVisitNo, cPostNo, cCommentNo, cGenger, cAge));
                System.out.println(selectAll.toString());
            }
        } catch (SQLException e) {
            System.out.println("selectAll() ERR: " + e.getMessage());
        } finally {
            close(stmt, rs);
        }
        System.out.println("======전체 레코드 조회 성공======");

    }//SelectAll END()

    public void update() {
        String query = "update bootcamp2 set cGenger='기타' where cGenger='남'" ;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery(query);

            while (rs.next()) {


                String cName = rs.getString("cName");
                String cGenger = rs.getString("cGenger");


                System.out.println(cName + " : " + cGenger);

            }
        } catch (SQLException e) {
            System.out.println("ageVisit ERR: " + e.getMessage());
        } finally {
            close(pstmt, rs);
        }
        System.out.println("======update 성공======");



    } // update() END
    public void insert() {
        PreparedStatement pstmt = null;
        String queryInsert ="insert into bootcamp2 (cName, cRating, cJoinDate, cLastDate, cVisitNo, cPostNo, cCommentNo, cGenger, cAge) values (?,?,?,?,?,0,0,?,?)";
        Students emp = new Students ("마동석", "멤버", "2023.07.05", "2023.07.05", 99, 0, 0 ,"남자", "30대 후반");
        int n = 0;


        try {
            pstmt = conn.prepareStatement(queryInsert);
            pstmt.setString(1, emp.getcName());
            pstmt.setString(2, emp.getcRating());
            pstmt.setString(3, emp.getcJoinDate());
            pstmt.setString(4, emp.getcLastDate());
            pstmt.setInt(5, emp.getcVisitNo());
            pstmt.setString(6, emp.getcGenger());
            pstmt.setString(7, emp.getcAge());
            n = pstmt.executeUpdate();

            if(n > 0) {
                System.out.println(n + " 개의 RECORD insert Success!!!");
            }
        }catch (SQLException e) {
            System.out.println("insert()  ERR : " + e.getMessage());
        } finally {
            this.close(pstmt);
        }
        System.out.println("데이터 삽입 성공");

    } // insert() END
    public void overAvg() {

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        ArrayList<Students> temp =new ArrayList<>();
        int sum = 0;

        for(int idx = 0; idx < selectAll.size(); idx++) {
            sum += selectAll.get(idx).getcVisitNo();
        }
        int Avg = (sum / selectAll.size());

        String overAvgQuery = " select * from bootcamp2 where cVisitNo > (?)and cName";

        System.out.println(Avg);


        try {
            pstmt = conn.prepareStatement(overAvgQuery);
            rs = pstmt.executeQuery();
            pstmt.setInt(1, Avg);


            while(rs.next()) {

                String cName = rs.getString("cName");
                String cRating = rs.getString("cRating");
                String cJoinDate = rs.getString("cJoinDate");
                String cLastDate = rs.getString("cLastDate");
                int cVisitNo = rs.getInt("cVisitNo");
                int cPostNo = rs.getInt("cPostNo");
                int cCommentNo = rs.getInt("cCommentNo");
                String cGenger = rs.getString("cGenger");
                String cAge = rs.getString("cAge");

                temp.add(new Students(cName, cRating, cJoinDate, cLastDate, cVisitNo, cPostNo, cCommentNo, cGenger, cAge));
                System.out.println(temp.toString());
            }


        } catch (SQLException e) {
            System.out.println("overAvg ERR : " + e.getMessage());
        }
//        System.out.println("평균방문 횟수: "+ Avg);
        System.out.println("======평균 방문 횟수 이상 출력 완료======");
    }//overAvg() END
    public void ageVisit() {
        String query = "select *from bootcamp2 where cAge='비공개'";
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery(query);


            while (rs.next()) {


                String cName = rs.getString("cName");
                String cVisitNo = Integer.toString(rs.getInt("cVisitNo"));
                String cAge = rs.getString("cAge");

                System.out.println(cName + " : " + cVisitNo);

            }
        } catch (SQLException e) {
            System.out.println("ageVisit ERR: " + e.getMessage());
        } finally {
            close(pstmt, rs);
        }
        System.out.println("======ageVisit 성공======");


    } // ageVisit() END

    /**
     * 자원 해제 메서드들 : Overloading 기법
     **/
    public void close(Statement stmt, ResultSet rs) {
        try {
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Statement, ResultSet CLOSE  ERR : " + e.getMessage());
        }
    } // close() END

    public void close(PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("PreparedStatement, ResultSet  CLOSE  ERR : " + e.getMessage());
        }
    } // close() END

    public void close(PreparedStatement pstmt) {
        try {
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("PreparedStatement  CLOSE  ERR : " + e.getMessage());
        }
    } // close() END

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Connection  CLOSE  ERR : " + e.getMessage());
        }
    } // close() END
}

