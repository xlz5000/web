package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex08_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String userage = request.getParameter("userage");
		
		
		
		out.println("<h2>여기는 Ex08페이지 입니다.</h2>");
		out.println("<h3>");
		out.println("<ul>");
		out.println("<li>" + username + "</li>");
		out.println("<li>" + userage + "</li>");
		out.println("</ul>");
		out.println("</h3>");
	}



}
