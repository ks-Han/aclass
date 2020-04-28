package com.kh.control.chap01.service;

import java.util.Scanner;

public class A_If {

	/*
	 * 프로그램의 진행은 위에서 아래, 좌에서 우로 순차적으로 진행된다.
	 * 
	 * 이 순차적인 흐름을 바꿀 때 사용하는 것이 제어문이다
	 * 
	 * - 선택적으로 원하는 코드를 수행 --> 조건문 - 반복적으로 원하는 코드를 반복 수행 --> 반복문 - 반복문에서 특정 조건에 따라 반복
	 * 행위를 제어하는 것 --> 분기문
	 * 
	 * <조건문> 조건식이 참이냐 거짓이냐를 판단해서 그에 만족하는 코드를 실행하는 구문
	 * 
	 * 
	 * 조건문은 대표적으로 if, switch문이 존재한다.
	 * 
	 */

	public void example1() {
		// 단독 if문

		// if문의 조건식이 true이면 중괄호({},블록) 내의 코드 수행
		// false 이면 해당 코드를 무시하고 건너 뜀

		Scanner in = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = in.nextInt();
		in.nextLine();
		in.close();

		if (num > 0)
			System.out.println("양수입니다");
		if (num <= 0)
			System.out.println("음수입니다");
	}

	public void example2() {
		// if-else문
		/* - 조건식이 참인 경우 if문의 코드를,
		 *   거짓인 경우에는 else문의 코드를 수행한다
		 *   
		 * [표현식]
		 * if(조건식) {
		 *   참인 경우 실행코드 ...
		 * }else {
		 *   참이 아닌 경우 실행코드 ...
		 * }
		 * */

		Scanner in = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = in.nextInt();
		in.nextLine();
		in.close();

		String result = "";
		if (num % 2 == 0 && num != 0)
			result = "짝수";
		else if (num == 0)
			result = "0";
		else
			result = "홀수";

		System.out.println(num + "은/는 " + result + "이다.");

	}

	public void example3() {
		// 나이를 입력받아 일반, 청소년, 초등학생, 유아 구분 후 요금 받기.
		// 일반 : 1250원 , 20세
		// 청소년 : 720원 , 14 ~ 19세
		// 초등학생 : 450원 , 8 ~ 13세
		// 유아 : 0원 , 0 ~ 7세

		Scanner in = new Scanner(System.in);
		System.out.print("나이 입력하세요 : ");
		int age = in.nextInt();
		in.nextLine();
		in.close();

		final int aFee = 1250; // 일반
		final int bFee = 720; // 청소년
		final int cFee = 450; // 초등학생
		final int dFee = 0; // 유아

		String feePay = "";
		if (age >= 20) {
			feePay = String.format("%,d원", aFee);
		} else if (age < 20 && age >= 14) {
			feePay = String.format("%,d원", bFee);
		} else if (age < 14 && age >= 8) {
			feePay = String.format("%,d원", cFee);
		} else {
			feePay = String.format("%,d원 으로 무료", dFee);
		}

		System.out.println("나이 : " + age + "세 로 요금은 : " + feePay + " 입니다");

	}

	public void example4() {
		// 나이를 입력받아 일반, 청소년, 초등학생, 유아 구분 후 요금 받기.
		// 일반 : 1250원 , 20세
		// 청소년 : 720원 , 14 ~ 19세
		// 초등학생 : 450원 , 8 ~ 13세
		// 유아 : 0원 , 0 ~ 7세

		Scanner in = new Scanner(System.in);
		System.out.print("나이 입력하세요 : ");
		int age = in.nextInt();
		in.nextLine();
		in.close();

		final int aFee = 1250; // 일반
		final int bFee = 720; // 청소년
		final int cFee = 450; // 초등학생
		final int dFee = 0; // 유아

		String division = ""; // 구분 내용을 저장할 변수 선언
		String feePay = "";

		if (age >= 20) {
			if (age >= 65) {
				division = "우대권";
				feePay = String.format("우대권 사용자로 무료");
			} else {
				division = "일반";
				feePay = String.format("%,d원", aFee);
			}
		} else if (age >= 14) {
			division = "청소년";
			feePay = String.format("%,d원", bFee);
		} else if (age >= 8) {
			division = "초등학생";
			feePay = String.format("%,d원", cFee);
		} else if (age >= 0) {
			division = "유아";
			feePay = String.format("%,d원 으로 무료", dFee);
		} else {
			division = "ERROR";
			feePay = String.format("알수 없는 나이");
		}

		System.out.println("나이 : " + age + "세 " + division + " 요금은 : " + feePay + " 입니다");

		if (division.equals("ERROR")) {
			System.out.println("에러코드 : ERR_04");
		} else {
			System.out.println("정상적으로 이용가능합니다");
		}

	}

	public void example5() {
		// 점수를 하나 입력받아 등급을 출력하시오.
		// 95점 이상 A+
		// 94 ~ 90점 A
		// 89 ~ 85점 B+
		// 84 ~ 80점 B
		// 79 ~ 75점 C+
		// 74 ~ 70점 C
		// 69 ~ 60점 D
		// 60점 미만 F

		// ex)
		// 점수 입력 : 95
		// 95점, A+ 입니다

		String string = "";
		Scanner in = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		int score = in.nextInt();

		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				string = "A";
				if (score >= 95)
					string += "+";
			} else if (score >= 80) {
				string = "B";
				if (score >= 85)
					string += "+";
			} else if (score >= 70) {
				string = "C";
				if (score >= 75)
					string += "+";
			} else if (score >= 60) {

				string = "D";
				if (score >= 65)
					string += "+";
			} else {
				string = "F";
			}

			System.out.println(score + "점, " + string + " 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		in.nextLine();
		in.close();

//		if (score >= 95) {
//			string = "A+";
//		} else if (score >= 90) {
//			string = "A";
//		} else if (score >= 85) {
//			string = "B+";
//		} else if (score >= 80) {
//			string = "B";
//		} else if (score >= 75) {
//			string = "C+";
//		} else if (score >= 70) {
//			string = "C";
//		} else if (score >= 60) {
//			string = "D";
//		} else {
//			string = "F";
//		}

	}
}
