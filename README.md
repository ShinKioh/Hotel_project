# Hotel_project

* 팀 프로젝트
* 고객이 원하는 호텔, 객실을 선택하고 예약까지 하는 프로젝트입니다.
* 고객이 예약을 취소하고 리뷰, Q&A를 작성하는 것도 가능합니다.

# Hotel_project

* MySQL
* Apache Tom Cat 9.0
* JAVA JDK-11.0.1
* JSP
* jQuery
* Ajax

# 22.02.24

* UserController / UserDao 개발
  회원 가입 및 회원 정보 수정 기능 개발.
  회원 가입 시, 중복 ID 확인 기능 구현
  회원 정보 수정 시, 회원 가입 때 입력한 회원의 DB를 서버에서 가져와 수정하도록 구현
  
* LoginController / LoginDao 개발
  회원 가입한 DB를 가져와 로그인 기능 구현, 유효성 검사 실행
  
* BoardDAO
  CRUD, hit(조회수) 기능 구현, 제목 클릭 시 조회수 자동으로 1씩 증가
  게시판 글 등록, 수정, 삭제 기능 구현
  게시판 글 삭제 시, 한번더 물어보도록 설정

* hotel.jsp
  체크인, 체크아웃 날짜 달력으로 선택할 수 있도록 구현
  선택사항 입력시 자동으로 예약금액 출력하도록 구현할 예정
  호텔 정보 및 룸 정보는 공공api로 불러올 예정
