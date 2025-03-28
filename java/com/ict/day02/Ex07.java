package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex07 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		// 같은 이름으로 값이 여러개 넘어오면 배열 처리 하자
		String[] hobbies = request.getParameterValues("hobby");
		String[] webs = request.getParameterValues("web");
		
		
		out.println("<h2>결과보기</h2>");
		out.println("<h3>");
		out.println("<ul>");
		
		
		for (String k: hobbies) {
			out.println("<li>"+ k + "</li>");
		}
		
		out.println("</ul>");
		out.println("</h3>");
		
		
		
		out.println("<hr>");

		out.println("<h3>");
		out.println("<ul>");
		for (String k: webs) {
			out.println("<li>"+ k + "</li>");
		}
		
		out.println("</ul>");
		out.println("</h3>");
	}


}
