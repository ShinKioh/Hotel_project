/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-02-23 03:40:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css\">\n");
      out.write("<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>\n");
      out.write("<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>\n");
      out.write("<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>\n");
      out.write("<title>내정보 관리</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<header>\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("			<div class=\"container-fluid\">\n");
      out.write("				<a class=\"navbar-brand\" href=\"home.jsp\"> <img\n");
      out.write("					src=\"img/premium-icon-letter-h-5540593.png\" alt=\"\" width=\"30\"\n");
      out.write("					height=\"30\" class=\"d-inline-block align-text-top\"> <span\n");
      out.write("					class=\"navbar-brand mb-0 h1\"><b>Hotels 4TEAM</b></span>\n");
      out.write("				</a>\n");
      out.write("				<div class=\"d-flex justify-content-end\">\n");
      out.write("					<span class=\"navbar-brand mb-0 h1\"> <b>");
      out.print(session.getAttribute("id"));
      out.write("님\n");
      out.write("							환영합니다</b>\n");
      out.write("					</span>\n");
      out.write("					<div class=\"dropdown mr-2\">\n");
      out.write("						<a class=\"btn btn-outline-secondary dropdown-toggle\" href=\"#\"\n");
      out.write("							role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\"\n");
      out.write("							aria-expanded=\"false\"> 도움말 </a>\n");
      out.write("						<div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("							<a class=\"dropdown-item\" href=\"#\">공지 사항</a> <a\n");
      out.write("								class=\"dropdown-item\" href=\"#\">문의 사항</a>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"dropdown mr-2\">\n");
      out.write("						<a class=\"btn btn-outline-secondary dropdown-toggle\" href=\"#\"\n");
      out.write("							role=\"button\" id=\"dropdownMenuLink\" data-toggle=\"dropdown\"\n");
      out.write("							aria-expanded=\"false\"> 마이페이지 </a>\n");
      out.write("						<div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink\">\n");
      out.write("							<a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/register?action=editUser\">내정보관리</a>\n");
      out.write("							<a class=\"dropdown-item\" href=\"#\">예약 현황</a>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<a class=\"btn btn-primary mr-2\" href=\"main.jsp\">로그아웃</a>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</nav>\n");
      out.write("	</header>\n");
      out.write("	<main>\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"row mt-5\">\n");
      out.write("				<div class=\"col-md-6 mx-auto\">\n");
      out.write("					<h4 class=\"text-center mb-3\">내 정보 수정</h4>\n");
      out.write("\n");
      out.write("					<form action=\"");
      out.print(request.getContextPath());
      out.write("/register\" method=\"post\">\n");
      out.write("						<div class=\"form-group\">\n");
      out.write("							<input type=\"hidden\" name=\"action\" value=\"updateUser\">\n");
      out.write("						</div>\n");
      out.write("						<div class=\"register-form\">\n");
      out.write("							<table>\n");
      out.write("								<tbody>\n");
      out.write("									<tr>\n");
      out.write("										<th><label for=\"id\">아이디</label></th>\n");
      out.write("										<td><input type=\"text\" name=\"id\" id=\"id\"\n");
      out.write("											readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\"></td>\n");
      out.write("									</tr>\n");
      out.write("									<tr>\n");
      out.write("										<th><label for=\"password\">비밀번호</label>\n");
      out.write("										</th>\n");
      out.write("										<td><input type=\"text\" name=\"password\" id=\"password\"\n");
      out.write("											required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\"></td>\n");
      out.write("									</tr>\n");
      out.write("									<tr>\n");
      out.write("										<th><label for=\"name\">이름</label>\n");
      out.write("										</th>\n");
      out.write("										<td><input type=\"text\" name=\"name\" id=\"name\" required\n");
      out.write("											value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\"></td>\n");
      out.write("									</tr>\n");
      out.write("									<tr>\n");
      out.write("										<th><label for=\"email\">이메일</label></th>\n");
      out.write("										<td><input type=\"text\" name=\"email\" id=\"email\" required\n");
      out.write("											value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\"></td>\n");
      out.write("									</tr>\n");
      out.write("									<tr>\n");
      out.write("										<th><label for=\"phone\">휴대폰번호</label></th>\n");
      out.write("										<td><input type=\"text\" name=\"phone\" id=\"phone\" required\n");
      out.write("											value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\"></td>\n");
      out.write("									</tr>\n");
      out.write("									<tr>\n");
      out.write("										<th><label for=\"address\">주소</label></th>\n");
      out.write("										<td><input type=\"text\" name=\"address\" id=\"address\"\n");
      out.write("											required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" size=\"30\"></td>\n");
      out.write("									</tr>\n");
      out.write("								</tbody>\n");
      out.write("							</table>\n");
      out.write("						</div>\n");
      out.write("						");
      out.write("\n");
      out.write("						<button type=\"submit\" class=\"btn btn-success\">수정하기</button>\n");
      out.write("						");
      out.write("\n");
      out.write("						<button type=\"button\" class=\"btn btn-secondary\"\n");
      out.write("							onClick=\"location.href='home.jsp'\">취소</button>\n");
      out.write("					</form>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</main>\n");
      out.write("	<footer class=\"footer font-small black\">\n");
      out.write("		<div class=\"footer-copyright text-center py-3\">\n");
      out.write("			© 2022 Copyright: <b> BusanIT 4Team</b>\n");
      out.write("		</div>\n");
      out.write("	</footer>\n");
      out.write("\n");
      out.write("</body>\n");
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
