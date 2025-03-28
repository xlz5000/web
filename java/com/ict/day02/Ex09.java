package com.ict.day02;

import java.io.IOException;
import java.io.PrintWriter;

import com.ict.model.CalcCommand;
import com.ict.model.Command;
import com.ict.model.LuckyCommand;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex09 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		// 파라미터를 가지고 처리를 것을 분리하자
		// 일처리를 순수자바에서 처리한다.(POJO)
		/*String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "1":
			LuckyCommand luck = new LuckyCommand();
			String path = luck.exec(request, response);
			// 페이지 이동
			request.getRequestDispatcher(path).forward(request, response);
			break;
		case "2":
			CalcCommand calc = new CalcCommand();
			String path2 = calc.exec(request, response);
			request.getRequestDispatcher(path2).forward(request, response);
			break;

		}*/
		
		String cmd = request.getParameter("cmd");

		Command comm = null;
		
		switch (cmd) {
			case "1":
				comm = new LuckyCommand();
				break;
			case "2":
				comm = new CalcCommand();
				break;

		}
		
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}


}
