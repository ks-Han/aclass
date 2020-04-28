package com.kh.variable.controller;

public class C_Casting {

	/*
	 * 컴퓨터의 값 처리 규칙 1. 같은 자료형 끼리만 대입이 가능하다 2. 같은 자료형 끼리만 계산이 가능하다. 3. 계산의 결과는 계산에
	 * 사용된 자료형과 같다
	 * 
	 * --> 형 변환이 다른 경우 자동캐스팅 또는 강제캐스팅 형변환의 종류 1. 자동 형변환 2. 강제(명시적) 형변환
	 * 
	 */

	// 자동 형변환
	// 값의 범위가 작은 자료형과 큰 자료형을 연산 시
	// 컴파일러가 자동으로 자동 자료형을 큰 자료형으로 변환 시키는 것.
	public void autoCasting() {
		Integer i = new Integer(12); // 4byte
		Double d = new Double(3.3); // 8byte
		Double result = new Double(i + d); // int형과 double형 연산시 double형으로 저장가능

		System.out.println(i + " + " + d + " = " + (i + d));
		System.out.println(i + " + " + d + " = " + result);
//		System.out.println(i.getClass().getName());
//		System.out.println(d.getClass().getName());
//		System.out.println(result.getClass().getName());

		// int(4byte) -> long(8byte)
		int i2 = 2147483647;
//		int i3 = i2 + 1; // 최대 표현갯수를 초과하여 다른 같은 자료형 값에 넣을 시 값이 마이너스로 변경됨 
//		System.out.println(i3);  // -2147483648 값 출력
		long l2 = i2 + 1L; // 1L이 아닌 1만 써도 자동으로 롱 자료형에 맞춰서 계산됨
		System.out.println(l2);

		// float(4byte) -> double(8byte)
		float f3 = 2.13F;
		double d3 = 3.14;
		double result3 = f3 + d3;

		System.out.printf("%.2f + %.2f = %.2f\n", f3, d3, result3);

		// 10진수 유한소수를 2진수로 변환하며 무한소수가 되는 경우가 많다.
		// 그런데, 컴퓨터는 실수를 부동소수점으로 표현하기 때문에
		// 2진수 무한 소수를 정확히 표현하는데 한계가 있다.
		// 그래서 오차가 발생한다.

		// char(2byte) -> int(4byte)
		int i4 = 'A'; // int형 변수에 char형 리터럴 값 대입
		/*
		 * char -> int 자동형변환이 가능한 이유 char라는 자료형 변수는 문자 자체를 저장하는 변수가 아닌 2byte범위 내의 숫자를
		 * 저장하고, 유니코드라는 문자표에서 해당 번호와 일치하는 문자를 찾아 출력하는 자료형이다
		 */

		// char 자료형 변수에 정수값 저장하기
		char ch5 = 65; // 유니코드에서 문자표를 찾기때문에 정수를 저장하는 것도 가능
						// 하지만 숫가자가아닌 문자표에서 해당하는 값의 문자를 출력

		System.out.println("i4의 값 : " + i4); // 65
		System.out.println("ch5의 값 : " + ch5); // A

		// byte, short, int
		byte bNum1 = 1;
		byte bNum2 = 10;
//		byte bResult = bNum1 + bNum2; // 리터럴 값이 int형 이기때문에 오류가 뜸

		// byte, short, char, int
		// 이 네 가지 자료형은 int 리터럴로 값을 초기화할 수 있다.
		// 이는 int 자료형을 제외하고 최초 한 번만 가능
		// 초기화 된 이후 byte, short, char 자료형 변수의
		// 값을 이용하여 계산(연산) 진행 시
		// 무조건 int형으로 연산처리가 진행된다.
		
		byte bResult = (byte)(bNum1 + bNum2); // 강제 캐스팅 (int형 타입을 byte로)
		// 강제캐스팅 시에 데이터 손실이 일어날 수 있다.

	}
	
	// 강제 형변환
	public void forcedCasting() {
		// 값의 범위가 작은 자료형 -> 큰 자료형으로 강제 변환 시키는 것
		
		int iNum1 = 10;
		long lNum1 = 10L;
		
		int result = (int)(iNum1 + lNum1);
		
	}
}
