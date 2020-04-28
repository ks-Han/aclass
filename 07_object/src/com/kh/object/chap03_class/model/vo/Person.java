package com.kh.object.chap03_class.model.vo;


/**
 * @author ks
 * 20.04.21
 */
public class Person {

	// ------ 필드(멤버변수) ------
	private String name;
	private int age;
	private char gender;
	private String address;
	private double height;
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// ------ 메소드(멤버 메소드) ------
	/**
	 * 걷는 메소드 정의
	 * 사용 가능 class 멤버 필드
	 * = name, age, gender, address, height
	 * 사용 class 멤버 필드
	 * - name
	 */
	public void walk() {
		System.out.println(name + "이 직립보행을 함.");
	}
	
	/**
	 * 객체가 가지고 있는 모든 필드의 정보를 반화하는 메소드
	 * 사용 가능 class 멤버 필드
	 * = name, age, gender, address, height
	 * 사용 class 멤버 필드
	 * - name, age, gender, address, height
	 */
	public String selectInfomation() {
		String str = name + " / " + age + " / " + gender + " / " + address + " / " + height;
		return str;
	}
}
