package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice2 {

	int a,b = 0;
	
	public VariablePractice2() {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		a = in.nextInt();
		in.nextLine();
		System.out.print("두 번째 정수 : ");
		b = in.nextInt();
		in.nextLine();
		in.close();
		
		System.out.println("더하기 결과 : " + (a+b));
		System.out.println("빼기 결과 : "  + (a-b));
		System.out.println("빼기 결과 : "  + (b-a));
		System.out.println("곱하기 결과 : " + (a*b));
		System.out.println("나누기 결과 : " + (a/b));
		
	}
}
