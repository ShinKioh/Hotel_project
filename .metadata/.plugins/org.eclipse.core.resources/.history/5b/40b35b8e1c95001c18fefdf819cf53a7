<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="board.BoardDAO"/>
<%
	int board_id = Integer.parseInt(request.getParameter("board_id"));
	dao.delete(board_id);
%>
<c:redirect url="${pageContext.request.contextPath}/list.jsp"/> 