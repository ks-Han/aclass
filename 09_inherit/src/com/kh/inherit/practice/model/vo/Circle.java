package com.kh.inherit.practice.model.vo;

public class Circle extends Point {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + radius;
	}
	
	
}
