package com.kh.practice.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.practice.model.service.PracticeService;
import com.kh.practice.model.vo.Student;

public class Menu {
	private PracticeService service = new PracticeService();
	
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int sel = 0;
		do{
			System.out.println("-----학생 관리 프로그램-----");
			System.out.println("1. 맨 뒤에 추가");
			System.out.println("2. 전체 조회");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 ==> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine();
			
				switch (sel) {
				case 1: 
					System.out.println(add()); break;
				case 2: 
					selectAll(); break;
				case 3:
					System.out.println(delete()); break;
					
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				
			}catch (InputMismatchException e) {
				System.out.println("정수만 입력해주세요.");
				sel = -1; // while 조건을 만족하지 못하게 하기 위해 -1 대입
				sc.nextLine(); // 버퍼에 남아있는 잘못 입력한 문자열 + 개행문자를 제거
			}
			
			System.out.println();
		}while(sel != 0);
	}
	
	
	public String add() throws InputMismatchException{
		System.out.println("[학생 추가]");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		System.out.println("addStudent() 호출");
		
		String str = null;
		if(service.addStudent(new Student(name,score))) {
			str = "학생 추가 성공";
		}else {
			str = "학생 추가 실패";
		}
		return str;
	}
	
	
	public void selectAll() {
		System.out.println("[학생 정보 조회]");
		System.out.println("selectAllStudent() 호출");
		
		Student[] list  = service.selectAllStudent();
		
		for(int i=0; i<list.length; i++) {
			
			if(list[i] != null) {// 배열에 null이 있을 경우에 대한 조건 처리를 해줘야된다.
				System.out.println(i + "번 : " + list[i]);
			}
		}
		
	}
	
	
	public String delete()  throws InputMismatchException{
		System.out.print("학생 번호 입력 : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("removeStudent() 호출");
		Student std = service.removeStudent(index);
		
		if(std != null) {
			return std.getName() + " 삭제됨.";
		}else {
			return "잘못된 번호를 입력하였습니다.";
		}
	}
	
	
}
