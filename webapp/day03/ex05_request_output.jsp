<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %> <!-- ArrayList를 사용하려면 이 import 추가 -->
<%@ page import="java.util.Arrays" %> <!-- 만약 배열을 사용하려면 이 import 추가 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>결과보기</h2>
	
<%-- 	<ul>
		<li><%= request.getAttribute("title")%></li>
		<li><%= request.getAttribute("data")%></li>
		<li><%= request.getAttribute("list")%></li>

		<% 
		
		ArrayList<String> list = (ArrayList<String>)request.getAttribute("list");
		
		
		for(String k : list){
			out.println("<li>" + k + "님</li>");
		}
		
		%>	
	</ul> --%>
	
	<p>username: <%=request.getAttribute("username") %></p>
	<p>userage: <%=request.getAttribute("userage") %></p>
	<hr>
	
	<p>username: ${username}</p>
	<p>userage: ${userage}</p>
	
	<p>${msg}</p>
	
	<p>${s1} ${op} ${s2} =  ${result}</p>
</body>
</html>