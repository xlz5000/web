package com.ict.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThreeCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {

		// 서블릿에서 했던걸 자바로 뺀 다는 느낌
		String s1 = request.getParameter("s1");
		String s2 = request.getParameter("s2");
		String op = request.getParameter("op");
		
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		String result = "";
		switch (op) {
		case "+":
			 result = String.valueOf(num1 + num2);
			break;
		case "-":
			result = String.valueOf(num1 - num2);
			break;
		case "*":
			result = String.valueOf(num1 * num2);
			break;
		case "/":
			if(num2 == 0) {
				result = "0으로 나눌 수 없습니다.";
			}else {
			result = String.valueOf(num1 / num2);
			}
			break;

		}
		
		request.setAttribute("s1", s1);
		request.setAttribute("s2", s2);
		request.setAttribute("op", op);
		request.setAttribute("result", result);
		
		return "day03/ex05_request_output.jsp";
	}

}
