package com.kh.control.chap01.practice;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		int num;
		Scanner in = new Scanner(System.in);

		System.out.printf("1. 입력\n" + "2. 수정\n" + "3. 조회\n" + "4. 삭제\n" + "7. 종료\n");
		System.out.print("메뉴 번호를 입력해주세요 : ");
		num = in.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("수정 메뉴입니다");
			break;
		case 3:
			System.out.println("조회 메뉴입니다");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			return;
		default:
			System.out.println("잘못 입력함");
			return;
		}

	}

	public void practice2() {
		int num;
		Scanner in = new Scanner(System.in);

		System.out.print("숫자를 한 개 입력해주세요 : ");
		num = in.nextInt();

		if (num >= 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요");
		}
	}

	public void practice3() {
		int kor, eng, math = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("국어점수 입력해주세요 : ");
		kor = in.nextInt();
		System.out.print("수학점수 입력해주세요 : ");
		math = in.nextInt();
		System.out.print("영어점수 입력해주세요 : ");
		eng = in.nextInt();


		int sum = 0;
		double avg = 0;
		sum = kor + math + eng;
		avg = sum / 3.0;

		if (kor >= 40 && math >= 40 && eng >= 40) {
			if (avg >= 60) {
				System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n", kor, math, eng, sum, avg);
				System.out.println("축하합니다, 합격입니다!");
			} else {
				System.out.println("불합격 입니다.");
			}
		} else {
			System.out.println("불합격 입니다.");
		}
	}

	public void practice4() {
		int num;
		Scanner in = new Scanner(System.in);

		System.out.print("1~12 사이의 정수를 입력하세요 : ");
		num = in.nextInt();

		switch (num) {
		case 12:
		case 1:
		case 2:
			System.out.println(num + "월은 겨울 입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(num + "월은 봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(num + "월은 여름 입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(num + "월은 가을 입니다.");
			break;

		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			return;
		}
	}

	public void practice5() {
		String id = "myId";
		String password = "myPassword12";
		Scanner in = new Scanner(System.in);

		System.out.print("아이디 : ");
		String inputId = in.nextLine();

		System.out.print("비밀번호 : ");
		String inputPassword = in.nextLine();

		if (id.equals(inputId)) {
			if (password.equals(inputPassword)) {
				System.out.println("로그인 성공하였습니다.");
			}
			System.out.println("password 불일치");
		} else {
			System.out.println("Id 불일치");
		}

	}

	public void practice6() {
		String enter = "";
		Scanner in = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		enter = in.nextLine();
		
		switch (enter) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("없는 등급입니다 확인 후 다시 실행해주세요");
			return;
		}
	}
	
	public void practice7() {
		double h, w, bmi = 0;
		String bmiResult = "";
		Scanner in = new Scanner(System.in);

		System.out.print("키(m)를 입력해주세요 : ");
		h = in.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		w = in.nextDouble();
		
		bmi = w / (h * h);
		
		if (bmi >= 30) {
			bmiResult = "고도비만";
		} else if (bmi >= 25) {
			bmiResult = "비만";
		} else if (bmi >= 23) {
			bmiResult = "과체중";
		} else if (bmi >= 18.5) {
			bmiResult = "정상체중";
		} else if (bmi < 18.5) {
			bmiResult = "저체중";
		} else {
			System.out.println("값을 잘못 입력하셨네요");
			return;
		}
		
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(bmiResult);
	}
	
	public void practice8() {
		int num1, num2 = 0;
		double result = 0;
		char op;
		Scanner in = new Scanner(System.in);

		System.out.print("피연산자1  입력해주세요 : ");
		num1 = in.nextInt();
		System.out.print("피연산자2  입력해주세요 : ");
		num2 = in.nextInt();
		in.nextLine();
		System.out.print("연산자를 입력해주세요 : ");
		op = in.nextLine().charAt(0);

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = (double)num1 / (double)num2;
			break;
		case '%':
			result = num1 % num2;
			break;

		default:
			System.out.println("잘못 입력하였습니다. 프로그램 종료합니다.");
			return;
		}
		
		System.out.printf("%d %c %d = %f\n",num1,op,num2,result);
	}
	
	public void practice9() {
		int mScore, fScore = 0;
		int subj, atten = 0;
		double sum = 0;
		int giAtten = 20; 
		Scanner in = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		mScore = in.nextInt();
		System.out.print("기말 고사 점수 : ");
		fScore = in.nextInt();
		System.out.print("과제 점수 : ");
		subj = in.nextInt();
		System.out.print("출석 점수 : ");
		atten = in.nextInt();
		
		double mScoreChk, fScoreChk, subjChk, attenChk = 0;
		mScoreChk = mScore * 0.20;
		fScoreChk = fScore * 0.30;
		subjChk = subj * 0.30;
		attenChk = atten;
		
		sum = mScoreChk + fScoreChk + subjChk + attenChk;

		
		double failAttenChk = atten * 0.3;
		
		System.out.println("========== 결과 ==========");
		
		if ( atten >= giAtten - (int)failAttenChk ) {
			System.out.printf("중간 고사 점수(20) : %.1f\n",mScoreChk);
			System.out.printf("기말 고사 점수(30) : %.1f\n",fScoreChk);
			System.out.printf("과제 점수(30) : %.1f\n",subjChk);
			System.out.printf("출석 점수(20) : %.1f\n",attenChk);
			System.out.println("총점 : " + sum);
			
			if (sum > 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]", atten);
		}
	}
	
	public void practice10() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		System.out.print("선택 : ");
		int menu = in.nextInt();
		
		switch (menu) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("없는 메뉴를 선택 하셨습니다 종료합니다");
			return;
		}
	}
}
