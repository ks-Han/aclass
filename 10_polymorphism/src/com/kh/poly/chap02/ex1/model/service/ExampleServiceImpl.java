package com.kh.poly.chap02.ex1.model.service;

public class ExampleServiceImpl implements ExampleService {

	@Override
	public String javaFeatures() {
		return "자바의 특징 : 캡슐화, GC, 독립성, 사용하기 쉬운 언어, 멀티 쓰레드, 동적 로딩 지원, 객체 지향 언어";
	}

	@Override
	public String defineInheritance() {
		// TODO Auto-generated method stub
		return "공통 부분을 묶어 클래스를 만든 다음 상속을 받아 재사용과 유지보수의 능률을 향상 시킴";
	}

	@Override
	public String definePolymorphism() {
		// TODO Auto-generated method stub
		return "상속 관계에 있는 클래스 사이에서 상위 클래스를 선언 하여 하위 클래스를 생성 후 관리 (코드 사용 효율성 증가)";
	}

	@Override
	public String defineAbstractClass() {
		// TODO Auto-generated method stub
		return "상속 클래스와 비슷하지만 중간에 꼭 정의를 해야하는 추상함수를 만들어 상속 받는 클래스에 함수를 오버라이딩 할 수 있게 해줌";
	}

	@Override
	public String defineInterface() {
		// TODO Auto-generated method stub
		return "어떠한 사람이라도 생성하거나 수정 할때 규격에 맞게 생성/수정 할 수 있도록 구현 하여 사용 할 때 상속 받아 정의할 수 있도록 함";
	}

	@Override
	public String gugudan(int start, int end) {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = start; i <= end; i++) {
			str += i + "단\n"; 
			for (int j = 1; j <= 9; j++) {
				str += i + " x "+ j + " = "+(i * j) + " "; 
			}
			str += "\n";
		}
		return str;
	}

	@Override
	public String reverseStar(int input) {
		// TODO Auto-generated method stub
		String str = "";
		for (int i = 0; i < input; i++) { 
			
			for (int j = 0; j < input-1-i; j++) {
				str += " "; 
			}
			
			for (int j = input; j >= input-i; j--) {
				str += "*"; 
			}
			str += "\n";
		}
		return str;
	}

}
