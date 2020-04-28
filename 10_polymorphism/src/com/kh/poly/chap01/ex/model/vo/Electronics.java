package com.kh.poly.chap01.ex.model.vo;

public class Electronics {

	private boolean power; // 전원
	private String brand; // 제조사
	private String sNum; // 시리얼 넘버 (제품번호)

	public Electronics() {
	}

	public Electronics(boolean power, String brand, String sNum) {
		this.power = power;
		this.brand = brand;
		this.sNum = sNum;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getsNum() {
		return sNum;
	}

	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	@Override
	public String toString() {
		return "power=" + power + ", brand=" + brand + ", sNum=" + sNum;
	}

}
