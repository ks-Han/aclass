package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class C_ArraySort {

	public void example1() {
		// 두 변수의 값을 서로 바꾸기
		int a = 10;
		int b = 20;

		// 두 변수의 값 바꾸기 위한 임시 변수 선언
		int tmp;

		tmp = a;
		a = b;
		b = tmp;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}

	public void example2() {
		// 배열 내에서 인덱스 값 바꾸기
		int arr[] = { 2, 1, 3 };
		int tmp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public void example3() {
		// 배열 내에서 인덱스 값 역순으로 바꾸기
		int arr[] = { 2, 1, 3 };
		int tmp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public void example4() {
		// 선택 정렬(Selection Sort)
		// 비교되지 않은 배열 전체를 탐색하여
		// 최소값을 찾아
		// 배열의 앞쪽부터 채워나가는 정렬 방식
		// 데이터의 양이 적을 경우 좋은 성능을 보이는 정렬 방식
		// 100개 이상시 성능 저하가 급격하게 일어남
		int[] arr = { 2, 1, 4, 5, 3, 1 };
		System.out.println("최초 배열 값 :"+Arrays.toString(arr));

		int min = 0; // 뒤쪽 배열 중 제일 작은 값을 저장하고 있는 인덱스를 저장
		for (int i = 0; i < arr.length - 1; i++) {
			// 선택 정렬은 배열의 길이 -1 바퀴 째에서 정렬이 완료됨
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				// 앞쪽을 제외하고 뒤쪽에서 가장 작은 수를 찾음
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
			
			System.out.println(i+1+"바퀴"+Arrays.toString(arr));
		}

	}

	public void randomGame() {

		int result = (int) (Math.random() * 100 + 1);
		int input = 0;
		int i = 0;
		int maxRound = 10;

		do {
			Scanner in = new Scanner(System.in);
			System.out.print("1~100 숫자사이 숫자 맞추기 " + (maxRound - i) + "번 기회 남음 : ");
			input = in.nextInt();
			i++;

			if (input < result) {
				System.out.println("보다 큼");
			} else if (input > result) {
				System.out.println("보다 작음");
			} else if (input == result) {
				System.out.println("맞음");
				break;
			} else {
				System.out.println("?");
			}

		} while (i != maxRound);

		System.out.println(i + "번 만에 맞음 " + "답 : " + result);
	}
}
