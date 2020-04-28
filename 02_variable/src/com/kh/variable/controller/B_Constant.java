package com.kh.variable.controller;

public class B_Constant {

	public void finalVarialbe() {
		// 변수 선언,초기화
		int age = 20;
		
		// 상수 선언 초기화 - 상수 이름은 모두 대문자
		final int AGE = 20;
		
		System.out.println("값 변경 전");
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// 변수, 상수에 기록된 값을 변경
		
		age = 21;
//		AGE = 21;  // 상수이기에 에러 (이미 초기화가 되어있는 상태이므로)
		System.out.println("값 변경 후");
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		System.out.println("상수는 초기화된 이후 값 변경이 불가능");
	}
}
