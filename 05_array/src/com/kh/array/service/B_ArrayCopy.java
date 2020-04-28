package com.kh.array.service;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {

	// 배열 복사에는 2종류가 있다
	// 1.얕은 복사
	// - 참조하는 배열의 시작 주소만을 복사
	// 2.깊은 복사
	// - 복사하고자 하는 배열과 동일한 자료형, 크기를 가지는 배열을 만들어
	// 내부 데이터를 똑같이 작성(복사) 하는 것
	public void example1() {
		// 얕은 복사 시 원본데이터 유지 여부 확인

		int origin[] = { 10, 20, 30, 40, 50 };

		// 얕은 복사 진행
		int copyArr[] = origin; // 배열 참조형 변수에 저장된 주소값을 복사해옴

		// 데이터 변경 전 원본
		System.out.println(Arrays.toString(origin));
		// Arrays 클래스 : 배열을 편하게 또는 추가적인 기능을 제공하는 클래스

		// 복사 데이터 변경 전
		System.out.println(Arrays.toString(copyArr));

		// 복사본의 데이터를 변경
		copyArr[2] = 10000;

		// 복사 데이터 변경 후
		System.out.println("복사본 값" + Arrays.toString(copyArr));

		// 원본 데이터 변경 후
		System.out.println("원본 값 " + Arrays.toString(origin));

		// 배열의 해시코드를 출력
		// 자바에서 해시코드란? 주소값을 해시함수라는걸 이용하여 변경된 모습
		// 해시함수란? 특정 문자열을 정해진 길이의 형태로 변형
		System.out.println("origin의 hashCode() : " + origin.hashCode());
		System.out.println("copyArr의 hashCode() : " + copyArr.hashCode());
	}

	public void example2() {
		// for문을 이용한 깊은 복사 + 원본 데이터 유지 확인
		int origin[] = { 1, 2, 3, 4, 5 };

		// 깊은 복사를 하려면 같은 자료형, 같은 크기 이상의 배열을 선언 및 할당
		int copyArr[] = new int[origin.length];

		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = origin[i];
		}

		// 복사 데이터 변경 전
		System.out.println("복사본 값" + Arrays.toString(copyArr));

		// 원본 데이터
		System.out.println("원본 값 " + Arrays.toString(origin));

		copyArr[2] = 1000;

		// 복사 데이터 변경 후
		System.out.println("복사본 값" + Arrays.toString(copyArr));

		// 원본 데이터
		System.out.println("원본 값 " + Arrays.toString(origin));

		System.out.println("origin의 hashCode() : " + origin.hashCode());
		System.out.println("copyArr의 hashCode() : " + copyArr.hashCode());
	}

	public void example3() {
		// 깊은 복사 + 원본 데이터 유지 확인
		int origin[] = { 1, 2, 3, 4, 5 };

		// 깊은 복사를 하려면 같은 자료형, 같은 크기 이상의 배열을 선언 및 할당
		int copyArr[] = new int[origin.length];

		// System.arraycopy(원본배열명, 복사 시작 인덱스 값 지정, 복사본 배열명,
		// 복사본에서 복사될 인덱스 시작 값 지정, 복사 길이);
		System.arraycopy(origin, 0, copyArr, 0, origin.length);

		// 복사 데이터 변경 전
		System.out.println("복사본 값" + Arrays.toString(copyArr));

		// 원본 데이터
		System.out.println("원본 값 " + Arrays.toString(origin));

		copyArr[2] = 1000;

		// 복사 데이터 변경 후
		System.out.println("복사본 값" + Arrays.toString(copyArr));

		// 원본 데이터
		System.out.println("원본 값 " + Arrays.toString(origin));

		System.out.println("origin의 hashCode() : " + origin.hashCode());
		System.out.println("copyArr의 hashCode() : " + copyArr.hashCode());
	}

	public void example4() {
		// 처음에 배열 크기를 입력하고
		// 해당 크기만큼의 입력을 진행하여
		// 각 인덱스에 값을 초기화함.

		// 입력 완료 시 추가적으로 더 입력할 내용이 있는지 물어보고
		// 있을 경우, 추가로 필요한 배열 크기를 입력 받아
		// 다시 늘어 난 배열크기만큼 입력을 받음.

		// 추가적으로 입력할 내용이 없다면
		// 배열에 저장된 모든 내용을 출력

		Scanner in = new Scanner(System.in);

		System.out.print("배열 크기 입력 : ");
		int size = in.nextInt();
		in.nextLine();

		int arr[] = new int[size];

		int i = 0; // 초기식

		while (true) {
			System.out.print(i + "번째 인덱스 입력 : ");
			arr[i] = in.nextInt();
			in.nextLine();

			i++;

			// 증기한 i값이 현재 배열 길이와 같다면
			if (i == arr.length) {
				System.out.print("추가로 입력 하시겠습니까?(아무거나/n) : ");
				char ch = in.nextLine().charAt(0);

				if (ch == 'n') {
					System.out.println("종료합니다");
					break;
				} else {
					System.out.print("추가할 배열 길이 : ");
					size += in.nextInt();
					in.nextLine();

					// 깊은 복사용 배열 선언 및 할당.
					int copyArr[] = new int[size];

					// 깊은 복사 진행
					System.arraycopy(arr, 0, copyArr, 0, arr.length);

					// arr변수가 깊은 복사된 배열 주소를 참조(얕은 복사)
					arr = copyArr;
				}
			}
		}

		// arr에 저장된 내용 모두 출력
		for (int j = 0; j < arr.length; j++) {
			System.out.println("arr[" + j + "] = " + arr[j]);
		}

	}
	

}
