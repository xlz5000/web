package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		// 오늘의 운세
		
		
		// 오늘의 날짜
		LocalDate today = LocalDate.now();
		// System.out.println("오늘의 날짜 : " + today);
		

		// 오늘의 운세
		int luck = (int) (Math.random() * 101);
		out.println("<h2>" + today + "의 운수는 " + luck + "% </h2>");
		
		//링크하기
		out.println("<a href='hello'>서블릿문서 Ex02 연결하기</a>");
		out.println("<a href='/02_jsp/hello'>서블릿문서 Ex02 연결하기</a>");
		out.println("<a href='" + request.getContextPath() + "/hello'>서블릿문서 Ex02 연결하기</a>");
		
	}

}
