package com.ict.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ict.repository.BookVO;

public class DBDAO {
	// 사용자가 DB 처리를 위한 메서드들을 만들면 된다.
	// db_mapper.xml과 연결 햐고 살행한다.
		
		
		
	// 모든 도서의 정보 가져오기
	// List<BookVO> : BookVO의 객체를 여러개 담고 있다.
	public static List<BookVO> getBookListAll() {
		List<BookVO> list = null;
		SqlSession ss = null;
		
		try {
			// MyBatis를 사용하기 위해서는 DBService있는 factory 필요하다
			// 커밋은 insert, update, delete에 사용함
			// select는 사용하지 않음
			ss = DBService.getFactory().openSession(); // 수동커밋 => 성공 후 커밋을 해야 한다.
			// DBService.getFactory().openSession(true); // 자동 커밋
			
		
			// 결과가 여러개 일때
			// list = ss.selectList(mapper.xml의 id) : 파라미터가 없는 경우
			// list = ss.selectList(mapper.xml의 id, 파라미터 담은 객체(map or vo)) :  파라미터가 있는 경우
			
			
			// 결과 반드시 하나만 나올 때
			// vo = ss.selectOne(mapper.xml의 id); 파라미터가 없는 경우
			// vo = ss.selectOne(mapper.xml의 id, 파라미터 담은 객체(map or vo)); 파라미터가 있는 경우
			
			
			list = ss.selectList("book.list");
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			ss.close();
			
		}
		return list;
	}
	
	// ID 가지고 검색하므로 반드시 하나만 나와야 한다.(앖어도 안되고, 2개이상 있어도 안됨.)
	public static BookVO getBookOneList(String bookid) {
		SqlSession ss = null;
		BookVO bvo = null;
		
		try {
			ss = DBService.getFactory().openSession();
			bvo = ss.selectOne("book.onelist", bookid);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ss != null) ss.close();
			
			
		}
		return bvo;
	}
	
	// 책이름가지고 검색하므로 안올수도 있고 한개 나올수도 있고 여러개 나올 수도 있음.
	public static List<BookVO> getBookOneList2(String bookname){
		SqlSession ss = null;
		List<BookVO> list = null;
		try {
			ss = DBService.getFactory().openSession();
			list = ss.selectList("book.onelist2", bookname);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(ss != null) ss.close();
			
			
		}
			
			return list;
		}
	
		
		// 책 등록
		public static int getBookInsert(BookVO bvo) {
			SqlSession ss = null;
			int result = 0;
			try {
				ss = DBService.getFactory().openSession();
				result = ss.insert("book.insert",bvo);
				ss.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(ss != null) ss.close();
				
				
			}
				
				return result;
			}
			
			
			
		
		
	}
	

