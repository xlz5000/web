package com.ict.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LuckyCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 오늘의 운세를 구한 메서드
		// 운세를 구할 로직과 결과를 저장할 로직
		
		// 결과를 보여줄 페이지
		return "day02/result.html";
	}
	
}
