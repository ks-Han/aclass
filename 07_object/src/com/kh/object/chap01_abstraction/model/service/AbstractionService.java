package com.kh.object.chap01_abstraction.model.service;

import com.kh.object.chap01_abstraction.model.vo.Student;

public class AbstractionService {

	public void createStudent() {

		Student std = new Student(); // 학생 객체 생성

		// 비어있는 학생 객체(std)에 속성(정보) 입력
		std.name = "한기성";
		std.age = 28;
		std.gender = '남';
		std.studentNumber = 12345;
		std.schoolName = "kh";
		std.grade = "A+";

		// 객체(std) 기능 수행
		std.attendance(); // 출석
		std.study(); // 공부
		std.test(); // 시험
		std.eat(); // 밥먹기
		
		System.out.printf("%s 학생은 %d세 %c자이며 학번은 %d 입니다.",std.name,std.age,std.gender,std.studentNumber);

	}
}
