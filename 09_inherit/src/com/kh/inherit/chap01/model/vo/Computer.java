package com.kh.inherit.chap01.model.vo;

// Computer 클래스가 Product 클래스를 상속
// 상속 키워드 : extends(확장하다)
// 부모의 멤버 + 자식의 멤버 -> 부모 보다 몸집이 확장됨
public class Computer extends Product {
	private String cpu;
	private int ram;
//	private String pName;
//	private int price;

	public Computer() {
		super();
		// super() 기본생성자는
		// 작성하지 않아도
		// JVM에 의해서 컴파일 단계에서 자동으로
		// 생성자 제일 위쪽에 추가됨.
	}

	public Computer(String cpu, int ram, String pName, int price) {
		super(pName,price);
		this.cpu = cpu;
		this.ram = ram;
//		this.pName = pName;
//		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
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
		return cpu + " / " + ram + " / " + super.selectField();
//		+ pName + " / " + price;
	}

}
