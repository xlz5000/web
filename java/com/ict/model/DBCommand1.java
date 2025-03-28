package com.ict.model;

import java.util.List;

import com.ict.repository.BookVO;
import com.ict.service.DBDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DBCommand1 implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리 하는 곳
		// DB 처리 - book 테이블의 모든 정보 가져오기
		
		
		List<BookVO> list = DBDAO.getBookListAll();
		
		
		
		//정보 저장
		request.setAttribute("list", list);
		return "day04/ex_db_output.jsp";
	}

}
