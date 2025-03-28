<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/02_jsp/Ex10" method="post">
		<p>
			<label> 이름 : <input type="text" name="username"></label>
			<label> 나이 : <input type="number" name="userage"></label>
		
		
		
		</p>
		<input type="hidden" name="cmd" value="1">
 		<input type="submit" value="서버에 보내기"> 
	
	</form>
	
	<hr>
	
	<form action="/02_jsp/Ex10">
		<input type="hidden" name="cmd" value="2">
		<input type="submit" value="오늘 운세보기">
	
	
	</form>
	
	<hr>
	<form action="/02_jsp/Ex10" method="post">
		<fieldset>
			<legend>계산기</legend>
			<p><label>수1: <input type="number" name="s1" required></label></p>
			<p><label>수2: <input type="number" name="s2" required></label></p>
			<p><label>연산자: <input type="radio" name="op" value="+" checked> + </label>
				<label><input type="radio" name="op" value="-">- </label>
				<label><input type="radio" name="op" value="*">* </label>
				<label><input type="radio" name="op" value="/">/ </label>
			
			</p>

		</fieldset>
		<input type="submit" value="서버에 보내기">
		<input type="hidden" name="cmd" value="3"> 
	
	
	</form>

</body>
</html>