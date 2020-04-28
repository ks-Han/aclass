package com.kh.operator.service;

import java.util.Scanner;

public class C_Arithmetic {
	// Arithmetic - 산수

	// 산술 연산자
	// 기존 사칙연산자에 %(modulars, mod)가 추가됨.
	// 나누기(/) 연산 시 자료형의 유의
	
	// 두 정수를 입력받아 +,-,*,/,% 결과 출력
	public void example1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두 번째 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	}
}
