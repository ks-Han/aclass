package com.kh.object.chap05_initblock.run;

import com.kh.object.chap05_initblock.model.vo.Product;

public class InitBlockRun {

	/**
	 * @param 인스턴스 초기화 블록 확인용
	 *  - 생성자로 초기화 하기에 초기화블록은 거의 사용 안함
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		
		System.out.println(p1.selectProduct());

		Product p2 = new Product();
		
		System.out.println(p2.selectProduct());
	}

}
