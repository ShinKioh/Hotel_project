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

import dao.LoginDao;
import model.LoginBean;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginDao loginDao;

	@Resource(name = "jdbc/hotel")
	private DataSource dataSource;

	public void init() throws ServletException {
		loginDao = new LoginDao(dataSource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login/login.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setId(id);
		loginBean.setPassword(password);

		if (loginDao.validate(loginBean)) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("main/home.jsp");
			dispatcher.forward(request, response);

		} else {
			
		}

	}

}