package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {

		Scanner in = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = in.nextInt();
		in.nextLine();
		in.close();

		System.out.println((num > 0 ? "양수다" : "양수가 아니다"));
	}

	public void practice2() {
		Scanner in = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = in.nextInt();
		in.nextLine();
		in.close();

		System.out.println(((num > 0) ? "양수다" : ((num == 0) ? "0이다" : "양수가 아니다")));
	}

	public void practice3() {
		Scanner in = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = in.nextInt();
		in.nextLine();
		in.close();

		System.out.println(((num % 2 == 0) ? "짝수다" : "홀수다"));
	}

	public void practice4() {
		Scanner in = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int num1 = in.nextInt();
		in.nextLine();
		System.out.print("사탕 개수 : ");
		int num2 = in.nextInt();
		in.nextLine();
		in.close();

		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남은 사탕 개수 : " + (num2 % num1));
	}

	public void practice5() {
		Scanner in = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = in.nextLine();
		System.out.print("학년(숫자만) : ");
		int degree = in.nextInt();
		in.nextLine();
		System.out.print("반(숫자만) : ");
		int clss = in.nextInt();
		in.nextLine();
		System.out.print("번허(숫자만) : ");
		int num = in.nextInt();
		in.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = in.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		float point = in.nextFloat();
		in.close();

//		System.out.println(degree+"학년 "+clss+"반 "+num+"번 "+name+" "+gender+"학생의 성적은 "+point+"이다");
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.\n", degree, clss, num, name, gender, point);
	}

	public void practice6() {
		Scanner in = new Scanner(System.in);

		System.out.print("나이를 입력하세요 : ");
		int age = in.nextInt();
		in.nextLine();
		in.close();

		System.out.println((age > 19) ? "성인" : (age > 13) ? "청소년" : "어린이");
	}
	
	public void practice7() {
		Scanner in = new Scanner(System.in);

		System.out.print("국어 점수를 입력하세요 : ");
		int kor = in.nextInt();
		in.nextLine();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = in.nextInt();
		in.nextLine();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = in.nextInt();
		in.nextLine();
		in.close();

		int sum = (kor + eng + math);
		double aver = (double)(kor + eng + math) / (double)3;
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n",aver);
		
		boolean korChk = kor > 40;
		boolean engChk = eng > 40;
		boolean mathChk = math > 40;
		boolean averChk = (int)aver >= 60;
		boolean resultChk = korChk && engChk && mathChk && averChk;
		
		System.out.println((resultChk?"합격":"불합격"));
	}
	
	public void practice8() {
		Scanner in = new Scanner(System.in);

		System.out.print("주민번호 입력해주세요(- 포함) : ");
		String genderChk = in.nextLine();
		in.close();
		
		char mOrF = genderChk.charAt(7);
		
		System.out.println((mOrF == '1'?"남자":"여자"));

	}
	
	public void practice9() {
		Scanner in = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = in.nextInt();
		in.nextLine();
		System.out.print("정수2 : ");
		int num2 = in.nextInt();
		System.out.print("입력 : ");
		int num3 = in.nextInt();
		in.nextLine();
		in.close();
		
		boolean result = (num3 <= num1? true:(num3 > num2)?true:false);
				
		System.out.println();
		
		System.out.println(result);

	}
	
	public void practice10() {
		Scanner in = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = in.nextInt();
		in.nextLine();
		System.out.print("입력2 : ");
		int num2 = in.nextInt();
		System.out.print("입력3 : ");
		int num3 = in.nextInt();
		in.nextLine();
		in.close();
		
		boolean result = num1 == num2;
		boolean result2 = num2 == num3;		
				
		System.out.println();
		
		System.out.println(result2);

	}
	
	public void practice11() {
		Scanner in = new Scanner(System.in);

		System.out.print("A사원의 연봉 : ");
		int num1 = in.nextInt();
		in.nextLine();
		System.out.print("B사원의 연봉 : ");
		int num2 = in.nextInt();
		in.nextLine();
		System.out.print("C사원의 연봉 : ");
		int num3 = in.nextInt();
		in.nextLine();
		in.close();
		
		double aInsen = num1 * 0.4;
		double bInsen = 0;
		double cInsen = (double)num3 * 0.15;
		
		String aChk = (num1+aInsen > 3000)?"3000 이상":"3000 미만";
		String bChk = (num2+bInsen > 3000)?"3000 이상":"3000 미만";
		String cChk = (num3+cInsen > 3000)?"3000 이상":"3000 미만";
		
		System.out.printf("A사원 연봉/연봉+a : %d/%.1f\n",num1,num1+aInsen);
		System.out.println(aChk);
		System.out.printf("B사원 연봉/연봉+a : %d/%.1f\n",num2,num2+bInsen);
		System.out.println(bChk);
//		System.out.printf("C사원 연봉/연봉+a : %d/%f\n",num3,num3+cInsen);
		System.out.println("C사원 연봉/연봉+a : " + num3 + "/"+((double)num3+cInsen));
		System.out.println(cChk);
	}
}
