package com.ict.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalcCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 계산하는 처리하는 메서드
		// 넘어온 정보를 받아서 계산 처리하고 결과를 저장
		
		// 결과를 보여줄 페이지
		return "day02/result.html";
	}
	
	

}
