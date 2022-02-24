<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script> 
<meta charset="UTF-8">
<title>글 등록하기</title>
</head>
<body>
<h3>글 등록</h3>
<form action="regist.jsp" method="post">
	<label for="title">제목</label><br><input type="text" name="title" placeholder="제목"  required><br>
	<label for="writer">작성자</label><br><input type="text" name="writer" placeholder="작성자" required><br>
	<label for="content">내용</label><br><textarea rows="4" cols="23" name="content" placeholder="내용" required></textarea><br>
	<input type="submit" class="btn btn-primary mx-1 mt-2" value="등록">
</form>
</body>
</html>