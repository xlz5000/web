package com.ict.model;

import java.util.ArrayList;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OneCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// request 속성을 이용해서 데이터 저장
		/*
		 * request.setAttribute("title", "나는 OneCommand"); 
		 * request.setAttribute("data",17);
		 * 
		 * 
		 * // 배열 또는 ArrayList 인 경우 ArrayList<String> list = new ArrayList<>();
		 * list.add("홍길동"); 
		 * list.add("일지매"); 
		 * list.add("장길산");
		 * list.add("마이콜");
		 * list.add("희동이");
		 * 
		 * request.setAttribute("list", list);
		 */
		
		
		// 파라미터를 받을 수 있다.
		String username = request.getParameter("username");
		String userage = request.getParameter("userage");
		
		
		request.setAttribute("username", username);
		request.setAttribute("username", userage);
		
		return "day03/ex05_request_output.jsp";
	}

}
