package com.kh.objectarray.model.vo;

public class Book {

	private String title; // 제목
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자

	// 기본 생성자
	public Book() {

	}

	// 매개변수 있는 생성자 (전체)
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	// get / setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	// 필드 정보 출력용 메소드
	public String selectBook() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}

}
