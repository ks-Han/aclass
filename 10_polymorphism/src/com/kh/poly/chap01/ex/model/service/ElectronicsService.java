package com.kh.poly.chap01.ex.model.service;

import com.kh.poly.chap01.ex.model.vo.Electronics;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsService {
	// 부모 타입 객체 배열을 선언 및 할당하여
	// 자식 객체들을 한번에 관리

	private Electronics[] el = new Electronics[3];

	private int index = 0;

	// 외부에서 생성된 객체의 주소를 전달 받아 el 배열에 추가
	// 오버로딩을 사용해도 되지만 코드길이가 늘어나서 비효율적
	// --> 다형성을 적용하여 매개변수의 타입을 부모타입으로 하여
	// 자식 객체 주소를 전달 받도록 함.
	public void insert(Electronics e) { // 매개변수에 다형성 적용
		el[index++] = e;
		// index 번째 el요소에 전달받은 자식 객체 주소를 추가하고,
		// index를 1 증가 시킴
	}

	// 전체정보 조회
	public String selectAll() {
		String str = "\n@@@@@ 전체 상품 조회 @@@@@\n";

		for (int i = 0; i < el.length; i++) {
			str += el[i].toString() + "\n";
			// el[i].toString()
			// 부모의 toString()을 호출 하고 있지만 (정적 바인딩)
			// 실제 실행 시 자식의 오버라이딩된 toString 출력
			// 동적바인딩
		}

		return str;
	}
	
	// 각 기기 정보 조회
	public Electronics selectOne(int i) {
		return el[i-1];
	}
	
	public String selectSordOut(Electronics e) {
		if (e instanceof Tablet) {
			return "판매불가";
		} else {
			return "판매가능";
		}
	}

}
