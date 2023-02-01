package com.ssafy.review1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 1. 드라이버 로딩
 *    - 사용하려는 데이터베이스의 드라이버를 프로젝트에 인식시킨다.(빌드)
 *    - Class.forName(구현된 클래스명);
 * 2. 연결 객체   
 * 	  -	Connection con = DriverManager.getConnection(url, username, password);
 * 3. SQL 작성
 * 4. SQL 실행 객체 얻기
 *    - Statement 타입이어야 한다.
 *    - Statement, PreparedStatement(SQL Framework 사용), CallableStatement
 * 5. SQL 실행하기
 *    - select : executeQuery
 *    - select아닌 것 : executeUpdate
 */
public class JDBCTest {
	void employeeList() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		StringBuffer sql = new StringBuffer();
		sql.append("select employee_id, last_name, salary ");
		sql.append("  from employees ");
		sql.append(" order by salary desc limit 5 ");
		try (
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ssafydb", 
					"ssafy",	// userid 
					"ssafy"		// password
			);
			PreparedStatement stmt = con.prepareStatement(sql.toString())
		) {
			ResultSet rs = stmt.executeQuery();  // select 일 경우
//			int cnt = stmt.executeUpdate();  // select 이 아닌 경우
			while (rs.next()) {
				System.out.println(
					rs.getInt("employee_id") + "\t" + 
					rs.getString("last_name") + "\t" +
					rs.getDouble("salary")
				);
			}
		}
		
	}
	public static void main(String[] args) {
		JDBCTest jt = new JDBCTest();
		try {
			jt.employeeList();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}



