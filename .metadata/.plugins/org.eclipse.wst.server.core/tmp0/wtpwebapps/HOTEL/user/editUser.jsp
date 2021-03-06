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
<title>내정보 관리</title>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="./main/home.jsp"> <img
					src="img/premium-icon-letter-h-5540593.png" alt="" width="30"
					height="30" class="d-inline-block align-text-top"> <span
					class="navbar-brand mb-0 h1">Hotels 4TEAM</span>
				</a>
				<div class="d-flex justify-content-end">
					<span class="navbar-brand mb-0 h1"> <b><%=session.getAttribute("id")%>님
							환영합니다</b>
					</span>
					<div class="dropdown mr-2">
						<a class="btn btn-outline-secondary dropdown-toggle" href="#"
							role="button" id="dropdownMenuLink" data-toggle="dropdown"
							aria-expanded="false"> 도움말 </a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							<a class="dropdown-item" href="#">공지 사항</a> <a
								class="dropdown-item" href="#">문의 사항</a>
						</div>
					</div>
					<div class="dropdown mr-2">
						<a class="btn btn-outline-secondary dropdown-toggle" href="#"
							role="button" id="dropdownMenuLink" data-toggle="dropdown"
							aria-expanded="false"> 마이페이지 </a>
						<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
							<a class="dropdown-item" href="register?action=editUser">내정보관리</a> <a
								class="dropdown-item" href="#">예약 현황</a>
						</div>
					</div>
					<a class="btn btn-primary mr-2" href="./main/main.jsp">로그아웃</a>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="container">
			<div class="row mt-5">
				<div class="col-md-6 mx-auto">
					<h1 class="text-center">내 정보 수정</h1>
					
					<form action="<%=request.getContextPath()%>/register" method="post">
						<div class="form-group">
							<input type="hidden" name="action" value="updateUser">
						</div>
						<div class="form-group">
							<label for="id">아이디</label> <input type="text" name="id" id="id"
								readonly="readonly" value="${id}"> <br>
						</div>
						<div class="form-group">
							<label for="password">비밀번호</label> <input type="text"
								name="password" id="password" required value="${user.password}"><br>
						</div>
						<div class="form-group">
							<label for="name">이름</label> <input type="text" name="name"
								id="name" required value="${user.name}"><br>
						</div>
						<div class="form-group">
							<label for="email">이메일</label> <input type="text" name="email"
								id="email" required value="${user.email}"><br>
						</div>
						<div class="form-group">
							<label for="phone">휴대폰번호</label> <input type="text" name="phone"
								id="phone" required value="${user.phone}"><br>
						</div>
						<div class="form-group">
							<label for="address">주소</label> <input type="text" name="address"
								id="address" required value="${user.address}"><br>
						</div>
						
						<%--수정하기 버튼 클릭시 페이지 유지, 수정한 정보 띄우기 --%>
						<button type="submit" class="btn btn-success">수정하기</button>
						<%--취소 버튼 클릭시 메인 페이지로 이동 --%>
						<button type="button" class="btn btn-secondary" onClick="location.href='main/home.jsp'">취소</button>
					</form>
				</div>
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