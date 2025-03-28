<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String msg = (String)request.getAttribute("error"); %>
	<h2 style="color: red"><%= msg %></h2>
</body>
</html>