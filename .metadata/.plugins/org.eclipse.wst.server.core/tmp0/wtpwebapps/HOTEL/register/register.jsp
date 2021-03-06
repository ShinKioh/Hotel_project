<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<title>회원가입 페이지</title>
</head>	
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="../main/main.jsp"> 
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
							<a class="dropdown-item" href="#">공지 사항</a> 
							<a class="dropdown-item" href="#">문의 사항</a> 
							<a class="dropdown-item" href="#">FAQ</a>
						</div>
					</div>
					<a class="btn btn-primary mr-2" href="../register/register.jsp">회원가입</a>
					<a class="btn btn-primary mr-2" href="../login/login.jsp">로그인</a>
				</div>
			</div>
		</nav>
	</header>
	<div class="container">
		<div class="row mt-5">
			<div class="col-md-6 mx-auto">
				<h1 class="text-center">회원가입</h1>
				<form action="<%=request.getContextPath()%>/register" method="post">
					<div class="form-group">
						<input type="hidden" name="action" value="registerUser">
					</div>
					<div class="form-group">
						<label for="id">아이디</label> <input type="text" name="id"
							placeholder="아이디"> <input type="button"
							onclick="sendServer()" value="중복체크">
						<div id="output"></div>

						<script type="text/javascript">
							const input = document
									.querySelector('input[type="text"]'); // 태그타입으로 선택
							const output = document.getElementById('output');
							const request = new XMLHttpRequest(); // Ajax request 객체 생성
							function sendServer() {
								// 버튼을 누르면 실행되는 함수
								let id = input.value; // input창에 입력한 값
								let url = 'idCheck.jsp?id=' + id; // 요청할 jsp페이지 주소
								request.open('GET', url, true);
								request.send();
								request.onreadystatechange = getInfo;
							}
							function getInfo() {
								if (request.readyState == 4
										&& request.status == 200) {
									let info = request.responseText; // 요청한 결과 받기
									output.textContent = info;
								}
							};
						</script>
						<br>
					</div>
					<div class="form-group">
						<label for="id">비밀번호</label> <input type="text" name="password"
							placeholder="비밀번호"><br>
					</div>
					<div class="form-group">
						<label for="id">이름</label> <input type="text" name="name"
							placeholder="이름"><br>
					</div>
					<div class="form-group">
						<label for="id">이메일</label> <input type="text" name="email"
							placeholder="이메일"><br>
					</div>
					<div class="form-group">
						<label for="id">휴대폰번호</label> <input type="text" name="phone"
							placeholder="휴대폰번호"><br>
					</div>
					<div class="form-group">
						<label for="id">주소</label> <input type="text" name="address"
							placeholder="주소"><br>
					</div>
					<%--가입하기 클릭시 신규회원 등록, 메인 페이지로 이동 --%>	
					<button type="submit" class="btn btn-outline-success" onClick="location.href='main.jsp'">가입하기</button>
				</form>
			</div>
		</div>
	</div>
	<footer class="footer font-small black">
		<div class="footer-copyright text-center py-3">
			© 2022 Copyright: <b> BusanIT 4Team</b>
		</div>
	</footer>
</body>
</html>