<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="//unpkg.com/bootstrap@4/dist/css/bootstrap.min.css">
<script src='//unpkg.com/jquery@3/dist/jquery.min.js'></script>
<script src='//unpkg.com/popper.js@1/dist/umd/popper.min.js'></script>
<script src='//unpkg.com/bootstrap@4/dist/js/bootstrap.min.js'></script>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css" />

<link rel="stylesheet" href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css" type="text/css" />
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>    
<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>


	<script>
	
            $(function() {
                           
                //datepicker 한국어로 사용하기 위한 언어설정
                $.datepicker.setDefaults($.datepicker.regional['ko']); 
                
                //시작일.
                $('#in').datepicker({                    
                    dateFormat: "yy-mm-dd",             // 날짜의 형식
                    changeMonth: true,                  // 월을 이동하기 위한 선택상자 표시여부
                    minDate: 0,                       // 선택할수있는 최소날짜, ( 0 : 오늘 이전 날짜 선택 불가)
                    nextText: '다음 달',
	                prevText: '이전 달', 
	                dayNames: ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'],
	                dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'], 
	                monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	                monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
                    onClose: function( selectedDate ) {    
                        // 시작일(in) datepicker가 닫힐때
                        // 종료일(out)의 선택할수있는 최소 날짜(minDate)를 선택한 시작일로 지정
                        $("#out").datepicker( "option", "minDate", selectedDate );
                    }                
                });

                //종료일
                $('#out').datepicker({                   
                    dateFormat: "yy-mm-dd",
                    changeMonth: true,
                    minDate: 0, // 오늘 이전 날짜 선택 불가
                    nextText: '다음 달',
	                prevText: '이전 달', 
	                dayNames: ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'],
	                dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'], 
	                monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	                monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
                    onClose: function( selectedDate ) {
                        // 종료일(out) datepicker가 닫힐때
                        // 시작일(in)의 선택할수있는 최대 날짜(maxDate)를 선택한 종료일로 지정 
                        $("#in").datepicker( "option", "maxDate", selectedDate );
                    }                
                });
            });
        </script>
             
<title>호텔 페이지</title>
</head>
<body>

<header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">
				<img src="img/premium-icon-letter-h-5540593.png" alt="" width="30" height="30" class="d-inline-block align-text-top">
				<span class="navbar-brand mb-0 h1">Hotels 4TEAM</span>
			</a>
			<div class="d-flex justify-content-end">
				<div class="dropdown mr-2">
					<a class="btn btn-outline-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-expanded="false">
						도움말
					</a>
					<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
						<a class="dropdown-item" href="#">공지 사항</a>
						<a class="dropdown-item" href="#">문의 사항</a>
						<a class="dropdown-item" href="#">FAQ</a>
					</div>
				</div>
				<a class="btn btn-primary mr-2" href=".jsp">마이페이지</a>
				<a class="btn btn-primary mr-2" href="main.jsp">로그아웃</a>
			</div>
		</div>
	</nav>
</header>

<main>

	<div class="name">호텔명</div>

	<div class="main">
		<div class="hotel-image">호텔 이미지</div>
		
		<div class="sub-image1">호텔이미지1</div>
		<div class="sub-image2">호텔이미지2</div>
		<div class="sub-image3">호텔이미지3</div>
		
		<div class="info">호텔정보</div>

  <div id="staticMap" style="padding: 0px"></div>
			<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=2cbd152899fd818702b7769873ecb33b"></script>
			<script>
			// 이미지 지도에서 마커가 표시될 위치입니다 
			var markerPosition  = new kakao.maps.LatLng(33.450701, 126.570667); 

			// 이미지 지도에 표시할 마커입니다
			// 이미지 지도에 표시할 마커는 Object 형태입니다
			var marker = {
			    position: markerPosition
			};
			var staticMapContainer  = document.getElementById('staticMap'), // 이미지 지도를 표시할 div 
			    staticMapOption = {  
			        center: new kakao.maps.LatLng(33.450701, 126.570667), // 이미지 지도의 중심좌표
			        level: 3, // 이미지 지도의 확대 레벨
			        marker: marker // 이미지 지도에 표시할 마커 
			    };
			
			// 이미지 지도를 생성합니다
			var staticMap = new kakao.maps.StaticMap(staticMapContainer, staticMapOption);
			</script>

	<div class="price">
	
      <div style="background-color: lightgray; border-radius: 10px;">체크인<input type="text" id="in"></div>
      <div style="background-color: lightgray; border-radius: 10px;">체크아웃<input type="text" id="out"></div>
      
	  <span class="people1" style="background-color: lightgray; height:40px; border-radius: 10px;">성인&nbsp;&nbsp;
	   <select name = "people11" style="width:130px; height:25px;">
	   <option value = "1" selected>1</option>
	   <option value = "2">2</option>
	   <option value = "3">3</option>
	   <option value = "4">4</option>
	   <option value = "5">5</option>
	   <option value = "6">6</option>
	   <option value = "7">7</option>
	   </select>
	   </span>
	  <span class="people2" style="background-color: lightgray; height:40px; border-radius: 10px;">아동&nbsp;&nbsp;
	   <select name = "people22" style="width:130px; height:25px;">
	   <option value = "0" selected>0</option>
	   <option value = "1">1</option>
	   <option value = "2">2</option>
	   <option value = "3">3</option>
	   <option value = "4">4</option>
	   <option value = "5">5</option>
	   <option value = "6">6</option>
	   <option value = "7">7</option>
	   </select>
	  </span>
    
      <span class="select"style="background-color: lightgray; height:40px; border-radius: 10px;">객실선택&nbsp;&nbsp;
      <select name = "room-select" style="width:350px;">
       <option value = "A" selected>A 룸</option>
	   <option value = "B">B 룸</option>
	   <option value = "C">C 룸</option>
	   <option value = "D">D 룸</option>
      </select>
      </span>      
      <div class="sum">합계</div>
      <div class="res"><a class="btn btn-danger" href="예약결제.jsp">예약하기</a></div>
	 
    </div>
     <div class="review">리뷰</div>
		</div>		  
	
  
  <div class="room">
    <div class="room-num">룸</div>
    <div class="room-info">객실정보</div>
    <div class="room-name">룸이름</div>
    <div class="room-name2"></div>
  </div>
 
</main>

<footer>

</footer>

</body>
</html>