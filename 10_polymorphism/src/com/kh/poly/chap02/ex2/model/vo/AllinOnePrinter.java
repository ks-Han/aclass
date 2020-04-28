package com.kh.poly.chap02.ex2.model.vo;

public abstract class AllinOnePrinter implements Printer, Scanner, KoreaElectronics {
	// 인터페이스는 다중 상속이 가능 하다!
	// 클래스 간의 상속에서만 단일 상속
	
	// 추상 클래스
	// -> 추상 메소드가 0개 이상 존재한느 클래스
	
	private String brand;
	private String pName;
	
	public AllinOnePrinter() {} // 기본생성자
	// 추상 클래스, 인터페이스를 이용하여 객체를 만들 수 있다? no
	// why? 미완성 클래스로는 객체 생성 불가

	// 추상클래스에 왜 생성자를 작성?
	// 자식 객체 생성 시 내부에 부모 부분을 생성하기 위해서 필요는 하지만
	// 이를 이용하여 단일 부모 객체는 만들 수 없다.
	
	public AllinOnePrinter(String brand, String pName) {
		super();
		this.brand = brand;
		this.pName = pName;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	@Override
	public String toString() {
		return "AllinOnePrinter [brand=" + brand + ", pName=" + pName + "]";
	}

	
	
	
}
