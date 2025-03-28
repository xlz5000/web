package com.ict.day01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

   


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response => 클라이언트에 응답 => 웹 브라우저에 응답하는 거이다. 
		
		
		// 요청할 때 한글 처리
		request.setCharacterEncoding("UTF-8");
		
		// 응답할 때 한글처리, 해당 문서를 HTML 문서로 세팅한다.
		response.setContentType("text/html; charset=UTF-8");
		
	
		PrintWriter out = response.getWriter();
		out.println("Hello Servlet");
		out.println("Hello JSP");
		out.println("Hello 한국ICT인재개발원");
		out.println("<hr>");
	}
}
