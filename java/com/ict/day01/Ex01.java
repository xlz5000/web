package com.ict.day01;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		//생성자 대신 멤버 초기화를 할 수 있다.
		System.out.println("init()");
	}




	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// init이 끝나면 자동으로 호출된다.
		// request (요청) => 요청 정보를 가지고 있는 객체 (클라이언트 => 서버)
		// response (응답) => 응답 정보를 가지고 있는 객체 (서버 => 클라이언트) 
		System.out.println("service()");
		
		
		// 요청방식에 따라 알맞는 메서드를 호출하는 역할을 한다.
		// 요청방식 : get 방식	 -> doGet()로 간다.
		// 			post 방식 -> doPost()로 간다.
		
		
		if(request.getMethod().equalsIgnoreCase("get")) {
			doGet(request, response);
		}else if(request.getMethod().equalsIgnoreCase("post")){
			doPost(request, response);
			
		}
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
	}

	public void destroy() {
		// 프로젝트가 tomcat에서 나올 때 실행
		System.out.println("destroy");
	}
}
