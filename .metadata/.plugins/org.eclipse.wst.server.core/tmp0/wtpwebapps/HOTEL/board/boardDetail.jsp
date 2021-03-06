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
<title>글내용</title>
</head>
<body>
<h3>글 정보</h3>
<p>번호:${dto.board_id}</p>
<p>제목:${dto.title}</p>
<p>작성자:${dto.writer}</p>
<p>내용:${dto.content}</p>
<p>등록일자:${dto.regdate}</p>
<p>조회수:${dto.hit}</p>
<a href="<c:url value="/board/editForm.jsp?board_id=${dto.board_id}"/>"><button type="button" class="btn btn-primary mx-1 mt-2">수정</button></a>
<a href="<c:url value="/board/deleteForm.jsp?board_id=${dto.board_id}"/>"><button type="button" class="btn btn-secondary mx-1 mt-2">삭제</button></a>

</body>
</html>