package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingParactice1 {

	public CastingParactice1() {
		Scanner in = new Scanner(System.in);
		
		char a;
		
		System.out.print("문자 : ");
		a = in.nextLine().charAt(0);
		in.close();
		
		
		System.out.printf("%c unicode : %d",a,(int)a);
	}
}
