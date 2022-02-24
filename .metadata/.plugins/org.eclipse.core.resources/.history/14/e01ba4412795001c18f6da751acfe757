<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	String id = request.getParameter("id");

if (!id.contains("@") && !id.contains(".")) { // id에 @와 .이 있을 경우
	try {
		String url = "jdbc:mysql://localhost:3306/hotel?useSSL=false";
		Connection conn = DriverManager.getConnection(url, "root", "1234");

		PreparedStatement pstmt = conn.prepareStatement("select * from customer where id=?");
		pstmt.setString(1, id);

		ResultSet rs = pstmt.executeQuery(); // sql실행 후 결과를 rs에 저장

		if (rs.next()) {
	out.print("이미 존재하는 아이디입니다.");
		} else {
	out.print("사용 가능한 아이디입니다.");
		}
		conn.close();

	} catch (Exception e) {
		e.printStackTrace(); // 예외출력
	}
};
%>