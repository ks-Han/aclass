package com.kh.object.chap01_abstraction.model.vo;

public class Student { // 학생을 추상화한 클래스
	// ----- 속성 ------
	// 이름, 나이, 성별, 학번, 학교, 성정
	public String name; // 이름
	public int age; // 나이
	public char gender; // 성별
	public int studentNumber; // 학번
	public String schoolName; // 학교
	public String grade; // 성적

	// ----- 기능 ------
	// 공부, 출석, 시험, 급식
	public void study() {
		System.out.println(name + "학생이 공부를 시작했습니다.");
	}
	
	public void attendance() {
		System.out.println(name + "학생이 " + schoolName + " 학교에 출석 했습니다.");
	}
	
	public void test() {
		System.out.println(name + "학생이 시험을 보고 " + grade + "를 받았습니다.");
	}
	
	public void eat() {
		System.out.println(name + "학생이 급식을 먹었습니다.");
	}
}
