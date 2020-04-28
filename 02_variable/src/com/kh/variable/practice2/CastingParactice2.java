package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingParactice2 {

	public CastingParactice2() {
		// TODO Auto-generated constructor stub
		double kor, eng, math;

		Scanner in = new Scanner(System.in);
		
		System.out.print("국어 : ");
		kor = in.nextDouble();
		System.out.print("영어 : ");
		eng = in.nextDouble();
		System.out.print("수학 : ");
		math = in.nextDouble();
		in.close();
		
		System.out.println();
		System.out.println("총점 : " + (kor+eng+math));
		System.out.println("평균 : " + ((kor+eng+math)/3));
	}
}
