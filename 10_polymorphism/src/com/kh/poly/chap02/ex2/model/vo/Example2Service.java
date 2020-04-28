package com.kh.poly.chap02.ex2.model.vo;

public class Example2Service {
	public void example1() {
		// 복합기 객체 배열 선언
		AllinOnePrinter[] ap = new AllinOnePrinter[2];

		ap[0] = new SamsungAP("삼성", "삼성1호");
		ap[1] = new LgAP("Lg", "Lg1호");

		for (int i = 0; i < ap.length; i++) {
			ap[i].powerOn();
		}

		// 복합기 + 스마트폰을 한번에 관리하기

		KoreaElectronics[] ke = new KoreaElectronics[3];

		ke[0] = new SmartPhone();
		ke[1] = new SamsungAP();
		ke[2] = new LgAP();
	}
}
