package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import model.LoginBean;

public class LoginDao {
	
	private DataSource dataSource;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public LoginDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public boolean validate(LoginBean loginBean) {
		boolean status = false;
		String sql = "SELECT * FROM customer WHERE id = ? and password = ?";
		
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginBean.getId());
			pstmt.setString(2, loginBean.getPassword());
			
			rs = pstmt.executeQuery();
			
			status = rs.next();
			if(status) {
				System.out.println("로그인 됨");
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 에러");
			
		} 
		return status;	
	}
	
}