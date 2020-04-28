package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	String name;
	char gender;
	int age;
	double height;
	
	public VariablePractice1() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = in.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = in.nextLine().charAt(0);
		System.out.print("나이를 입력하세요 : ");
		age = in.nextInt();
		in.nextLine();
		System.out.print("키를 입력하세요(cm) : ");
		height = in.nextDouble();
		in.close();
		
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^",height, age, gender, name);
	}
}
