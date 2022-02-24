package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.UserBean;

public class UserDao {

	private DataSource dataSource; // jdbc/hotel connection 풀 연결 객체
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

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

	public boolean updateUser(UserBean user) {
		boolean isUpdated = false;

		String UPDATE_USER_SQL = "UPDATE customer SET password=?, name=?, email=?, phone=?, address=? where id=?";

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(UPDATE_USER_SQL);

			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getPhone());
			pstmt.setString(5, user.getAddress());
			pstmt.setString(6, user.getId());

			isUpdated = pstmt.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SQL 업데이트 에러");
		}
		return isUpdated;
	}

	public UserBean findUser(String id) {

		UserBean user = null;

		String FIND_USER_SQL = "SELECT * FROM customer where id=?";

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(FIND_USER_SQL);

			pstmt.setString(1,id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new UserBean();
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("address"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SQL 업데이트 에러");
		}
		return user;
	}

}