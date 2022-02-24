<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>삭제확인</title>
</head>
<body>
<%
	int board_id = Integer.parseInt(request.getParameter("board_id"));
%>
<form action="delete.jsp">
<input type="hidden" value="<%=board_id%>" name="board_id">
삭제 하시겠습니까? <input type="submit" class="btn btn-primary mx-1 mt-2" value="예">
</form>
</body>
</html>