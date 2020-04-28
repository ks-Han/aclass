package com.kh.array.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class D_Overlap {

	public void example1() {

		// int형 배열 arr을 선언하여 5칸 할당 후
		// 각 인덱스에 값을 입력받아 저장.
		// 단, 중복되는 값은 저장하지 않음.
		// (중복값 입력 시 "중복값 존재" 출력)

		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 인덱스 값 : ");
			arr[i] = in.nextInt();
			in.nextLine();

			// 중복 검사
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("중복 입니다 다시 입력 바랍니다");
					i--;
					break;
				}
			}
		} // 바깥쪽 for end

		System.out.println(Arrays.toString(arr));
	}

	public void example2() {
		// 로또 번호 생성기
		// -1 ~ 45까지의 번호가 존재
		// - 6개 랜덤 추출 
		// - 중복 x --> 중복 제거
		// - 오름차순 정렬
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			
			int ran = (int)(Math.random() * 45 +1);
			
			lotto[i] = ran;
			
			// 중복 검사
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					// 같은 값이 배열에 존재하는 경우
					i--; // 현재 바퀴 반복
					break;
				}
			}
		}
		
		// 오름 차순 정렬
		int tmp = 0;
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
//				if (lotto[i] < lotto[j]) {
//					tmp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = tmp;
//				}
			}
		}
		
		Arrays.sort(lotto);
		System.out.println("오늘의 로또 번호 : " + Arrays.toString(lotto));
		
	}
}
