package com.gaptech.java8.beans;

public class Article {
	
	
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(String bookId, String bookName, BookType bookType) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookType = bookType;
	}
	private String bookId;
	private String bookName;
	private BookType bookType;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public BookType getBookType() {
		return bookType;
	}
	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	

}
