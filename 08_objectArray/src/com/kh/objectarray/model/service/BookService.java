package com.kh.objectarray.model.service;

import java.util.Scanner;

import com.kh.objectarray.model.vo.Book;

public class BookService {

	/* Book 객체 5개를 매개변수 있는 생성자를 이용하여 생성 후
	 * 책 제목을 입력받아
	 * 해당 책이 있는지 검색하여
	 * 있으면 Book 객체의 필드정보 출력
	 * 없으면 "해당하는 책이 없습니다"
	 */

	// 필드에 Scanner 객체를 선언하여 클래스 내부에서 모두 사용 가능하게함.
	private Scanner sc = new Scanner(System.in);

	public void searchBookV1() {
		// 책 5권 객체 생성
		Book book1 = new Book("자바의정석", 30000, 0.2, "남궁 성");
		Book book2 = new Book("C언어의정석", 50000, 0.1, "김철수");
		Book book3 = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
		Book book4 = new Book("어린왕자", 10000, 0.1, "생택쥐베리");
		Book book5 = new Book("해리포터", 12000, 0.3, "조앤k롤링");

		// 검색할 책 제목 입력받기
		System.out.print("검색할 책 제목을 입력하세요 : ");
		String title = sc.nextLine();

		String str = "";
		if (book1.getTitle().equals(title)) {
			// book1의 제목과 입력받은 제목이 같을 경우
			str = book1.selectBook();
		} else if (book2.getTitle().equals(title)) {
			str = book2.selectBook();
		} else if (book3.getTitle().equals(title)) {
			str = book3.selectBook();
		} else if (book4.getTitle().equals(title)) {
			str = book4.selectBook();
		} else if (book5.getTitle().equals(title)) {
			str = book5.selectBook();
		} else {
			str = "해당하는 책이 없습니다";
		}

		System.out.println(str);

	}

	public void searchBookV2() {

		// 방법 1
//		Book books[] = new Book[5];
//		books[0] = new Book("자바의정석", 30000, 0.2, "남궁 성");
//		books[1] = new Book("C언어의정석", 50000, 0.1, "김철수");
//		books[2] = new Book("와 자바 재밌다", 100000, 0.05, "백동현");
//		books[3] = new Book("어린왕자", 10000, 0.1, "생택쥐베리");
//		books[4] = new Book("해리포터", 12000, 0.3, "조앤k롤링");

		// 방법2
		Book books[] = { 
				new Book("자바의정석", 30000, 0.2, "남궁 성"),
				new Book("C언어의정석", 50000, 0.1, "김철수"),
				new Book("와 자바 재밌다", 100000, 0.05, "백동현"),
				new Book("어린왕자", 10000, 0.1, "생택쥐베리"),
				new Book("해리포터", 12000, 0.3, "조앤k롤링") };

		System.out.print("검색할 책 제목을 입력하세요 : ");
		String title = sc.nextLine();

		String str = "해당하는 책이 없습니다.";

		for (int i = 0; i < books.length; i++) {
			if (books[i].getTitle().equals(title)) {
				str = books[i].selectBook();
			}
		}

		System.out.println(str);
	}

}
