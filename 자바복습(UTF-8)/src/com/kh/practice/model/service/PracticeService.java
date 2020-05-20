package com.kh.practice.model.service;

import com.kh.practice.model.vo.Student;

public class PracticeService {
	
	private Student[] list = new Student[3]; 
	// Student 객체 참조 변수 3개를 저장 할 수 있는 객체배열 선언
	private int size = 0; // 객체배열의 인덱스 및 현재 저장된 요소 수 관리용 변수
	
	public boolean addStudent(Student std) {
		// 매개변수로 전달받은 Student 객체 std를 객체 배열에 추가하는 메소드
		
		// 학생 추가에 성공한 경우 true, 예외 발생 시 false 반환
		
		try {
			// 학생을 추가할 때 배열의 최대크기를 넘어서면
			// 기존 배열의 크기 보다 2배 큰 배열을 새로 만들어서 깊은 복사 후
			// list 참조변수에 새로운 배열의 주소를 저장하여 학생 추가 진행.
			if(size%3 == 0 && size != 0) {
				Student[] tmp_list = new Student[size*2];
				System.arraycopy(list, 0, tmp_list, 0, list.length);
				list = tmp_list;
			}
			
			list[size++] = std;
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public Student[] selectAllStudent() { // 객체 배열에 저장된 모든 데이터 반환
		return list;
	}
	
	
	public Student removeStudent(int index) { 
		// 매개변수로 전달받은 인덱스의 Student객체를 삭제하고
		// 삭제된 학생 정보를 반환.
		// 배열 중간에 위치한 학생이 삭제 된 경우 
		// 배열 사이에 공백이 없도록뒤쪽에 존재하는 학생들을 당겨주기 
		// ex) 배열에  a, b, c, d가 저장되어 있다.
		//      b 학생 삭제 시
		// 	    a, null, c, d 가 아닌
		//		a, b, c, null 형태로 배열이 형성되어야 함.
		
		Student tmp_list = list[index];

		System.arraycopy(list, index+1, list, index, list.length-(index+1));
		
		if(size%3 == 0 && size != 0) list[list.length-1] = null;
		size--;
		
		return tmp_list;
	}

}
