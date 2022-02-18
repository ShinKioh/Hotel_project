package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB 연결을 도와주는 class
public class Utils {
    // demo 데이터베이스 , useSSL=false : SSL 인증을 사용하지 않음, 
    private static String jdbcURL = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "1234";
    
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 0
			conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword); 
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스 못찾음");
			
		} catch (SQLException e) {
			System.out.println("SQL 에러");
		}
		// DB 연결 성공
		System.out.println("연결성공");
		return conn; // DB에 연결하여 connection을 받아옴
	}
	
}
