package com.kh.control.chap03.service;

public class B_Continue {

	// continue - 반복문 내에서만 사용 가능한 예약어
	// -> 코드 실행 중 continue를 만나게 되면 이후 내용을 실행하지 않고 반복문 처음으로 돌아간다.
	// -> 처음으로 돌아갈 때 증감식이 있으면 이를 수행함
	public void example1() {
		// 1 ~ 100 사이의 정수 중 4의 배수를 제외 하고
		// 나머지 수들의 합을 구하여라 (continue)

		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 4 == 0) {
				continue;
			}
			sum += i;
		}

		System.out.println(sum);
	}

	public void example2() {
		// 2~9단 까지의 구구단 출력
		// 단, 3단, 6단, 9단은 출력하지 않음.

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (j % 3 == 0) {
					continue;
				}
				System.out.printf("%2d X %-2d=%3d", j, i, i * j);
			}
			System.out.println();
		}
	}
}
