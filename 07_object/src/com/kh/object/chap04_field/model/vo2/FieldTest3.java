package com.kh.object.chap04_field.model.vo2;

import com.kh.object.chap04_field.model.vo.FieldTest1;

public class FieldTest3 {

	/**
	 * 패키지가 다를 때 필드 사용 확인 테스트
	 */
	public void print() {
		FieldTest1 f1 = new FieldTest1();
		
		System.out.println(f1.num1);
		// 같은 패키지가 아니므로
		// (default) 접근 제한자였던 num3 직접 접근 불가
		
		// 상속 관계가 아니므로
		// protected 접근 제한자였던 num2 직접 접근이 불가 
	}
}
