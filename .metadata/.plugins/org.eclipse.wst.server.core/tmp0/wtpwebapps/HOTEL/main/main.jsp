<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>
<title>메인 페이지</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="main.jsp"> 
					<img src="img/premium-icon-letter-h-5540593.png" alt="" width="30"
					height="30" class="d-inline-block align-text-top"> 
					<span class="navbar-brand mb-0 h1">Hotels 4TEAM</span>
				</a>
				<div class="d-flex justify-content-end">
					<div class="dropdown mr-2">
						<a class="btn btn-outline-secondary dropdown-toggle" href="#"
							role="button" id="dropdownMenuLink" data-toggle="dropdown"
							aria-expanded="false"> 도움말 </a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							<a class="dropdown-item" href="#">공지 사항</a> <a
								class="dropdown-item" href="#">문의 사항</a> <a
								class="dropdown-item" href="#">FAQ</a>
						</div>
					</div>
					<%--회원가입 버튼 클릭시 회원가입 페이지로 이동 --%>
					<a class="btn btn-primary mr-2" href="../register/register.jsp">회원가입</a>
					<%--로그인 버튼 클릭시 로그인 페이지로 이동 --%> 
					<a class="btn btn-primary mr-2" href="../login/login.jsp">로그인</a>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="container">
			<div class="jumbotron mt-5">
				<h2>여행지 검색</h2>

			</div>
		</div>
	</main>
	<footer class="footer font-small black">
		<div class="footer-copyright text-center py-3">
			© 2022 Copyright: <b> BusanIT 4Team</b>
		</div>
	</footer>

</body>
</html>