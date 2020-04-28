package com.kh.poly.chap01.practice.model.view;

import java.util.Scanner;

import com.kh.poly.chap01.practice.model.service.LibraryService;
import com.kh.poly.chap01.practice.model.vo.Book;
import com.kh.poly.chap01.practice.model.vo.Member;

public class LibraryMenu {
	private LibraryService service = new LibraryService();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력하세요 : ");
		char gender = sc.nextLine().charAt(0);

		Member m = new Member(name, age, gender);
		service.insertMember(m);

		int input = 0;
		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");

			input = sc.nextInt();
			sc.nextLine();

			switch (input) {
			case 1:
				System.out.println(service.myInfo());
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("값을 잘못 입력하였습니다 다시 입력해주세요");
				break;
			}
		} while (input != 9);
	}

	public void selectAll() {
		Book[] bList = service.selectAll();
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i]);
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = service.searchBook(keyword);

		for (int i = 0; i < searchList.length; i++) {
			if (searchList[i] != null)
				System.out.println(i + "번도서 : " + searchList[i]);
		}

	}

	public void rentBook() {
		this.selectAll();
		int index = 0;
		int result = 0;
		System.out.print("대여할 도서 번호 선택 : ");
		index = sc.nextInt();
		sc.nextLine();
		result = service.rentBook(index);

		switch (result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다.\n요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
			break;
		default:
			break;
		}
	}

}
