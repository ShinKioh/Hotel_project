<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="dto" class="board.BoardDTO"/>
<jsp:useBean id="dao" class="board.BoardDAO"/>
<jsp:setProperty name="dto" property="*"/>

<%
	dao.update(dto);
	pageContext.setAttribute("dto", dto);
%>
<c:redirect url="${pageContext.request.contextPath}/boardDetail.jsp?board_id=${dto.board_id}"/> 