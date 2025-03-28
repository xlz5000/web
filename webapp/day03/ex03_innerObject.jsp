<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체</title>
</head>
<body>

	<%-- 
	
	2. 내장 객체 : JSP 페이지에서 아무런 제약 없이 사용할 수 있도록 지워하는 객체를 말한다.
				**out, **request, **response, *page, *pageContext, 
				**session, application, config, exception
				
				
	out :  화면(브라우저)에 정보를 출력할 때 사용하는 객체 
	
	
	JSP 사용법 : HTML 안에서 자바 코드를 사용하는 방법
	- 선언부 : <%! 변수 선언;, 메소드 선언; %> 
	- 스크립트릿 : <% 순수 자바코듸;%>
	- 표현식 : <%= 변수 이름 또는 메서드 이름 %> -> out, EL
	
	단점) 선언부, 스트립트릿, 표현식 요소들이 다른 요소를 포함해서 사용할 수 없다.
		가독성이 낮다.

 --%>

	<%
	out.println("Hello JSP");
	%>
	<%
	out.println("<h2>Hello JSP</h2>");
	%>
	<h2>
		<%
		out.println("Hello JSP");
		%>
	</h2>


	<hr>

	<%
	String str = "한국ICT 인재 개발원";
	out.println(str);
	%>
	<hr>

	<%=str%>

	<hr>
	<h2>EL : ${str} 안나옴</h2>
	<h2>오늘의 운세 보기</h2>

	<%
	LocalDate today = LocalDate.now();
	int luck = (int) (Math.random() * 101);

	out.println("오늘의 운세 : " + luck + "% ");
	%>


	<hr>
	<h2>1~10까지 출력하자</h2>
	<%-- 단점) 선언부, 스트리븥릿, 표현식 요소들이 다른 요소를 포함해서 사용할 수 없다. --%>
	<% for (int i = 1; i < 11; i++) {%>
		<%= i %> <br>
	<% } %>
	
	<hr>
	
	<%
	 for(int i = 100 ; i <111 ; i++){
		 
		 out.println("i=" + i + "<br>");
		 
	 }
	%>
	
	
	<hr>
	<h2> 0-10까지 합 출력하기</h2>
	<%
	
	int sum = 0;
	for(int i = 0; i <= 10 ; i++){
		sum += i;
	}
	out.println("<h3>total= " + sum + "</h3>");
		
		%>
		
	<hr>
	<h3>합 : <%= sum %></h3>
	
	
	<hr>
	<%!
	public int add(int s1, int s2){
			return s1+ s2;
	}
	
	int result = 0;
	public void sub(int s1, int s2){
		result =  s1 - s2;
	}
	
	%>
<h2>
	<p> 7 + 5 = <%=add(7, 5) %> </p>

	<%-- void인 메서드는 먼저 실행 후 나중에 변수 호출하자 --%>
	<p> 7 - 5  = <% sub(7, 5); out.println(result); %> </p>


</h2>
	

</body>
</html>