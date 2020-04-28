package com.kh.inherit.practice.model.service;

import com.kh.inherit.practice.model.vo.Rectangle;

public class RectangleService {

	private Rectangle r = new Rectangle();
	
	public String calcAreaint(int x, int y, int height, int width) {
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		int result = r.getHeight() * r.getWidth();  
		return "사각형 넓이 : " + r + " / " + result ;
	}
	
	public String calcPerimeter(int x, int y, int width, int height) {
		r.setHeight(height);
		r.setWidth(width);
		r.setX(x);
		r.setY(y);
		int result = 2 * (r.getHeight() + r.getWidth());
		return "사각형 둘레 : " + r + " / "+result;		
	}
}
