package com.kh.variable.controller;

import java.util.Scanner;

public class F_Scanner {

	// 키보드로 이름을 입력받아
	// "000"님 확연합니다."라는 문자열 형태로 출력하기
	public void inputScannerName() {
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("당신의 나이를 입력해주세요 : ");
//		int age = sc.nextInt();
		int age = sc.nextInt();
		
		sc.nextLine(); // 위에 nextInt를 써서 \n가 남아있기때문에 한 번 가져와서 없애줌
		
		System.out.print("당신의 성별을 (남/여) 입력해주세요 : ");
		char gender = sc.nextLine().charAt(0); //한글자만 읽어옴
		
		System.out.print("당신의 키를 입력해주세요 : ");
		double height = sc.nextDouble();
		
		System.out.printf("%s님은 %d세, %c자 %.1fcm 입니다.\n",name,age,gender,height);
		sc.close();
	}
}
