package com.kh.control.chap03.service;

import java.util.Scanner;

public class A_Break {

	public void example1() {
		// 1 ~ 10 까지 출력 (for문 사용 단 for문의 조건식을 작성하면 안됨)
		for (int i = 1;; i++) {
			System.out.print(i + " ");
			if (i == 10) break;
		}
	}
	
	public void example2() {
		// 문자열을 입력받아 출력하기
		// 단, exit 입력 시 종료
		
		Scanner in = new Scanner(System.in);
		
		String str = "";
		
		while (true) {
			
			System.out.print("입력 : ");
			str = in.nextLine();
			System.out.println("str : " + str);
			if (str.equals("exit")) {
				break;
			}
		}
	}
}
