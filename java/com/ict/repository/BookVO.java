package com.ict.repository;

// 기본적으로 테이블의 컬럼과 이름으 같게 만든다.
public class BookVO {
	private String bookid, bookname, publisher, price;
	
	
	
	public BookVO() 	{}

	public BookVO(String bookid, String bookname, String publisher, String price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	
}
