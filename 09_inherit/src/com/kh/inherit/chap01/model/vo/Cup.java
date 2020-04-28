package com.kh.inherit.chap01.model.vo;

public class Cup extends Product{

	private String brand;
	private double capacity;
//	private String pName;
//	private int price;

	public Cup() {
		super();
	}

	public Cup(String brand, double capacity, String pName, int price) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		setpName(pName);
		setPrice(price);
		// 부모로 부터 상속 받은 pName과 price는 접근제한자가 private 이므로
		// 직접 접근할 수는 없지만
		// 부모로 부터 상속 받은 간접 접근 방법 setPname(), setPrice()를 이용하여
		// pName, price를 초기화할 수 있다.
		
//		this.pName = pName;
//		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

//	public String getpName() {
//		return pName;
//	}
//
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}

	public String selectField() {
		return brand + " / " + capacity + " / " + super.selectField();
	}

}
