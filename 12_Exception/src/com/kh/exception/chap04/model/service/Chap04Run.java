package com.kh.exception.chap04.model.service;

public class Chap04Run {
	public static void main(String[] args) {
		UserService service = new UserService();
		service.method1();
		
		// UserService 객체에 있는 method1() 호출
		// ㅇㅇ 맞음
	}
}
