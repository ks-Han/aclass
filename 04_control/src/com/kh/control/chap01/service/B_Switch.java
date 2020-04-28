package com.kh.control.chap01.service;

import java.util.Scanner;

public class B_Switch {

	// switch문
	// if문의 부분 집합(일부분)으로
	// if문은 조건식으로 범위를 지정할 수 있지만,
	// switch문은 딱 떨어지는 값이 조건식으로 작성되어야 한다.

	/* [표현식]
	 * 
	 * switch(비교 대상 또는 식) {
	 * case 값1 : 싱행코드1; break;
	 * case 값2 : 싱행코드2; break;
	 * default : else에 해당하는 실행코드; 
	 * }
	 * 
	 * break : switch 문을 멈춰라 라는 의미
	 * 
	 * */

	public void example1() {
		// 1~5 사이의 정수를 입력받아
		// 1이면 1팀, 2이면 2팀 .... 팀을 부여하고 출력하기
		// 단, 입력받은 수가 1~5사이의 수가 아니면
		// "잘못 입력하셨습니다." 출력

		int num = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력해주세요 : ");
		num = in.nextInt();
		in.nextLine();
		in.close();

		switch (num % 6) {
		case 1:
			System.out.println("1팀");
			break;
		case 2:
			System.out.println("2팀");
			break;
		case 3:
			System.out.println("3팀");
			break;
		case 4:
			System.out.println("4팀");
			break;
		case 5:
			System.out.println("5팀");
			break;

		default:
			System.out.println("잘못입력했습니다");
			break;
		}
	}

	public void example2() {
//		두 수를 입력받고, 연산자(+-*/%) 중 하나를 입력 받아
//		두 수를 연산한 결과를 출력.
//		단, 잘못된 연산자 입력 시
//		"연산자를 잘못 입력하셨습니다."

		int num1, num2, result = 0;
		char op;
		Scanner in = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력해주세요 : ");
		num1 = in.nextInt();
		in.nextLine();

		System.out.print("두 번째 정수를 입력해주세요 : ");
		num2 = in.nextInt();
		in.nextLine();

		System.out.print("연산자를 입력해주세요 : ");
		op = in.nextLine().charAt(0);
		in.close();

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
			return; // 호출한 곳으로 돌아가라 (종료하라는 의미로 사용함)
		}

		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}

	public void example3() {
		// 과일 이름 (사과, 바나나, 복숭아)를 입력받아
		// 사과일 경우 3천원,
		// 바바나일 경우 2천원,
		// 복숭아일 경우 8천원 을 출력
		// 단, 잘못 입력한 경우
		// "해당하는 과일이 없습니다." 출력

		String fruit, price = "";
		int aprice = 3000;
		int bprice = 2000;
		int cprice = 8000;
		Scanner in = new Scanner(System.in);

		System.out.print("과일을 입력하세요 (사과, 바나나, 복숭아) : ");
		fruit = in.nextLine();
		in.close();

		switch (fruit) {
		case "사과":
			price = String.format("%,d", aprice);
			break;
		case "바나나":
			price = String.format("%,d", bprice);
			break;
		case "복숭아":
			price = String.format("%,d", cprice);
			break;

		default:
			System.out.println("해당하는 과일이 없습니다.");
			return;
		}

		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
	}

	public void example4() {
		// 1~12월 중 하나를 입력 받아
		// 해당 월의 일 수를 출력

		int month, day = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("1~12월 중 하나를 입력해주세요 : ");
		month = in.nextInt();
		in.nextLine();
		in.close();

		// 31일 : 1,3,5,7,8,10,12
		// 30일 : 4,6,9,11
		// 28,29일 : 2

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 29;
			break;

		default:
			System.out.println("잘못 입력함");
			return;
		}

		System.out.println("일수 : " + day);
	}
}
