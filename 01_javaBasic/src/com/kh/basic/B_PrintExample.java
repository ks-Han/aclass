package com.kh.basic;

public class B_PrintExample {

	String tmpPrintOut = "문자열출력";

	public void printValue() {
		System.out.println(tmpPrintOut);
		System.out.print("오늘도 화이팅");
		System.out.println();
		System.out.println("쉬시임");
		System.out.println();
		System.out.println();

		// 숫자 출력
		// 숫자의 경우 문자열과 같이 ""로 묶지않는다
		System.out.println("숫자 출력");
		System.out.println(123);

		// 숫자 + 숫자, 숫자 + 문자열, 문자열 + 문자열이 가능하다
		System.out.println(1 + 2);
		System.out.println("문자열 " + "합치기");
		System.out.println(5 + 10 + "Hello"); // >>>15Hello
		System.out.println("Hello" + 5 + 10); // >>>Hello510
										      // -- 순서에 따른 차이 (문자열이 먼저나와서 뒤에있는 정수까지 문자열로 변환됨)
											  // -- 정수가 먼저나오면 정수를 더하고 뒤에 문자열이 있을 때 문자열로 변환됨
	}
}
