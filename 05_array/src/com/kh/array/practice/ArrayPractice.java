package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (10 - i);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {
		int arr[];

		Scanner in = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int a = in.nextInt();
		arr = new int[a];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String strArr[] = { "사과", "귤", "포도", "복숭아", "참외" };

		System.out.println(strArr[1]);

	}

	public void practice5() {
		char cArr[];
		char ch;
		int sum = 0;
		String str;
		Scanner in = new Scanner(System.in);

		System.out.print("문자열 : ");
		str = in.nextLine();
		System.out.print("문자 : ");
		ch = in.nextLine().charAt(0);

		cArr = new char[str.length()];

		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt(i);
		}
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < cArr.length; i++) {
			if (ch == cArr[i]) {
				sum++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + sum);
	}

	public void practice6() {
		char cArr[] = { '월', '화', '수', '목', '금', '토', '일' };
		int a;
		Scanner in = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		a = in.nextInt();

		if (0 <= a && 6 >= a) {
			System.out.println(cArr[a] + "요일");
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

	public void practice7() {
		Scanner in = new Scanner(System.in);
		int a, sum = 0;
		int arr[];
		System.out.print("정수 : ");
		a = in.nextInt();
		arr = new int[a];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = in.nextInt();
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}

	public void practice8() {
		Scanner in = new Scanner(System.in);
		int a = 0;
		int arr[];

		do {
			System.out.print("정수 : ");
			a = in.nextInt();
			arr = new int[a];
			if (a % 2 == 1) {
				for (int i = 0; i < arr.length; i++) {
					if ((int) a / 2 > i) {
						arr[i] = i + 1;
					} else {
						arr[i] = a - i;
					}
				}
				System.out.println(Arrays.toString(arr));
				break;
			} else {
				System.out.println("다시 입력해 주세요");
			}
		} while (true);

	}

	public void practice9() {
		String strArr[] = { "양념", "후라이드", "간장" };
		String str, result = "";
		Scanner in = new Scanner(System.in);

		System.out.print("치킨 이름을 입력하세요 : ");
		str = in.nextLine();

		for (int i = 0; i < strArr.length; i++) {
			if (str.equals(strArr[i])) {
				result = str + "치킨 배달 가능";
				break;
			} else {
				result = str + "치킨은 없는 메뉴입니다.";
			}
		}

		System.out.println(result);
	}

	public void practice10() {
		String str = "";
		char strArr[];
		Scanner in = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		str = in.nextLine();

		strArr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (i > 7) {
				strArr[i] = '*';
			} else {
				strArr[i] = str.charAt(i);
			}
			System.out.print(strArr[i]);
		}
	}

	public void practice11() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		int arr[] = new int[10];
		int maxTemp = 0, minTemp = 9;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
			if (arr[i] > maxTemp) {
				maxTemp = arr[i];
			} else if (arr[i] < minTemp) {
				minTemp = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + maxTemp);
		System.out.println("최소값 : " + minTemp);
	}

	public void practice13() {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {
		int arr[] = new int[6];
		int tmp;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 46 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (arr[i] < arr[j]) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice15() {
		String str = "";
		int sum = 0;
		char cArr[];
		boolean flag;

		Scanner in = new Scanner(System.in);
		System.out.print("문자열 : ");
		str = in.nextLine();

		cArr = new char[str.length()];

		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < cArr.length; i++) {
			cArr[i] = str.charAt(i);
			flag=true;
			for (int j = 0; j < i; j++) {
				if (cArr[i] == cArr[j]) {
					flag=false;
					break;
				}
			}
			if (flag) {
				System.out.print(cArr[i] + " ");
				sum++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + sum);

	}
	
	public void practice16() {
		String str = "";
		String strArr[], strArr2[];
		char inputYN;
		int inInt = 0, inInt2 = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		inInt = in.nextInt();
		in.nextLine();
		
		strArr = new String[inInt];
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(i + "번째 문자열 : ");
			strArr[i] = in.nextLine();
		}
		do {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			inputYN = in.nextLine().charAt(0);
			
			if (inputYN == 'N' || inputYN == 'n') {
				System.out.println();
				break;
			} else {
				System.out.print("더 입력하고 싶은 개수 : ");
				inInt2 = in.nextInt();
				in.nextLine();
				
				strArr2 = new String[inInt + inInt2];
				System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
				strArr = strArr2;
				
				for (int i = inInt; i < strArr.length; i++) {
					System.out.print(i + "번째 문자열 : ");
					strArr[i] = in.nextLine();
				}
				inInt += inInt2;
			}
			
		} while (true);
		
		System.out.println(Arrays.toString(strArr));
	}
}
