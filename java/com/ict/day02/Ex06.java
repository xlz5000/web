package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex06 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	doGet(request, response);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
	
		
		String cmd = request.getParameter("cmd");
		switch(cmd) {
			case "1": 
			String username = request.getParameter("username");
			String userage = request.getParameter("userage");
			
			out.println("<h3>");
			out.println("<ul>");
			out.println("<li>" + username + "</li>");
			out.println("<li>" + userage + "</li>");
			out.println("</ul>");
			out.println("</h3>");
			break;
			
		case "2": 
			
			String s1 = request.getParameter("s1");
			String s2 = request.getParameter("s2");
			String op = request.getParameter("op");
			
			
			int num1 = Integer.parseInt(s1);
			int num2 = Integer.parseInt(s2);
			int result = 0;
			switch(op) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			
			}
			
			out.println("<h3>");
			out.println("결과 : " + num1 + op + num2 + "=" + result);
			out.println("<h3>");	
			
			
			  break;
			  
			  }
			 
	
		}

}
