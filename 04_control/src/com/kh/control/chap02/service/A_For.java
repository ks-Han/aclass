package com.kh.control.chap02.service;

import java.util.Scanner;

public class A_For {

	/*
	 * [표현식]
	 * for(초기식 ; 조건식 ; 증감식) {
	 *       반복 수행할 코드;
	 * }
	 * */

	public void example1() {
		// 1부터 5까지 출력

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}

	public void example2() {
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
	}

	public void example3() {
		for (int i = 1; i < 51; i += 2) {
			System.out.println(i);
		}
	}

	public void example4() {

		int dan = 7;

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	}

	public void example5() {

		// 정수를 하나 입력받아
		// 해당 수가 2 ~ 9 사이 수 인지 검사하여
		// 맞을 경우 해당 단의 구구단 출력하기
		// 아닐 경우 "2 ~ 9 사이의 수를 입력 하세요 " 출력

		Scanner in = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int dan = in.nextInt();
		in.close();

		if (dan >= 2 && dan <= 9) {
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		} else {
			System.out.println("2 ~ 9 사이의 수를 입력하세요.");
		}
	}

	public void example6() {
		// 1 ~ 100 까지의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void example7() {

		// 1부터 입력받은 정수 까지의 합
		// 단, 입력하는 수는 1을 초과한 수 이여야 함.
		// 1 이하 수 입력 시 "잘못 입력하셨습니다." 출력

		int sum = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = in.nextInt();
		in.close();

		if (num > 1) {
			for (int i = 0; i < num; i++) {
				sum += i;
			}
			System.out.println(sum);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void example8() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void example9() {
		// 0분 0초 부터 9분 59초

		for (int min = 1; min < 10; min++) {
			for (int sec = 0; sec < 60; sec++) {
				System.out.printf("%2d분 %2d초\n", min, sec);
			}
		}
	}

	public void example10() {

		for (int dan = 2; dan < 10; dan++) {
			for (int su = 1; su < 10; su++) {
				System.out.printf("%2d X %2d = %2d  ", dan, su, dan * su);
			}
			System.out.println();
		}
	}

	public void example11() {
		// 별 찍기(*)

		// 1 번째문제 (5x5)
		// ******
		// ******
		// ******
		// ******
		// ******

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void example12() {
		// 2 번째문제
		// *
		// **
		// ***
		// ****

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void example13() {
		// 3 번째문제
		//   *
		//  ***
		// *****
		//  ***
		//   *

		Scanner sc = new Scanner(System.in);
		System.out.print("*****홀수입력*****");

		int count = sc.nextInt(); // 홀수 입력받음 ex))5를 입력(이하 5를 입력했다는 가정하에 설명)

		int o = count / 2; // 입력받은 홀수 나누기2 ex)) 5/2 = 2.5 이지만 정수만남아 2

		for (int i = -o; i <= o; i++) { // 5를 입력하였으니 -2,-1,0,1,2 총 5번 돌게 되어있다.
			int k = 0; // 비교하기위해 k를 선언, 이중포문 탈출뒤 초기화;
			for (int j = 0; j < count - Math.abs(i); j++) { // Math.abs(a) 함수는 a를 절대값으로 인식한다 예를들어 -2일 경우 2로인식 /////따라서 이
															// 포문은 3,4,5,4,3 번 돌게 되어있다. // 첫바퀴는 j = 0; j < 3 ; j ++ 인
															// 샘이다.
				String result = k < Math.abs(i) ? " " : "*"; // 공백과 별을 구분하기위해 삼항연산자를 사용 비교자 k 가 절대값i보다 작으면 공백 크면 별을 찍어주는
																// 공식. // 삼항연산자 숙지 >> 조건식 ? 조건이참일떄 : 조건이 거짓일때
				System.out.print(result);
				k++; // 한번돌때마다 k 를 증가시켜준다. 공백을 찍은걸 체크, Math.abs(i) 는 한줄의 공백의 갯수도 되는데 k가 공백의 갯수보다 더
						// 찍혓으면 result 가 false 가 되어 *을찍게된다
			}
			System.out.println();
		}
	}
	
	public void example14() {
		//    *
		//   **
		//  ***
		// ****
		
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		int num = in.nextInt();
// 방식 1번째
		for (int i = 0; i < num; i++) {
			for (int k = 0; k < num-1-i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
// 방식 2번째
//		int a = 0;
//		
//		for (int i = 0; i < num; i++) {
//			a = 0;
//			for (int j = 0; j < num; j++) {
//				String str = a < (num-1)-i? " ":"*";
//				System.out.print(str);
//				a++;
//			}
//			System.out.println();
//		}
	}
	
	public void example15() {
		
	}
}
