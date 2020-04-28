package com.kh.variable.controller;

public class E_Printf {
	
	public void printMethod() {
		char c = 'c';
		String str = "String입니다";
		
		System.out.printf("a\n");
		System.out.printf("%c\n",c);
		System.out.printf("%s\n",str);
		
		// 원하는 출력 모양
		// 100 1000 10000
		//  50  500   500
		
		System.out.printf("%d %d %d\n",100,1000,10000);
		System.out.printf("%3d %4d %5d\n",50,500,500);
		
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		
		System.out.println(name+"은"+age+"세"+gender+"자입니다.");
		System.out.printf("%s은%d세%c자입니다.\n", name, age, gender);
		
	}
}
