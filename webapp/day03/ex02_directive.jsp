<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어; directive</title>
</head>
<body>
<%-- <%@ include file="../day02/ex06.html" %> --%>
<%-- <jsp:include page="../day02/ex07.html"/> --%>
<%--

	1. 지시어 :JSP 파일의 속성을 기술하는 곳
			웹 컨테이너(=tomcat)에게 해당 파일을 
			어떻게 처리해야 하는지 전달하는 내용을 담고 있다.
			
			
			1)<%@ page %> : 해당 페이지를 톰켓이 처리하는데 필요한 정보를 기술하는 부분
			2)<%@ include %> : 해당 파일안에 다른 html이나 jsp 파일을 삽입할 수 있또록 
								도와주는 기능하는 지시어 
			3)<% taglib %> : JSP 기능을 확장하기 위해서 만둘어진 라이브러리를 
							해당 페이지에서 사용 할 수 있도록 도와주는 기능하는 지시어 
							(JSTL를 사용할 때 필요하다)
							
----------------------------------------------------------------------------------------------



1) <%@ page %> : 기본적으로는 그대로 사용된다.
	- language : 스크립트 코드에서 사용하는 언어를 의미
	- contentType: 해당 페이지의 출력되는 문서 타입(MIME타입)과 문자셋 지정(캐릭터 인코딩)
		--MIME :  문서, 파일 또는 바이트 집합의 성격과 형식을 ㅏ타내는 
		-- 인코딩(암호화, 부호화:
		-- 디코딩(복호화) :  변환된 정보를 원래대로 되돌리는 것
	-pageEnconding: JSP 파일의 문자 인코딩을 설정, 파일 자체의 인코딩 방식으 지정
	
	-session : 세션(저장공간) 사용 여부(기본:true)
	-buffer : 출력할 때 사용되는 임시저장 공간 (기본 : 8kb)
	-autoFlush: 출력버퍼가 다 차지 않아도 바로 출력 시켜줌(기본 : true)
	-errorPage : 해당 페이지에서 오류가 발생되면 오류를 처리하는 페이지로 지정
	-isErrorpage : 해당 페이지가 오류를 처리하는 오류 페이지이면 true로 지정(기본 :false)
	
	
	
2) include 지시어 : 해당 파일 안에 다른 html이나 jsp 파일을 삽입할 수 있도록
					도와주는 기능하는 지시어
					보통 헤더와 푸터를 호출할 때 많이 사용
	<%@ include file="삽입할 파일의 위치와 이름" %>
	<%@ include file="../day02/ex06.html" %>
	- 소스를 가져와서 한번에 컴파일한다.
	- 변수를 공유할 수 있다.(같은 페이지처럼 동작)
	- 보통은 정적인 공통코드에 사용(헤더, 푸터)
	
	include 액션 태그 : 해당 파일안에 다른 html이나 jsp 파일을 삽입할 수 있도록 
					도와주는 기능하는 지시어
	<jsp: include page="../day02/ex07.html"/>
	- 다른 페이지의 결과를 가져와서 현재 페이지에 표시한다.
	- 뉴스 업데이트나 실시간 데이터 표시할 때 사용
	- 파라미터 전달 가능, 자주 변경되는 동적 페이지에 사용
	
3) tablib 지시어: 해당 페이지에 사용할 태그 라이브러리 지정할 때 사용
				나중에 JSTL할 때 필요하다.
	<%@ taglib prefix="접두어" uri="라이브러리 위치" %>
	<%@ taglib prefix="c" uri="라이브러리 위치" %>
	<%@ taglib prefix="fmt" uri="라이브러리 위치" %>
	
	
	-core(접두어 c) :  if문,forEach문, choose문(switch), set, remove
	-formatting(접두어 fmt) : 날짜, 시간, 숫자 등의 형식을 처리할 때 사용, 국제화 처리할 때 사용 

 	--%>

</body>
</html>