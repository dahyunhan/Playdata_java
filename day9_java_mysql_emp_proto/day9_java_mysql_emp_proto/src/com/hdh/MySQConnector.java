package com.hdh;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQConnector {
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://localhost:3306/day9";
	private String id_mysql = "root";
	private String pw_mysql = ""; // 본인 비밀번호

	public Connection conn = null;


	public MySQConnector() { // 기본 생성자
	}
	
	/** MySQL Connect Method **/
	public void connectMySQL() {


	} //  connectMySQL() END

	
	/** 테이블 데이터 전체 조회 **/
	public void selectAll() {

	} // selectAll() END

	/** 테이블 데이터 하나만 조회 **/
	public void selectOne() {

	} // selectOne() END

	/** 테이블에 데이터 삽입(추가) **/
	public void insert() {
	
	} // insert() END


	
	/** 테이블 데이터 수정 **/
	public  void update() {


	} // update() END

	/** 테이블 데이터 삭제 **/
	public void delete() {

	} // delete() END

	
	/** 자원 해제 메서드들 : Overloading 기법 **/
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
