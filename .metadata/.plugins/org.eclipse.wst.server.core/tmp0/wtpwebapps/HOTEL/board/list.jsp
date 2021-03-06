<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	BoardDAO dao = new BoardDAO();
	List<BoardDTO> list = dao.selectAll();
	pageContext.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<style>
table.table {
  border-collapse: separate;
  border-spacing: 1px;
  text-align: center;
  line-height: 1.5;
  margin: 20px 10px;
}
table.table th {
  width: 155px;
  padding: 10px;
  font-weight: bold;
  vertical-align: top;
  color: #fff;
  background: #ce4869 ;
}
table.table td {
  width: 155px;
  padding: 10px;
  vertical-align: top;
  border-bottom: 1px solid #ccc;
  background: #eee;
}

</style>
<head>
<link rel="stylesheet" href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>  
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>목록</title>
</head>
<body>
<h2>게시글 목록</h2>
<table class="table">
<thead>
<tr>
<th scope="col">번호</th>
<th scope="col">제목</th>
<th scope="col">작성자</th>
<th scope="col">등록일</th>
<th scope="col">조회수</th>
</tr>
</thead>
<c:forEach var="board" items="${list}">
<tr>
<td>${board.board_id}</td>
<td><a href="${pageContext.request.contextPath}/board/boardDetail.jsp?board_id=${board.board_id}">${board.title}</a></td>
<td>${board.writer}</td>
<td>${board.regdate}</td>
<td>${board.hit}</td>
</tr>
</c:forEach>
</table>

<form method="get" action="./search.jsp" class="form-inline mt-3">
<input type="text" name="search" class="form-control mx-1 mt-2" placeholder="내용을 입력하세요"/>
<button type="submit" class="btn btn-primary mx-1 mt-2">검색</button>
<a href="<c:url value="/board/registForm.jsp"/>"><button type="button" class="btn btn-primary mx-1 mt-2" style="float:right">글등록</button></a>
</form>
</body>
</html>