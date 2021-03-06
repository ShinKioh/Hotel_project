<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="dao" class="board.BoardDAO"/>
<%
	int board_id = Integer.parseInt(request.getParameter("board_id"));
	BoardDTO dto = dao.selectOne(board_id);
	pageContext.setAttribute("dto", dto);
%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script> 
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>글 수정</title>
</head>
<body>
<h3>수정하기</h3>
<form action="edit.jsp" method="post">
	<input type="hidden" name="board_id" value="${dto.board_id}">
	<input type="text" name="title" value="${dto.title}" required><br>
	<input type="text" name="writer" value="${dto.writer}" required disabled><br>
	<textarea rows="4" cols="23" name="content" placeholder="내용" required>${dto.content}</textarea><br>
	<input type="submit" class="btn btn-primary mx-1 mt-2" value="수정">
</form>
</body>
</html>