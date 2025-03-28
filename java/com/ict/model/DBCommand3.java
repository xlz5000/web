package com.ict.model;

import java.util.List;

import com.ict.repository.BookVO;
import com.ict.service.DBDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DBCommand3 implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {

		
		String bookname = request.getParameter("bookname");
		// DB 처리
		List<BookVO>list = DBDAO.getBookOneList2(bookname);
		
		
		if(list == null || list.size() <= 0) {
			request.setAttribute("error", "해당 제목의 도서는 존재하지 않습니다.");
			return "day04/error.jsp";
			
		}
		
		
		request.setAttribute("list", list);
		return "day04/ex_db_output.jsp";
	}

}
