package com.kh.operator.service;

import java.util.Scanner;

public class G_Triple {

	public void example1() {
		Scanner in = new Scanner(System.in);
	
		System.out.print("정수 하나 입력 : ");
		int num1 = in.nextInt();
		in.nextLine();
		in.close();
		
		String result = (num1 > 0)? "양수이다" : "양수가아니다"; 
		System.out.println(num1 + "은/는 " + result);
	}
	
	public void example2() {
		// 정수를 입력 받아 양수, 0, 음수 검사하기
		
		Scanner in = new Scanner(System.in);
	
		try {
			System.out.print("정수 하나 입력 : ");
			int num1 = in.nextInt();
			in.nextLine();
			in.close();
			String result = (num1 > 0)? "양수이다" : (num1 == 0)? "0이다": "음수이다"; 
			System.out.println(num1 + "은/는 " + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("값 확인");
		}

	}
}
