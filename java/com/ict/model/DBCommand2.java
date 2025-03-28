package com.ict.model;

import com.ict.repository.BookVO;
import com.ict.service.DBDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DBCommand2 implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String bookid = request.getParameter("bookid");
		
		// DB 처리
		BookVO bvo = DBDAO.getBookOneList(bookid);
		
		if(bvo == null) {
			request.setAttribute("error", "해당 ID에 해당하는 도서는 존재하지 않습니다.");
			return "day04/error.jsp";
			
		}
		
		
		request.setAttribute("bvo", bvo);
		return "day04/ex_db_output2.jsp";
	}

}
