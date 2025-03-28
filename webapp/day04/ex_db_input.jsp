<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 관리</title>
<style type="text/css">

form{
	margin: 20px;

}

.flex-form{

	display: flex;
	align-items :  center;
	gap: 10px;
}

.label-group{
	display: flex;
	align-items :  center;
	gap: 10px;
	margin-bottom: 20px;

}

.title{
width: 100px;
font-weight: bold;

}

input[type="text"], 
input[type="number"]{
	padding: 10px;
	background-color: #e5e5e5;
	border: 2px solid #5b8f8f;
	border-radius: 10px;

}


input[type="submit"]{

	padding: 10px;
	background-color: #5b8f8f;
	border-radius: 10px;
	color: white;
	border: none;



}


</style>
</head>
<body>
	<form action="/02_jsp/Ex11" method="get">
		<input type="hidden" name="cmd" value="1">
	 	<input type="submit" value="도서 전체정보보기"	>
	</form>
	<form action="/02_jsp/Ex11" method="get">
	
		<input type="hidden" name="cmd" value="2" >
		<%-- DB에 들어가는 정보는 컬럼명과 같은 이름 사용 --%>
		<input type="text" name="bookid"  required>
	 	<input type="submit" value="책번호로 검색"	>
	</form>
	<form action="/02_jsp/Ex11" method="get">
		<input type="hidden" name="cmd" value="3" >
		<%-- DB에 들어가는 정보는 컬럼명과 같은 이름 사용 --%>
		<input type="text" name="bookname" required>
	
	 	<input type="submit" value="책이름으로 검색">
	</form>
	<form action="/02_jsp/Ex11" method="get">
		<div class="label-group">
			<span class="title">책 이름</span>
	 		<input type="text" name="bookname" required>
		
		</div>
		<div class="label-group">
			<span class="title">출판사</span>
	 		<input type="text" name="publisher" required>
		
		</div>
		<div class="label-group">
			<span class="title">가격</span>
	 		<input type="number" name="price" required>
	 				<input type="hidden" name="cmd" value="4" >
	 		<input type="submit" value="책 등록">
		
		</div>
	
	
	</form>
	
	
</body>
</html>