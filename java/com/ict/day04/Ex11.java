package com.ict.day04;

import java.io.IOException;
import java.io.PrintWriter;

import com.ict.model.Command;
import com.ict.model.DBCommand1;
import com.ict.model.DBCommand2;
import com.ict.model.DBCommand3;
import com.ict.model.DBCommand4;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex11 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		Command comm = null;
		// 요청에 따른 java를 연결시키고 결과 받아서 jsp에 포워딩(페이지이동) 한다.
		switch (cmd) {
		case "1":
			comm = new DBCommand1();
			break;
		case "2":
			comm = new DBCommand2();
			break;
		case "3":
			comm = new DBCommand3();
			break;
		case "4":
			comm = new DBCommand4();
			break;
		}
		
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);


	}

}
