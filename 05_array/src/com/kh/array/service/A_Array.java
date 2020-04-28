package com.kh.array.service;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import org.omg.CORBA.PUBLIC_MEMBER;

public class A_Array {

	// 배열
	// - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	// - 저장돤 값 마다 인덱스가 지정된다 (인덱스의 시작은 0)

	public void example1() {

		// 1. 배열 선언
		// 자료형[] 배열명 (== 변수명);
		// 자료형 배열명[];
		Integer[] arr; // int형 배열 참조 변수 선언
//		Integer arr[]; // 배열을 선언한 변수는 참조형 이다!! **

		// 2. 배열 할당 (할당 : 메모리상에 데이터 저장 공간을 확보하는 것)
		// 배열 명 = new 자료형[배열크기];
		// (== 배열 칸 수)

		// *** new 연산자
		// - "Heap 영역에 새로운 공간을 할당한다." 라는 의미
		arr = new Integer[4];

		// 3. 배열 초기화
		// 배열명[인덱스] = 값;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
//		arr[4] = 50; // 에러 발생, 할당된 배열의 크기를 벗어남.

		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);

//		int배열 선언 및 4칸 할당
		Integer arr2[] = new Integer[4];

		// 배열명.length : 배열의 길이를 반환
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (i + 1) * 5;
		}

		// for문으로 배열 값 모두 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

	}

	public void example2() {
		// double형 배열 dArr 선언 및 5칸을 할당하고
		// 각 index에 1.0 부터 1씩 증가하는 값을 대입하고 출력

		Double dArr[]; // Stack 영역 1단계 (변수 선언시 할당 메모리)
		dArr = new Double[5]; // Heap 영역 2단계 및 3단계 (자료형 기본값으로 초기화)

		for (int i = 0; i < dArr.length; i++) {
			dArr[i] = (double) i + 1.0;
		}

		for (int i = 0; i < dArr.length; i++) {
			System.out.println("dArr[" + i + "] : " + dArr[i]);
		}
	}

	public void example3() {
		// int형 배열 iArr 선언 후;
		// 배열의 칸수를 사용자로 부터 입력받아 배열 할당
		// 각 인덱스에 저장될 값을 각각 입력 받아 출력하기

		Scanner in = new Scanner(System.in);
		Integer iArr[];

		System.out.print("배열 크기 : ");
		int size = in.nextInt();

		// 입력된 크기 만큼의 배열 할당
		iArr = new Integer[size];

		for (int i = 0; i < iArr.length; i++) {
			System.out.print("iArr[" + i + "]배열에 들어갈 값 : ");
			iArr[i] = in.nextInt();
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "]에 저장된 값 : " + iArr[i]);
		}
	}

	public void example4() {
		// 배열 선언, 할당, 초기화 한번에 하기

		// int형 arr 선언 및 5칸 할당 후
		// 1,2,3,4,5 를 각각의 인덱스에 저장하기.
		Integer arr[] = { 1, 2, 3, 4, 5 }; // 배열 할당 및 초기화를 한번에 하는거
		String sArr[] = { "asd", "bcv" };

		// 배열 할당 확인
		System.out.println("arr 배열의 길이 : " + arr.length);
		System.out.println("sArr 배열의 길이 : " + sArr.length);

		// 배열 초기화 확인
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i] + " ");
		}
	}

	public void example6() {
		Scanner in = new Scanner(System.in);
		System.out.print("크기 입력 : ");

		int size = in.nextInt();

		Integer arr[] = new Integer[size];

		// 배열 할당 시 int형 기본값으로 초기화 되어있는지 확인
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].TYPE);
		}
		// 지정된 크기를 넘어선 위치(인덱스)에 접근 시 어떻게 되는지 확인
//		arr[size] = 3;
//		ArrayIndexOutOfBoundsException
		// 배열의 인덱스 범위를 넘어서서 에러 발생
		
		// 기존 배열보다 2배 큰 배열을 새롭게 할당하여
		// arr변수가 참조할 수 있게 코드를 작성
		arr = new Integer[size*2];
		System.out.println("늘어난 배열 길이 : " + arr.length);
		System.out.println("arr[size] : " + arr[size]);
		
	}
	
	public void example7() {
		// 입력받은 문자열을 char형 배열에 한 글자씩 저장하기
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = in.nextLine();
		
		// 배열의 길이 : 배열명.length
		// 문자열의 길이 : 변수명.length()
		char cArr[] = new char[str.length()];
		
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt(i);
		}
		
		for (int i = 0; i < cArr.length; i++) {
			System.out.print("cArr["+i+"] = "+cArr[i] + " ");
		}
		
		System.out.println();
		System.out.println("찾으려는 문자 : ");
		char ch = in.nextLine().charAt(0);
		
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == ch) {
				System.out.println("찾으시는 자료의 값 인덱스 : " + i);
			}
		}
	}
	
	public void example8() {
		// String 배열의 메모리 구조
		
		// String 배열 선언, 할당, 초기화
		
		String sArr[] = {"백반","짜장면","서브웨이","도시락"};
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
	
	public void example9() {
		// 메뉴가 입력되어 있는 String 배열 선언 및 초기화 후
		// 난수를 발생시켜 메뉴를 하나 선정 해보자
		
		String menu[] = {"백반","롯데리아","버블티","칼국수","돈가스"};
		
		// 난수 ? 임의의 수
		// 난수를 발생 시키는 방법
		// Math.random()
		// Math 클래스 : 자바에서 제공하는 수학관련 기능이 담겨 있는 클래스
		
		// Math.random()이 발생시키는 난수의 범위
		// 0 <= x < 1 (double형)
		
		double ran = Math.random();
		// 0 <= x < 1의 범위를
		// 0 <= ㅌ < 5로 범위를 변경할 수 있게 수식 추가
		// + int형으로 형변환(index로 사용하기 위해)
		
		int r = (int)(ran * menu.length);
		
		System.out.println(menu[r]);
	}
}
