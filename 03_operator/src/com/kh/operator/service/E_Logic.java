package com.kh.operator.service;

import java.util.Scanner;

public class E_Logic {

	// 논리 연산자
	// - 논리 값 두 개를 비교하는 연산자
	// &&(AND), ||(OR)
	
	public void example1() {
		
		// 단축키 : 한 줄 삭제 -> 삭제할 행에 커서 위치 후 ctrl + d
		// 입력받은 정수가 1 ~ 100 사이의 숫자인지 확인하기
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num1 = in.nextInt();
		in.nextLine();
		in.close();
		
//		System.out.println((num1 > 100? "100보다 크다":(num1 < 1)?"1보다작다":num1));
		
		boolean result = (1 <= num1) && (num1 <= 100);
		System.out.println("1 부터 100 사이의 수인가 ? " + result);
	}
	
	public void example2() {
		// 입력한 알파벳이 대문자 인지 검사
		Scanner in = new Scanner(System.in);
		
		System.out.print("알파벳 아무거나 입력 : ");
		char c = in.nextLine().charAt(0);
		in.close();
		
//		boolean cCheck = ((int)c >= 65) && ((int)c <= 90);
		boolean cCheck = (c >= 'A') && (c <= 'Z');  
		System.out.println("입력 받은 문자 "+c+" : "+"대문자가 맞습니까? "+cCheck);
	}
	
	public void example3() {
		// 입력받은 알파벳이 y인지를 검사한다(대소문자 구분없이)
		Scanner in = new Scanner(System.in);
		
		System.out.print("알파벳 아무거나 입력 : ");
		char c = in.nextLine().charAt(0);
		in.close();
		
		boolean cCheck = (c == 'Y') || (c == 'y');  
		System.out.println("입력 받은 문자 "+c+" 가 y(Y)가 맞습니까? "+cCheck);
	}
	
	public void example4() {
		// 증감 + 산술 + 비교 + 논리
		
		int a = 2;
		int b = 3;
		
		boolean c = a > b;               // false
		boolean d = ++a <= b++;          // true
		
		System.out.println("a : " +a);   // 3
		System.out.println("b : " +b);   // 4
		System.out.println("c : " +c);   // false
		System.out.println("d : " +d);   // true
		
		System.out.println();
		
		System.out.println("!c : " + !c);            //true
		System.out.println("c != d : " + (c != d));  //true
		
		System.out.println();
		
		System.out.println("(a % b) == 1 : " + ((a % b) == 1));                  // false
		System.out.println("(a == 3) && (b == 4) : " + ((a == 3) && (b == 4)));  // true 
		System.out.println("!d || (a-b) > 0 : " + (!d || (a-b) > 0));            // false
		
		System.out.println();
		
		System.out.println("!(c == d) && ((a * b == 10) || ( b % 2 == 0)) : " + (!(c == d) && ((a * b == 10) || ( b % 2 == 0))));
		                                                                         // true
	}
}
