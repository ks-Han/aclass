package com.kh.object.chap04_field.model.vo;

public class FieldTest2 {
	/**
	 * 같은 패키지내에 private 접근자 사용이 안됨을 확인하는 테스트용도
	 */
	public void print() {
		FieldTest1 f1 = new FieldTest1();
		// 같은 패키지, 같은 크래스 내부여서
		System.out.println(f1.num1);
		// 접근 제한자 관계 없이 모두 접근 가능
		System.out.println(f1.num2);
		System.out.println(f1.num3);
//		System.out.println(f1.num4); // private로 사용 불가능
	}
}
