package com.kh.operator.service;

public class B_InDecrement {

	// 증감 연산자
	// - 피연사자를 1 증가 또는 감소 시키는 연산자
	// --> 피연산자 : 연산을 당하는 수 또는 변수

	// ++ (1증가), -- (1감소)

	// 전위 연산자 : 먼저 증감 연산 실행 후 다른 연산 진행
	// 후위 연산자 : 다른 연산 진행 후 증감 연산 진행
	public void example1() {
		// 전위 증감 연산자 테스트
		int num = 10;

		System.out.println("증감 연산자 적용 전 : " + num); // 10
		System.out.println("++num 1회 수행 후 : " + ++num); // 11
		System.out.println("num++ 1회 수행 후 : " + num++); // 11
		System.out.println("num 최종 값 : " + num); // 12

		System.out.println("\n\n");

		int num2 = 10;
		System.out.println("증감 연산자 적용 전 : " + num2); // 10
		System.out.println("num2-- 1회 수행 후 : " + num2--); // 10
		System.out.println("num2 변경 된 값 : " + num2); // 9
		System.out.println("++num2 1회 수행 후 : " + ++num2); // 10
		System.out.println("num2 최종 값 : " + num2); // 10
	}

	public void example2() {
		int num1 = 20;

		int result = num1++ * 3;

		System.out.println("num1 : " + num1); // 21
		System.out.println("result : " + result); // 60
	}

	public void example3() {
		int a = 10;
		int b = 20;
		int c = 30;

		int result1 = a++; // 10
		int result2 = ++a + b++; // 12 + 20
		int result3 = a++ + --b + --c; // 12 + 20 + 29
										// a = 13, b = 20, c = 29

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
	}
	
	
}
