package com.kh.poly.chap01.model.vo;

public class Car {
	private String engine;
	private String color;

	public Car() {
		super();
	}

	public Car(String engine, String color) {
		super();
		this.engine = engine;
		this.color = color;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", color=" + color + "]";
	}

	// 바인딩 확인
	// - 바인딩? 실제 실행할 메소드와 호출 되는 메소드를 연결하는 것
	public String drive() {
		return "달리다.";
	}
	// 다형성이 적용된 상태에서 ex) Car c= new Bentley();
	// c.drive()를 호출하면
	// 컴파일 단계에서는 Car에 있는 drive()와 바인딩을 진행 함.
	// == 정적 바인딩
	
}
