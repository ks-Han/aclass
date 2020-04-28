package com.kh.poly.chap02.ex2.model.vo;

public class SmartPhone implements KoreaElectronics {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("전원 버튼 3초간 누름");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 버튼 5초간 누름");
	}

}
