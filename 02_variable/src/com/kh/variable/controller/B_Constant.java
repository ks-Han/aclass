package com.kh.variable.controller;

public class B_Constant {

	public void finalVarialbe() {
		// ���� ����,�ʱ�ȭ
		int age = 20;
		
		// ��� ���� �ʱ�ȭ - ��� �̸��� ��� �빮��
		final int AGE = 20;
		
		System.out.println("�� ���� ��");
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// ����, ����� ��ϵ� ���� ����
		
		age = 21;
//		AGE = 21;  // ����̱⿡ ���� (�̹� �ʱ�ȭ�� �Ǿ��ִ� �����̹Ƿ�)
		System.out.println("�� ���� ��");
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		System.out.println("����� �ʱ�ȭ�� ���� �� ������ �Ұ���");
	}
}
