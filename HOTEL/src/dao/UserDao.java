package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.UserBean;

public class UserDao {
	
	private DataSource dataSource; // jdbc/demo connection 풀 연결 객체
	private Connection conn;
	private PreparedStatement pstmt;
	
	public UserDao(DataSource dataSource) {
		this.dataSource = dataSource; // 객체 생성시 connection 풀 dataSource를 입력
	}

	public boolean registerUser(UserBean user) { 

		boolean isSaved = false;
		
		String INSERT_USER_SQL = "INSERT INTO customer(id, password, name, email, phone, address) "
				+ "VALUES (?, ?, ?, ?, ?, ?);";
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(INSERT_USER_SQL);

			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone());
			pstmt.setString(6, user.getAddress());

			isSaved = pstmt.executeUpdate() > 0;

		} catch (SQLException e) {
			System.out.println("SQL 에러");
		}

		return isSaved;
	}

}
