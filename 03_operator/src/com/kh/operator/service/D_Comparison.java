package com.kh.operator.service;

public class D_Comparison {

	public void example1() {
		int a = 5;
		
		System.out.println("a는 짝수인가? " + (a % 2 == 0));
		System.out.println("a는 짝수인가? " + (a % 2 != 1));
		
		System.out.println("a는 홀수인가? " + (a % 2 == 1));
		System.out.println("a는 홀수인가? " + (a % 2 != 0));
		
		System.out.println("a는 5의 배수인가? " + (a % 5 == 0));
	}
}
