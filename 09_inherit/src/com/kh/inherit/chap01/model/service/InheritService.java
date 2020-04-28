package com.kh.inherit.chap01.model.service;

import com.kh.inherit.chap01.model.vo.Car;
import com.kh.inherit.chap01.model.vo.Computer;
import com.kh.inherit.chap01.model.vo.Cup;

public class InheritService {

	public void example1() {
		Computer com = new Computer();
		Computer com2 = new Computer("i8", 64, "LG", 13131313);
		Cup cup = new Cup("aa", 0.2, "컵", 10000);
		
		// Computer만의 메소드
		com.setCpu("i7 - 9700k");
		com.setRam(32);
		
		// Product로 부터 상속 받은 메소드
		com.setpName("삼성 오딧세이");
		com.setPrice(2000000);
		
		System.out.println(com.getCpu());
		System.out.println(com.getRam());
		System.out.println(com.getpName());
		System.out.println(com.getPrice());
		
		System.out.println(com.selectField());
		System.out.println(com2.selectField());
		System.out.println(cup.selectField());
		
		// Car 상속 테스트
		System.out.println("==========================");
		
		Car car = new Car("V6","핫핑크","트럭","포터 벚꽃에디션",30000000);
		
		System.out.println(car.getEngine());
		System.out.println(car.getColor());
		System.out.println(car.getCarType());
		System.out.println(car.getpName());
		System.out.println(car.getPrice());
		
		System.out.println(car.selectField());
	}
}
