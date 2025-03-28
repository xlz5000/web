<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장 객체 : request</title>
</head>
<body>
<%-- 

	request(요청) : 클라이언트가 서버에 요청한 정보를 담고 있음(파라미터도 가지고 있음)
	** 생명 주기 : response(응답)하면 request는 사라진다.
	request가 가지고 있는 정보들
	1. 클라이언트의 정보 및 서버 정보를 얻을 수 있는 메서드를 제공
	- getRemoteAddr()			- getContentLength()
	- getCharacterEncoding()	 - getContentType()
	- getProtocol()				- getContextPath()
	- getRequestURI()			- getServerPort()
	- getServerName()
	
	
	
	** 2. 파라미터의 정보 제공
	- getParameter(String name)	 		: String 
	- getparameterValues(String name) 	: String[]
	- getParameterMap()					: Map<String, String[]>
	- getParameterNames()				: Enumeration<String>
	
	
	** 다른 주요 메서드
	- 포워드 : request.getRequestDispatcher("이동할 주소").forward(request, response);
	- 액션 태그 포워드 : <jsp:forward page="이동할 주소"></jsp:forward>
	
	
	
	- 속성을 이용해서 데이터(결과) 저장 (자바) : request. setAttribute("저장이름", 객체);
	- 속성을 이용해서 저장된 데이터(결과) 호출(JSP) : request.getAttribute("저장된 이름");
	- 자바 영역에서 세션(저장공간)을 호출할 때 사용 : request.getSession();
 --%>
 
 
 	<h2>request를 활용한 클라이언트 정보 및 서버 정보 보기</h2>
 	<h3>
 		<ul>
 			<li>클라이언트 IP : <%= request.getRemoteAddr()%></li>
 			<li>클라이언트 주소 : <%= request.getRemoteHost()%></li>
 			<li>클라이언트 포트 : <%= request.getRemotePort()%></li>
 			<li>요청 정보 길이 : <%= request.getContentLength() %></li>
 			<li>요청 정보 인코딩 : <%=request.getCharacterEncoding() %></li>
 			<li>요청 정보 컨텐츠 타입 : <%= request.getContentType() %></li>
 			<li>요청 정보 프로토콜 : <%= request.getProtocol() %></li>
 			<li>요청 정보 전달방식 : <%= request.getMethod() %> </li>
 			<li>요청 정보 URL : <%= request.getRequestURI() %></li>
 			<li>요청 정보 URL : <%= request.getRequestURL() %></li>
 			<li>컨텍스트 경로 : <%= request.getContextPath() %></li>
 		</ul>
 	
 	
 	</h3>


</body>
</html>