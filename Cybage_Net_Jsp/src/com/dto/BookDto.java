package com.dto;

public class BookDto {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bPrice;
	public BookDto(int bId, String BookName, String bAuthor, double bPrice) {
		super();
		this.bookId = bId;
		this.bookName = BookName;
		this.bookAuthor = bAuthor;
		this.bPrice = bPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bId) {
		this.bookId = bId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String BookName) {
		this.bookName = BookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bAuthor) {
		this.bookAuthor = bAuthor;
	}
	public double getbPrice() {
		return bPrice;
	}
	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "BookDto [bId=" + bookId + ", BookName=" + bookName + ", bAuthor="
				+ bookAuthor + ", bPrice=" + bPrice + "]";
	}
	
	
	
	
	
	
}
