package com.kh.collection.set.part2.model.service;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetService {
	public void example() {
		/* TreeSet : Set 특징 + 이진 트리 특징
		 * - 중복 저장이 안되고, 입력되는 데이터가 이진 트리로 저장되어
		 *   자동으로 오름차순 정렬되는 특징이 있음
		 * */
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add(new String("다다다"));
		set1.add(new String("라라라"));
		set1.add(new String("가가가"));
		set1.add(new String("나나나"));
		set1.add(new String("가나다"));
		set1.add(new String("하하하"));
		set1.add(new String("카카카"));
		set1.add(new String("카카카"));
		set1.add(new String("카카카"));
		set1.add(new String("카카카"));
		
		// 이진 트리 구조 저장을 위해서는
		// TreeSet에 저장되는 객체가 Comparable 인터페이스를 상속받아
		// compareTo() 메소드를 오버라이딩 해놔야함
		// --> 그런데 String은 다 되어있다
		
		for(String s : set1) {
			System.out.println(s);
		}
		
		// 정수만 저장하는 Set을 만들고 싶다.
		// 그런데 Set과 같은 Collection은 객체만 저장할 수 있다.
		// 정수는 기본자료형 이므로 그냥은 불가능함.
		// 정수형 int의 wrapper class인 Integer 포장하면 가능
		Set<Integer> set2 = new TreeSet<Integer>();
		
		set2.add(new Integer(10));
		set2.add(5);
		set2.add(30);
		set2.add(25);
		
		System.out.println("-----------------------");
		
		Iterator<Integer> it = set2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// TreeSet을 이용한 로또 생성기
		// 로또는 중복 없이 1 ~ 45 숫자 6개, 오름 차순 정렬
		System.out.println("---------------------");
		
		Set<Integer> lotto = new TreeSet<Integer>();

		// Set의 add() 메소드는 중복되지 않는 값 추가 성공 시 true를 반환 한다
		// 중복되는 값이  추가시 false를 반환하여 이를 이용하여 조건문을 작성할 수 있다.
		
		for (;;) {
			lotto.add((int)((Math.random()*45+1)));
			if (lotto.size() == 6) {
				break;
			}
		}
		
		System.out.println(lotto);
		
		Iterator<Integer> itt = lotto.iterator();
		
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		
	}
}
