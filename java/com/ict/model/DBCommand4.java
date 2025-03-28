package com.ict.model;

import java.util.List;

import com.ict.repository.BookVO;
import com.ict.service.DBDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DBCommand4 implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		try {
		//DB처리
		String bookname = request.getParameter("bookname");
		String publisher = request.getParameter("publisher");
		String price = request.getParameter("price");
		
		BookVO bvo = new BookVO();
		bvo.setBookname(bookname);
		bvo.setPublisher(publisher);
		bvo.setPrice(price);
		
		int result =  DBDAO.getBookInsert(bvo);
		if(result > 0) {
			List<BookVO> list = DBDAO.getBookListAll();
			request.setAttribute("list", list);
			return "day04/ex_db_output.jsp";
			
		}else {
			
			request.setAttribute("error",  "도서 등록 실패");
			return "day04/error.jsp";
		}
		}catch(Exception e) {
			
			request.setAttribute("error", "도서 등록 실패");
			return "day04/error.jsp";
		}
	}
	
}


