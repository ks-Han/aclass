package com.kh.object.chap06_constructor.run;

import com.kh.object.chap06_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User(); // User 객체를 기본생성자를 이용하여 생성

		u1.setAge(25);
		u1.setGender('남');
		u1.setUserId("ksks");
		u1.setUserName("rltjd");
		u1.setUserPwd("123123");

		User u2 = new User("ks", "111", "기성", 28, '남'); // User 객체를 기본생성자를 이용하여 생성
		User u3 = new User("adks", "1223", "??", 18, '남'); // User 객체를 기본생성자를 이용하여 생성

		System.out.println("u1 : " + u1);
		System.out.println("u2 : " + u2);
		System.out.println("u3 : " + u3);
		
		// 오버로딩 확인
		User u4 = new User("u4", "1q2w3e4r");
		System.out.println("u4 : " + u4);
		
		User u5 = new User("u5", 5, '남');
		System.out.println("u5 : " + u5);
	}

}
