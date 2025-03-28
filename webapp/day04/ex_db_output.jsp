<%@page import="com.ict.repository.BookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

table{
	width: 800px;
	margin : 50px auto;
	border-collapse:  collapse;
}

table, th, td{
	 border : 1px solid green;
	 text-align: center;
	 padding: 20px;
	 
}


h1{
text-align: center;

}



</style>
</head>
<body>



	<h1>책 정보보기</h1>
	<table border = '1'>
		<thead>
			<tr>
				<th>책 번호</th>
				<th>책 이름</th>
				<th>출판사</th>
				<th>정가</th>
			</tr>
		</thead>
		<tbody>
		<%
		List<BookVO> list = (List<BookVO>)request.getAttribute("list");
		for(BookVO k : list){
			
			out.println("<tr>");
			out.println("<td>" + k.getBookid() + "</td>");
			out.println("<td>" + k.getBookname() + "</td>");
			out.println("<td>" + k.getPublisher() + "</td>");
			out.println("<td>" + k.getPrice() + "</td>");
			out.println("</tr>");
			
			
		}
		%>
		
		
		
		
		</tbody>







	</table>

</body>
</html>