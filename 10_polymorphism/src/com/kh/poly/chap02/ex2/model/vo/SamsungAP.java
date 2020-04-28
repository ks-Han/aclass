package com.kh.poly.chap02.ex2.model.vo;

public class SamsungAP extends AllinOnePrinter {

	public SamsungAP() {
		super();
	}
	
	public SamsungAP(String brand, String pName) {
		super(brand,pName);
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("프린트 삼성로고 나오는 중");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("스캔 삼성로고 나오는 중");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("파워 온 삼성로고 나오는 중");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("파워 오프 삼성로고 나오는 중");
	}

}
