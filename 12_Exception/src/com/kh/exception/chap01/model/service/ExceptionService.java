package com.kh.exception.chap01.model.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class ExceptionService {
	public void example1() {
		// Unchecked Exception
		// 별도 예외 처리를 하지 않아도 되는 예외
		// 주로 프로그래머의 부주의로 인한 오류인 경우가 많기 때문에
		// 예외 처리 코드 보단 if문 등을 이용하여 코드를 수정하는 경우가 많음

		// 두 숫자를 입력받아 나누기 하는 프로그램
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();

		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

		// java.lang.ArithmeticException : // by zero
		// 산술 연산 중 0으로 나누는 예외 상황이 발생
	}

	public void example2() {
		String[] arr = { "초코파이", "몽쉘", "오예스", null };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) { // NullPointerException 예외
				System.out.println(arr[i].length());
			}
		}

		// java.lang.NullPointerException
		// null : 아무것도 참조하고 있지 않다.
		// 저장된 값이 null인 참조변수를 이용하여 객체 멤버 접근 시도 시 발행하는 예외

		// java.lang.ArrayIndexOutOfBoundsException : 4
		// 배열의 인덱스 범위를 넘어서서 참조할 때 발생하는 예외

	}
	
	public void example3() {
		// Checked Exception
		// 반드시 예외 처리를 해야하는 예외(Exception)
		// 주로 IO(입출력) 상황에서 많이 발생함.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner (jkd 1.5) 이전에 사용되던 키보드 입력 방법
		
		System.out.println("입력 : ");
//		String str = br.readLine();
		// Unhandled exception type IOException
		// == IOException 예외처리가 안되어 있다.
		
	}
}
