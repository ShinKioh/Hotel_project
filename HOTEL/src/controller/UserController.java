package controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 유저 입력시 post로 입력 데이터를 전달
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String action = request.getParameter("action");
		if (action == null) {
			action = "dologin";
		}

		switch (action) {
		case "registerUser":
			registerUser(request, response);
			break;
		case "updateUser":
			updateUser(request, response);
			break;
		case "editUser":
			editUser(request, response);
			break;
		default:
			response.sendRedirect("main/home.jsp");
			break;
		}

	}

	private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
		UserBean user = userDao.findUser(id);
		
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user/editUser.jsp");
		dispatcher.forward(request, response);
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		String id = (String) session.getAttribute("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		UserBean user = new UserBean(id, password, name, email, phone, address);

		// 회원정보 수정
		boolean isUpdated = userDao.updateUser(user);

		if (isUpdated) {
//			HttpSession session = request.getSession();
//			session.setAttribute("id", id);
//			session.setAttribute("password", password);
//			session.setAttribute("name", name);
//			session.setAttribute("email", email);
//			session.setAttribute("phone", phone);
//			session.setAttribute("address", address);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user/myinfo.jsp");
			dispatcher.forward(request, response);
			System.out.println("수정완료");
		} else {
			System.out.println("업데이트 실패");
		}
	}

	private void registerUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		UserBean user = new UserBean(id, password, name, email, phone, address);
		// 회원가입
		boolean isSaved = userDao.registerUser(user);

		if (isSaved) {
			System.out.println("등록완료");
//			HttpSession session = request.getSession();
//			session.setAttribute("id", id);
//			session.setAttribute("password", password);
//			session.setAttribute("name", name);
//			session.setAttribute("email", email);
//			session.setAttribute("phone", phone);
//			session.setAttribute("address", address);
			RequestDispatcher dispatcher = request.getRequestDispatcher("main/main.jsp");
			dispatcher.forward(request, response);
		} else {

		}

	}

}