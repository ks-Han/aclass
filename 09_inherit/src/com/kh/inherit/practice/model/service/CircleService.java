package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Circle;

public class CircleService {

	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setRadius(radius);
		c.setX(x);
		c.setY(y);
		double result = Math.PI * c.getRadius() * c.getRadius();
		return "원 넓이 : " + c + " / " + result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setRadius(radius);
		c.setX(x);
		c.setY(y);
		double result = Math.PI * c.getRadius() * 2;
		return "원 둘레 : " + c + " / " + result;
	}
	
	
}
