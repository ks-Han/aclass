package com.kh.poly.chap01.ex.model.vo;

public class Labtop extends Electronics {
	private int charger;

	public Labtop() {
		super();
	}

	public Labtop(boolean power, String brand, String sNum, int charger) {
		super(power, brand, sNum);
		this.charger = charger;
	}

	public int getCharger() {
		return charger;
	}

	public void setCharger(int charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Labtop [" + super.toString() + ",charger=" + charger + "]";
	}

}
