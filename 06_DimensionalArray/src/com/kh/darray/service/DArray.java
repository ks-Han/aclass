package com.kh.darray.service;

import java.util.Arrays;
import java.util.Scanner;

public class DArray {

	// 2차원 배열 : 1차우너 배열 여러 개를 하나로 묶은 것

	public void example1() {

		// 2차원 배열 선언 방법
		int[][] arr1;
		int arr2[][];
		int[] arr3[];

		// [] --> 배열 1차원을 의미함

		// 2차원 배열 할당
		// 배열명 = new 자료형[행크기][열크기];

		arr1 = new int[3][5]; // 3행 5열 2차원 배열

		// 1차원 배열의 길이 == 배열명.length

		System.out.println("행의 개수 : " + arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr " + i + "행의 열의 개수 : " + arr1[i].length);
		}

		// 3행의 5열을 모두 5로 초기화

		// 행 반복 지정
		for (int i = 0; i < arr1.length; i++) {
			// 열 반복 지정
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = 5;
				// 2차원 배열 arr1의 i행 j열의 값을 5로 초기화
			}
		}

		// 2차원 배열 출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.printf("arr[%d][%d]의 값 : %d ", i, j, arr1[i][j]);
			}
			System.out.println();
		}
	}

	public void example2() {
		int arr[][] = new int[4][4];
		int value = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void example3() {
		// 2차원 배열 선언, 할당, 초기화 동시 진행
		// 1 2 3
		// 4 5 6
		// 7 8 9

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void example4() {
		// 가변 배열
		// 행의 개수는 정해져 있으나
		// 열의 개수가 정해지지않은 2차원 배열

		int arr[][] = new int[3][];
		// 가변 배열 행만 할당

		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];

		// 각 칸에 1 ~ 9 까지 수 대입
		int value = 1; // 대입용 변수 선언

		// 행의 크기는 지정되어 있으므로 일반적으로 접근하면 됨.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

	public void example5() {
		// 가변 배열 선언, 할당을 동시에 하기
		int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6, 7 }, };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void example6() {
		// 다음과 같은 배열 형태로 값을 입력받고 저장하기.
		/*
		1번 학생의 점수
		국어 점수 입력 : 50  
		영어 점수 입력 : 60
		수학 점수 입력 : 70
		합계 : 180
		평균 : 60
		
		2번 학생의 점수
		국어 점수 입력 : 70
		영어 점수 입력 : 80
		수학 점수 입력 : 90
		합계 : 240
		평균 : 80
		
		국어 평균 점수 : 60
		영어 평균 점수 : 70
		수학 평균 점수 : 80
		
		*/

		Scanner in = new Scanner(System.in);
		int arr[][] = new int[2][3];
		int result[] = new int[3];
		int i = 0;
		do {
			int sum = 0;
			System.out.println((i + 1) + "번 학생의 점수 ");
			for (int j = 0; j < arr[i].length; j++) {
				String subject = null; // 과목 지정용 변수
				switch (j) {
				case 0:
					subject = "국어";
					break;
				case 1:
					subject = "영어";
					break;
				case 2:
					subject = "수학";
					break;
				default:
					break;
				}

				System.out.print(subject + "접수 입력 : ");
				arr[i][j] = in.nextInt();
				in.nextLine();

				sum += arr[i][j]; // 합계 누적
			}

			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + (sum / arr[i].length));
			i++;

			if (i == arr.length) {
				for (int j = 0; j < arr[0].length; j++) {
					result[j] = 0;
					for (int j2 = 0; j2 < arr.length; j2++) {
						result[j] += arr[j2][j];
					}
				}

				for (int j = 0; j < result.length; j++) {
					String subject = null; // 과목 지정용 변수
					switch (j) {
					case 0:
						subject = "국어";
						break;
					case 1:
						subject = "영어";
						break;
					case 2:
						subject = "수학";
						break;
					default:
						break;
					}
					System.out.println(subject + " 평균 점수  : " + result[j] / arr.length);
				}
			}
		} while (i < arr.length);
	}

	public void example7() {
		// 3행 3열 정수형 2차원 배열에
		// 1 ~ 9 까지 난수를 중복 없이 저장하기.

//		int arr[][] = new int[3][3];

		// 1) 1차원 배열에 1 ~ 9까지 난수 중복 없이 저장
		int iArr[] = new int[9];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int)(Math.random()*9+1);
			for (int j = 0; j < i; j++) {
				if (iArr[i] == iArr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(iArr));

		// 값 저장용 2차원 선언, 할당.
		int[][] newArr = new int[3][3];
		
		// 1차원 배열 인덱스 증가용 변수
		int index = 0;
		
		// 2차원 배열에 값 대입용 for문
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = iArr[index++];
				
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
