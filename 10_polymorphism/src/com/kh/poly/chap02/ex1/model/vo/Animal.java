package com.kh.poly.chap02.ex1.model.vo;

public interface Animal {
	
	// 인터페이스의 필드는 무조건 public static final
//	public static final int SOUL = 1;
	
	// 인터페이스의 필드는 묵시적으로 public static final
	int SOUL = 1;
	
	// 인터페이스의 메소드는 무조건 public abstract
	public abstract String breath();
	
	// 인터페이스의 메소드는 묵시적으로 public abstract
	String eat();
	
	// 인터페이스를 상속하는 키워드
	/*
	 * 인터페이스를 (일반)크래스가 상속 : implements (구현하다)
	 * 
	 * 인터페이스를 추상 클래스가 상속 : 
	 */
}
