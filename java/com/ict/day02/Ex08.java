package com.ict.day02;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex08 extends HttpServlet {
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
		
		
		
		
		// 페이지이동(포워딩, 리다이렉트)
		// => 현재 페이지를 거쳐서 포워디나 리다이렉트를 만나면 포워드나 리다이렉트가 지정한 페이지로 이동
		// 		**현재 페이지 내용은 보이지 않는다.
		
		// 1. 리다이렉트 : 다른 페이지 이동하면서 기존의 request/response 정보가 사라진다.(파라미터가 없어진다.)
		//				새로운 request/response가 만들어져 지정한 페이지로 이동한다. 
		// 				주소창에는 최종주소가 보인다.
		//	사용법) response.sendRedirect("이동할 서블리이름")
		//	사용법) response.sendRedirect("폴더/html이름.html")
		
		
		//response.sendRedirect("Ex08_2");
		
		
		//2. 포워드 :  다른 페이지로 이동하면서 기존의 request/response 정보를 가지고 간다.
		//			파라미터가 살아있다.
		// 			주소창에는 최초 주소가 보인다
		
		//request.getRequestDispatcher("이동할 서블릿 이름").forward(request, response);
		//request.getRequestDispatcher("폴더/html이름.html")).forward(request, response);
		request.getRequestDispatcher("Ex08_2").forward(request, response);
	}


}
