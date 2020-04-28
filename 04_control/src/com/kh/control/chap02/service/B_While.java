package com.kh.control.chap02.service;

import java.util.Scanner;

public class B_While {

	// while 문
	// for문과 달리 반복 횟수가 정해져 있지 않고
	// 특정 조건이 false가 될 때 까지 반복하는 용도로 사용되는 반복문

	/* [표현식]
	 * 
	 * [초기식]
	 * while(조건식) {
	 *     수행될 문장;
	 *     [증감식 or 분기문]
	 * }
	 * 
	 * */

	public void example1() {
		int i = 1;

		while (i <= 5) {
			System.out.println(i);
			i++;
		}
	}

	public void example2() {
		// 10 ~ 1 까지 출력 (while)

		int a = 10;

		while (a > 0) {
			System.out.println(a);
			a--;
		}
	}

	public void example3() {

		Scanner in = new Scanner(System.in);

		int sum = 0;
		int input = 0;

		boolean flag = true;

		while (flag) {
			System.out.print("입력 : ");
			input = in.nextInt();
			in.nextLine();

			if (input == 0) { // 입력값이 0인 경우 종료
				flag = false;
			} else {
				sum += input;
			}
		}

		System.out.println("합계 : " + sum);
	}

	public void example4() {
		// 중첩 while 문
		// 입력되는 수 만큼의 가로 세로길이의 "*"로 채워진 사각형 출력하기

		Scanner in = new Scanner(System.in);

		System.out.print("양수 입력 : ");
		int input = in.nextInt();
		in.nextLine();

		int i = 0;
		int j = 0;

		while (i < input) {
			j = 0;
			while (j < input) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

	public void example5() {
		// 키보드로 문자열을 입력받아 그대로 출력하기 반복
		// 단, exit 입력 시 종료

		Scanner in = new Scanner(System.in);

		String str = null;
		boolean flag = true;

//		while (flag) {
//			System.out.print("문자열을 입력해주세요 : ");
//			str = in.nextLine();
//			System.out.println(str);
//			
//			if(str.equals("exit")) {
//				flag = false;
//			}
//		}
		do {
			System.out.print("문자열 입력 : ");
			str = in.nextLine();

			System.out.println("Str : " + str);
		} while (!str.equals("exit"));
	}

	public void example6() {
		// 종료에 해당하는 번호가 입력되기 전 까지
		// 무한히 반복되는 메뉴 만들기

		Scanner in = new Scanner(System.in);

		int menu = 0; // 입력 받는 번호를 저장할 변수 선언 및 초기화

		do {
			System.out.println("=========================");
			System.out.println("1. 1번기능");
			System.out.println("2. 2번기능");
			System.out.println("3. 3번기능");
			System.out.println("0. 프로그램 종료");
			System.out.println("=========================");

			System.out.print("메뉴 선택 >> ");
			menu = in.nextInt();
			in.nextLine();

			switch (menu) {
			case 1:
				System.out.println("1번 기능 수행");
				break;
			case 2:
				System.out.println("2번 기능 수행");
				break;
			case 3:
				System.out.println("3번 기능 수행");
				break;
			case 0:
				System.out.println("프로그램을 종료 합니다.");
				return;
			default:
				System.out.println("번호를 잘못 입력 하였습니다.");
				break;
			}
		} while (menu != 0);

	}

}