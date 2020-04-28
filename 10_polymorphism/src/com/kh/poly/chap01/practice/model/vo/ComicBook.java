package com.kh.poly.chap01.practice.model.vo;

public class ComicBook extends Book {
	private int accessAge;

	public ComicBook() {
		super();
	}

	public ComicBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "ComicBook accessAge= " + accessAge + super.toString();
	}

	
	
}
