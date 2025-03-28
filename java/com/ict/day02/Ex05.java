package com.ict.day02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		// 중요
		
		// 클라이언트가 서버에게 정보를 요청하면서 필요한 정보를 보낼 수 있다.
		// 이렇게 요청을 처리하기 위해서 함께 전달되는 정보를 '파라미터'라고 한다.
		// 파라미터의 자료형은 기본적으로 String이거나 String[]이다.
		
		
		// 클라이언트가 요청할 때 사용 하는 메서드 get, post, ... 있다.
		// get 방식 :  주소창에 정보가 보인다.(정보를 헤더 담는다.)
		//				~~~~~? name=value&name=value&name=value
		// post 방식 : 주소창에 정보가 안 보인다.(정보를 바디에 담는다.)
		
		// 파라미터를 받아서 처리하는 메서드들
		// **1. String 변수 = request.getParameter("name");
		// 이름에 매칭되는 값을 얻어 낼 수 있다.(값이 변수에 저장)
		// ** 2. String[] 변수 = request.getParameterValues("name");
		
		// 3. 맵 형식의 파라미터일때
		// Map<String, String[]> 변수 = request.getParameterMap();		
		
		
		//4. 열거형의 파리미터일때
		// Enumeration<String> 변수 = request.getParameterNames();
		
		
		// 만약에 이름(username)과 나이(userage)가 파라미터로 넘어온다고 가정하자.
		String username = request.getParameter("username");
		String userage = request.getParameter("userage");
		
		
		out.println("<ul>");
		out.println("<li> 이름 : " + username + "</li>");
		out.println("<li> 나이 : " + userage + "</li>");
		out.println("</ul>");
	}



}
