package com.ict.model;

import java.time.LocalDate;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TwoCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	
		// 오늘의 운세
		LocalDate today = LocalDate.now();
		int luck = (int)(Math.random()*101);
		
		
		String msg = today + " 운세: " + luck + "%";
		request.setAttribute("msg", msg);
		
		
		return "day03/ex05_request_output.jsp";
	}

}
