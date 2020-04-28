package com.kh.poly.chap02.ex2.model.vo;

public class LgAP extends AllinOnePrinter implements Fax {

	public LgAP() {

	}

	public LgAP(String brand, String pName) {
		super(brand,pName);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("LG 프린트");

	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LG 음석인식 켜짐");

	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LG 음석인식 꺼짐");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("LG 빠르게 스캔");

	}

	@Override
	public void fax() {
		// TODO Auto-generated method stub
		System.out.println("LG 팩스를 주고 받을 수 있음");

	}

}
