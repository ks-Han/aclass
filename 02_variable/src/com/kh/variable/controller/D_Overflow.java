package com.kh.variable.controller;

public class D_Overflow {

	// overflow란?
	// 데이터가 저장돼있는 변수에
	// 해당 변수 자료형의 값의 범위를 넘어서는 값이 대입되면
	// 나타나는 현상으로
	// 부호 비트 침범으로 원하지 않는 데이터의 모양이 나타남.
	
	public void overflowEx() {
		byte bNum = 127; // byte의 양의 최대값
		
		System.out.println(bNum + 1);
		
		bNum = (byte)(bNum + 1); // >>> 128
		System.out.println(bNum); // >>> -128
	}
	
}
