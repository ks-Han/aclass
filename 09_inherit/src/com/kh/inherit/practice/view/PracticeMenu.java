package com.kh.inherit.practice.view;

import java.util.Scanner;

import com.kh.inherit.practice.model.service.CircleService;
import com.kh.inherit.practice.model.service.RectangleService;

public class PracticeMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleService cService = new CircleService();
	private RectangleService rService = new RectangleService();

	public void mainMenu() {
		int input = 0;
		do {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
			}

		} while (input != 9);

	}

	public void circleMenu() {
		int input = 0;
		
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다");
			}
	}

	public void rectangleMenu() {
		int input = 0;

			System.out.println("===== 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				calcPerimeter();
				break;
			case 2:
				calcRectArea();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하셨습니다");
			}

	}

	public void calcCircum() {
		int x,y,radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		
		String str = cService.calcCircum(x, y, radius);
		System.out.println(str);
		
	}

	public void calcCircleArea() {
		int x,y,radius;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("반지름 : ");
		radius = sc.nextInt();
		
		String str = cService.calcArea(x, y, radius);
		System.out.println(str);
		
	}

	public void calcPerimeter() {
		int x,y,width,height;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		
		String str = rService.calcPerimeter(x, y, width, height);
		System.out.println(str);
		
	}

	public void calcRectArea() {
		int x,y,width,height;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
		System.out.print("너비 : ");
		width = sc.nextInt();
		
		String str = rService.calcAreaint(x, y, height, width);
		System.out.println(str);
		
	}
}
