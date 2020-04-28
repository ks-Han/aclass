package com.kh.darray.practice;

import java.util.Scanner;

public class DArrayPractice {

	public void example1() {
		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void example2() {
		int[][] arr = new int[4][4];

		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void example3() {
		int[][] arr = new int[4][4];

		int value = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void example4() {
		int[][] arr = new int[4][4];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				for (int j = 0; j < arr.length - 1; j++) {
					arr[i][j] = 0;
					for (int j2 = 0; j2 < arr.length - 1; j2++) {
						arr[i][j] += arr[j2][j];
					}
					sum += arr[i][j];
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					if (j == arr[i].length - 1) {
						arr[i][j] = 0;
						for (int j2 = 0; j2 < arr.length - 1; j2++) {
							arr[i][j] += arr[i][j2];
						}
					} else {
						arr[i][j] = (int) (Math.random() * 10 + 1);
					}
				}
			}
		}

		arr[arr.length - 1][arr[0].length - 1] = sum;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void example5() {
		int[][] arr;
		Scanner in = new Scanner(System.in);
		int a, b = 0;
		char ch;
		do {
			System.out.print("행 크기 : ");
			a = in.nextInt();
			System.out.print("열 크기 : ");
			b = in.nextInt();

			arr = new int[a][b];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char) (Math.random() * 26 + 65);
					System.out.printf("%2c", arr[i][j]);
				}
				System.out.println();
			}

			break;

		} while (true);
	}

	public void example6() {
		String[][] strArr = { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" }, { "원", "열", "니", "로", "시" },
				{ "배", "심", "다", "좀", "다" }, { "열", "히", "!", "더", "!!" }, };

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i]);
			}
			System.out.print(" ");
		}
	}

	public void example7() {
		String[][] strArr;

		Scanner in = new Scanner(System.in);
		int a, b, c, d, e = 0;
		do {
			System.out.print("행의 크기 : ");
			a = in.nextInt();
			System.out.print("0열의 크기 : ");
			b = in.nextInt();
			System.out.print("1열의 크기 : ");
			c = in.nextInt();
			System.out.print("2열의 크기 : ");
			d = in.nextInt();
			System.out.print("3열의 크기 : ");
			e = in.nextInt();

			strArr = new String[a][];
			strArr[0] = new String[b];
			strArr[1] = new String[c];
			strArr[2] = new String[d];
			strArr[3] = new String[e];

			int value = 97;
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.printf("%2c", (char) value++);
				}
				System.out.println();
			}
			break;

		} while (true);

	}

	public void example8() {
		int num = 0, value = 1, a = 0, ssum = 0;
		int binggo[][] = new int[5][5];
		int cBinggo[] = new int[25];
		int sum;
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < cBinggo.length; i++) {
			cBinggo[i] = value++;
		}

		for (int i = 0; i < binggo.length; i++) {
			for (int j = 0; j < binggo[i].length; j++) {
				a = 0;
				do {
					binggo[i][j] = (int)(Math.random() * 25 + 1);
					if (binggo[i][j] == cBinggo[a]) {
						cBinggo[a] = 0;
						break;
					}
					if (a == cBinggo.length-1) {
						a = 0;
					}
					a++;
				} while (true);
			}
		}

		for (int i = 0; i < binggo.length; i++) {
			for (int j = 0; j < binggo.length; j++) {
				System.out.printf("%3d", binggo[i][j]);
			}
			System.out.println();
		}
		do {
			System.out.print("정수 입력 :");
			num = in.nextInt();

			for (int i = 0; i < binggo.length; i++) {
				for (int j = 0; j < binggo[i].length; j++) {
					if (num == binggo[i][j]) {
						binggo[i][j] = 'X';
					}
				}
			}

			for (int i = 0; i < binggo.length; i++) {
				for (int j = 0; j < binggo.length; j++) {
					if (binggo[i][j] == 88) {
						System.out.printf("%3c", binggo[i][j]);
					} else {
						System.out.printf("%3d", binggo[i][j]);
					}
				}
				System.out.println();
			}
			

			int asum = 0, bsum = 0;
			ssum = 0;
			
			for (int i = 0; i < binggo.length; i++) {
				sum = 0;
				asum = 0;
				for (int j = 0; j < binggo.length; j++) {
					sum += binggo[i][j];
					asum += binggo[j][i];
					
					if (i == j) {
						bsum += binggo[i][j];
					}
					if (sum == 440) {
						ssum++;
					} 
					if (asum == 440) {
						ssum++;
					}
					if (bsum == 440) {
						ssum++;
					}
				}
			}
		
			System.out.println("빙고 수 : " + ssum);
			
			if (ssum == 11) {
				break;
			}

		} while (true);
		
		System.out.println("모두 맞춰서 종료합니다.");
	}
}
