package common;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcUtil {
	private static JdbcUtil instance = new JdbcUtil();
	
	private static DataSource ds;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DB연결 성공");
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/hotel"); // 오류시 경로 확인
			System.out.println("Connection Pool 생성");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	private JdbcUtil() {
		
	}
	
	public static JdbcUtil getInstance() {
		return instance;
	}
	public Connection getConnection() throws SQLException{
		return ds.getConnection(); // 풀에서 커넥션 반환
	}
}