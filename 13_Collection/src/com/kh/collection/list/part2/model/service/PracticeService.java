package com.kh.collection.list.part2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.collection.list.part2.model.vo.Student;

public class PracticeService {

	private List<Student> list = new ArrayList<Student>();
	// Student 객체 (객체 참조 변수)를 저장할 수 있는
	// ArrayList를 할당 받아 그 주소를 List에 저장
	// + ArrayList 생성 시 기본생성자를 사용하면 10칸이 할당 됨.
	
	public boolean addStudent(Student std) {
		return list.add(std);

	}

	public List<Student> selectAllStudent() {
		return list;
	}

	public Student removeStudent(int index) {

		Student tmp_list = null;
		if (index >= 0 && index < list.size()) {
			// --> 삭제 전에 별도의 변수에 저장 + 뒤쪽 값 당겨주기
			tmp_list = list.remove(index);
		}

		return tmp_list;
	}

}
