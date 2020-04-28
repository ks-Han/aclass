package com.kh.object.chap02_encapsulation.model.service;

import com.kh.object.chap02_encapsulation.model.vo.Player;

public class EncapsulationService {

	public void createPlayer() {
		
		Player p1 = new Player();
		
//		p1.name = "홍길동";
		// p1.event = "LOL"; //에러 발생
		// event는 private으로 선언되어 외부 접근이 차단되어 있음.
		p1.setName("홍길동");
		p1.setEvent("복싱");
		p1.setUniform("빨간색");
		p1.setKookdae(true);
		
		System.out.println("p1의 이름 : "+p1.getName());
		System.out.println("p1의 종목 : "+p1.getEvent());
		System.out.println("p1의 유니폼 색 : "+p1.getUniform());
		System.out.println("p1의 국대임 ? "+p1.getKookdae());
		
	}
	
}
