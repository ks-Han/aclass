package com.kh.variable.practice1;

import java.util.Scanner;

public class VariablePractice3 {

	public VariablePractice3() {
		// TODO Auto-generated constructor stub
		Scanner in = new Scanner(System.in);
		
		double a,b;
		System.out.print("가로 값을 입력해주세요 : ");
		a = in.nextDouble();
		System.out.print("세로 값을 입력해주세요 : ");
		b = in.nextDouble();
		in.close();
		
		double aRsult, bRsult = 1;
		
		// 면적
		aRsult = a*b;
		// 둘레
		bRsult = (a+b)*(double)2;
		
		System.out.println();
		System.out.printf("면적 : %.2f\n",aRsult);
		System.out.printf("면적 : %.1f",bRsult);
	}
}
