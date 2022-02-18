package controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import dao.UserDao;
import model.UserBean;

@WebServlet("/register")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

	@Resource(name = "jdbc/hotel")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		// 서블릿이 만들어 질때 한번 실행
		userDao = new UserDao(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 유저 입력시 post로 입력 데이터를 전달
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		// 파라메터 아이디, 비밀번호, 이름, 이메일, 전화번호, 주소를 입력받음
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		UserBean user = new UserBean(id, password, name, email, phone, address);

		boolean isSaved = userDao.registerUser(user);
		
		if (isSaved) {
			System.out.println("등록완료");
			request.setAttribute("Message", "등록완료");
			RequestDispatcher dispatcher = request.getRequestDispatcher("main.jsp");
			dispatcher.forward(request, response);
		} else {
			request.setAttribute("Message", "등록실패");
		}

		

	}

}