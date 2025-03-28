<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP: Java Server Page</title>
</head>
<body>
<!-- html 주석 : 소스보기에서 보인다. -->
<%-- jsp 주석:  소스보기에서 안보인다. --%>
<%--

	servlet ; 자바에서 html, css, javascript 코드를 넣어서 사용
	jsp(뷰=view=화면단) : html 안에서 자바 코드를 넣어 사용 
	
	1. 지시어(directive)
	2. 내장 객체
	3. 액션 태그
	4. EL과 JSTL
	
	
	1. 지시어 :JSP 파일의 속성을 기술하는 곳
			웹 컨테이너(=tomcat)에게 해당 파일을 
			어떻게 처리해야 하는지 전달하는 내용을 담고 있다.
			
			
			1)<%@ page %> : 해당 페이지를 톰켓이 처리하는데 필요한 정보를 기술하는 부분
			2)<%@ include %> : 해당 파일안에 다른 html이나 jsp 파일을 삽입할 수 있또록 
								도와주는 기능하는 지시어 
			3)<% taglib %> : JSP 기능을 확장하기 위해서 만둘어진 라이브러리를 
							해당 페이지에서 사용 할 수 있도록 도와주는 기능하는 지시어 
							(JSTL를 사용할 때 필요하다)
	
	
	2. 내장 객체 : JSP 페이지에서 아무런 제약 없이 사용할 수 있도록 지워하는 객체를 말한다.
				**out, **request, **response, *page, *pageContext, 
				**session, application, config, exception
				
	3. 액션 태그 : jsp 페이지간에 흐름제어 , 자바빈즈 컴포넌트 지원등을 한다.
	
		<jsp: ~~~> 로 시작한다.
	
	4. EL과 JSTL
		EL :  표현언어, ${변수명}
				자바스크립트에서도 벡티와 함께 사용가능하다.
				pageContext, request, session, application에 
				저장되어 있는 변수만 호출해서 사용할 수 있다.
				
				
		JSTL(JSP Standard Tag Library):흐름제어, 제어문 역할을 한다. 
		<%@ taglib %> 를 이용해서 사용한다. 
		라이브러리는 WEB-INF 안에 lib 폴더에 넣어주자
 --%>
  
 

</body>
</html>