package com.kh.inherit.chap01.model.vo;

public class Product {

	// Computer, Cup, Car 클래스에서 공통되었던 부분을 작성함.
	private String pName;
	private int price;

	public Product() {
	}

	public Product(String pName, int price) {
		this.pName = pName;
		this.price = price;
	}

	// 공통된 getter / setter 추출
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String selectField() {
		return pName + " / " + price;
	}

}
