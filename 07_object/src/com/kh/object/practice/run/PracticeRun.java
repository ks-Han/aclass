package com.kh.object.practice.run;

import com.kh.object.practice.model.service.BookService;

public class PracticeRun {

	// 클래스 다이어그램에서 _ 밑줄은 static을 의미
	public static void main(String[] args) {

		BookService b = new BookService();
		b.practice();
	}

}
