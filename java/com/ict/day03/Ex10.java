package com.ict.day03;

import java.io.IOException;
import java.io.PrintWriter;

import com.ict.model.Command;
import com.ict.model.OneCommand;
import com.ict.model.ThreeCommand;
import com.ict.model.TwoCommand;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		
		String cmd = request.getParameter("cmd");
		Command comm = null;
		
		switch(cmd) {
		case "1": comm = new OneCommand();break;
			
		case "2": comm = new TwoCommand(); break;
		
		case "3": comm =  new ThreeCommand(); break;
			
	
		}
		
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
		
	}



}
