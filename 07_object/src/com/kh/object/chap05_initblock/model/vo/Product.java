package com.kh.object.chap05_initblock.model.vo;

/**
 * @author ks
 *
 */
public class Product {

	private String pName; // 상품명
	private int price; // 가격
	
	{ // 인스턴스 초기화 블록
		// 인스턴스 변수 (멤버변수)를
		// 객체 생성 시 마다 한 번에 초기화 하는 용도
		pName = "갤럭시Z플립";
		price = 12000000;
		
	}
	
	// getter / setter
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
	
	public String selectProduct() {
		return pName + " / " + price;
	}
}
