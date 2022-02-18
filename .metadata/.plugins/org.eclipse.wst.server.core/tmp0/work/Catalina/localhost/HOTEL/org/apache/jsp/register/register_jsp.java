/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-02-18 01:19:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.register;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css\">\r\n");
      out.write("<title>회원가입 페이지</title>\r\n");
      out.write("</head>	\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("			<div class=\"container-fluid\">\r\n");
      out.write("				<a class=\"navbar-brand\" href=\"#\"> <img\r\n");
      out.write("					src=\"img/premium-icon-letter-h-5540593.png\" alt=\"\" width=\"30\"\r\n");
      out.write("					height=\"30\" class=\"d-inline-block align-text-top\"> <span\r\n");
      out.write("					class=\"navbar-brand mb-0 h1\">Hotels 4TEAM</span>\r\n");
      out.write("				</a>\r\n");
      out.write("				<div class=\"d-flex justify-content-end\">\r\n");
      out.write("					<div class=\"dropdown mr-2\">\r\n");
      out.write("						<a class=\"btn btn-outline-secondary dropdown-toggle\" href=\"#\"\r\n");
      out.write("							role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\"\r\n");
      out.write("							aria-expanded=\"false\"> 도움말 </a>\r\n");
      out.write("						<div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"#\">공지 사항</a> <a\r\n");
      out.write("								class=\"dropdown-item\" href=\"#\">문의 사항</a> <a\r\n");
      out.write("								class=\"dropdown-item\" href=\"#\">FAQ</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<a class=\"btn btn-primary mr-2\" href=\"../register/register.jsp\">회원가입</a>\r\n");
      out.write("					<a class=\"btn btn-primary mr-2\" href=\"../login/login.jsp\">로그인</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("	</header>\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row mt-5\">\r\n");
      out.write("			<div class=\"col-md-6 mx-auto\">\r\n");
      out.write("				<h1 class=\"text-center\">회원가입</h1>\r\n");
      out.write("				<form action=\"");
      out.print(request.getContextPath());
      out.write("/register\" method=\"post\">\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<input type=\"hidden\" name=\"action\" value=\"dologin\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"id\">아이디</label> <input type=\"text\" name=\"id\"\r\n");
      out.write("							placeholder=\"아이디\"> <input type=\"button\"\r\n");
      out.write("							onclick=\"sendServer()\" value=\"중복체크\">\r\n");
      out.write("						<div id=\"output\"></div>\r\n");
      out.write("\r\n");
      out.write("						<script type=\"text/javascript\">\r\n");
      out.write("							const input = document\r\n");
      out.write("									.querySelector('input[type=\"text\"]'); // 태그타입으로 선택\r\n");
      out.write("							const output = document.getElementById('output');\r\n");
      out.write("							const request = new XMLHttpRequest(); // Ajax request 객체 생성\r\n");
      out.write("\r\n");
      out.write("							function sendServer() {\r\n");
      out.write("								// 버튼을 누르면 실행되는 함수\r\n");
      out.write("								let id = input.value; // input창에 입력한 값\r\n");
      out.write("								let url = 'idCheck.jsp?id=' + id; // 요청할 jsp페이지 주소\r\n");
      out.write("\r\n");
      out.write("								request.open('GET', url, true);\r\n");
      out.write("								request.send();\r\n");
      out.write("								request.onreadystatechange = getInfo;\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("							function getInfo() {\r\n");
      out.write("								if (request.readyState == 4\r\n");
      out.write("										&& request.status == 200) {\r\n");
      out.write("									let info = request.responseText; // 요청한 결과 받기\r\n");
      out.write("									output.textContent = info;\r\n");
      out.write("								}\r\n");
      out.write("							};\r\n");
      out.write("						</script>\r\n");
      out.write("						<br>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"id\">비밀번호</label> <input type=\"text\" name=\"password\"\r\n");
      out.write("							placeholder=\"비밀번호\"><br>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"id\">이름</label> <input type=\"text\" name=\"name\"\r\n");
      out.write("							placeholder=\"이름\"><br>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"id\">이메일</label> <input type=\"text\" name=\"email\"\r\n");
      out.write("							placeholder=\"이메일\"><br>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"id\">휴대폰번호</label> <input type=\"text\" name=\"phone\"\r\n");
      out.write("							placeholder=\"휴대폰번호\"><br>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"id\">주소</label> <input type=\"text\" name=\"address\"\r\n");
      out.write("							placeholder=\"주소\"><br>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-outline-success\">가입하기</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<footer class=\"footer font-small black\">\r\n");
      out.write("		<div class=\"footer-copyright text-center py-3\">\r\n");
      out.write("			© 2022 Copyright: <b> BusanIT 4Team</b>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
