package com.ict.day01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Ex03 extends HttpServlet {
	private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	doGet(request, response);
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 요청할 때 한글 처리
		request.setCharacterEncoding("UTF-8");
		// 응답할 때 한글처리, 해당 문서를 HTML 문서로 세팅한다.
		response.setContentType("text/html; charset=UTF-8");
		// response => 클라이언트에 응답 => 웹 브라우저에 응답하는 거이다. 
		PrintWriter out = response.getWriter();
		
		// 서블릿은 자바에서 HTML, CSS, JS를 사용해서 웹 페이지를 만드는 것
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>제목 태그 : h1 ~ h6</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h0 style='background-color: red;'> 제목 태그 h0 </h0>");
        out.println("<h0> 제목 태그 h0 </h0>");
        out.println("<h1 style='background-color: blue;'> 제목 태그 h1 </h1>");
        out.println("<h2> 제목 태그 h2 </h2>");
        out.println("<h3> 제목 태그 h3 </h3>");
        out.println("<h4> 제목 태그 h4 </h4>");
        out.println("<h5> 제목 태그 h5 </h5>");
        out.println("<h6> 제목 태그 h6 </h6>");
        out.println("<h7> 제목 태그 h7 </h7>");
        out.println("<hr>");
        out.println("<h1> 제목 태그 h1 </h1>");
        out.println("<h1 style='font-size: 48px'> 제목 태그 h1 </h1>");
        out.println("<hr>");
        out.println("<span style='background-color: yellow;'>HTML & CSS</span>");
        out.println("<span>JavaScript</span>");
        out.println("</body>");
        out.println("</html>");
	}



}
