package com.kh.bingo.service;

import java.util.Scanner;

public class Bingo {
	
	// 빙고게임
	public void startBingo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빙고판 크기 지정 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 1차원 배열로 빙고판에 입력될 값 생성 + 중복제거 진행
		int[] tempArr = new int[num*num]; // 1차원 배열 생성
		// num * num --> 빙고판의 크기는 가로 세로의 곱 만큼의 공간이 필요함.
		
		// 중복값 제거하면서 랜덤값 집어넣기
		for(int i=0; i<tempArr.length; i++) {
			tempArr[i] = (int)(Math.random()*(num*num))+1; // tempArr[0 ~ tempArr.length-1]에 각각 랜덤값 생성
			
			// 중복 제거
			for(int j=0; j<i; j++) {		 
				if(tempArr[i] == tempArr[j]) { 
					i--;					 
					break;					 
				}							
			}					
		}
			
		
		// 위에서 만들어진 중복제거한 1차원 배열을 --> 2차원 배열에 넣기
		// String 배열로 변경해서 대입 진행.
		// 왜 String배열로? 빙고가 된 부분을  "X"로 변경하기 위해서
		String[][] bingoBoard = new String[num][num]; 
		
		int index = 0; // 1차원 배열 인덱스 지정을 위한 변수
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				// 1차원 배열은 0번부터 num*num까지 반복 진행
				
				bingoBoard[i][j] = tempArr[index]+""; 
				index++;
			}
		}
		
		//----------------------------------------------------
		
		// 랜덤 배치된 빙고판 최초 1회  출력
		for(int i=0; i<bingoBoard.length; i++) {
			for(int j=0; j<bingoBoard[0].length; j++) {
				System.out.printf("%4s", bingoBoard[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("================빙고게임 시작==============");
		while(true) {
			System.out.print("정수를 입력하시오 : ");
			String input = sc.nextLine();
			
			boolean flag = true; // 검색된 값이 빙고판에 있는지 확인(잘못된 입력 확인)
			for(int i=0; i<bingoBoard.length; i++) {
				for(int j=0; j<bingoBoard[0].length; j++) {
					
					// 입력된 값과 일치되는 곳을 X형태로 변환
					if(bingoBoard[i][j].equals(input)) {
						bingoBoard[i][j] = "X";
						flag = false;
					}
					
					System.out.printf("%4s",bingoBoard[i][j]);
					
				}
				System.out.println();
			}
			
			if(flag) {
				System.out.println("잘못 입력함. 다시 입력하세요");
				continue;
			}
			
			
			
			// 빙고판에 크기에 따라 
			// 빙고 기준이 되는 문자열 생성
			// ex) 5 * 5 크기 빙고 --> 한줄이 "XXXXX"이면 빙고
			String bingoLine = "";
			for(int i=0 ; i<num ; i++) {
				bingoLine += "X";
			}
			
			
			// 빙고 검사
			int bingoCount = 0; // 빙고 수를 저장할 변수
			
			// 가로(행)또는 세로(열)의 문자열을 더하여 하나의 문자열로 저장
			// --> 저장된 문자열의 모양이 "XXXXX"인 경우 == 빙고 
			// --> bingoCount 증가
			
			
			String row = null; // 가로(행)를 모두 더한 문자열을 참조할 변수 선언.
			String col = null; // 세로(열)를 모두 더한 문자열을 참조할 변수 선언.
			
			for(int i=0 ; i<bingoBoard.length ; i++) {
				// 매 반복 시 마다 row, col을 빈 문자열로 초기화
				// --> 바깥쪽 for문이 반복될 때 마다 검사하는 행과 열이 이동하므로
				//     빙고 여부를 검사하기위한 row, col을 빈문자열로 초기화 해야함.
				row = ""; 
				col = "";
				
				for(int j=0; j<bingoBoard.length ; j++) { 
					
					row += bingoBoard[i][j]; // 현재 행의 문자를 모두 더함.
					
					// // i,j(행렬)를 반대로하여 열의 모든 문자를 더함.
					col += bingoBoard[j][i];
				}
				
				if(row.equals(bingoLine)) {
					bingoCount++; // 가로 빙고가 존재 할 경우
				}
				if(col.equals(bingoLine)) {
					bingoCount++; // 세로 빙고가 존재 할 경우
				}
			}
			
			
			// 대각선 빙고 여부
			// 대각선 : diagonal(다이애그널)
			
			// 대각선은 빙고판에 두 개만 존재
			// --> 대각선 문자를 더해서 저장할 별수 두 개 선언 및 빈문자열로 초기화
			String dia1 = "";
			String dia2 = "";
			
			// 대각선은 for문 하나로 가능
			for(int i=0 ; i<bingoBoard.length ; i++) {
				dia1 += bingoBoard[i][i]; // 좌상 우하
				dia2 += bingoBoard[bingoBoard.length - i-1][i]; // 우상 좌하
			}
			
			if(dia1.equals(bingoLine)) {
				bingoCount++; 
			}
			if(dia2.equals(bingoLine)) {
				bingoCount++; 
			}
			

			// 빙고 카운트 출력
			System.out.println("현재 " + bingoCount + "빙고");
			
			if(bingoCount >= 3) { // 빙고 개수가 3개 이상인 경우
				System.out.println("***** BINGO!!! *****");
				break;
			}
			
			System.out.println();
			System.out.println();
			
		}
		
	}

	
	
	
	

}
