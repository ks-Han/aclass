package com.kh.variable.controller;

public class A_Variable {
	final double PI = 3.141592653589793;
	final int R = 10;
	final int H = 20;

	public void noVariable() {
		System.out.println("���� ��� ����");
		System.out.println(2 * 3.141592653589793 * 10);
		System.out.println(3.141592653589793 * 10 * 10);
		System.out.println(3.141592653589793 * 10 * 10 * 20);
		System.out.println(4 * 3.141592653589793 * 10 * 10);
	}

	public void usingVariable() {
		System.out.println("���� �����");
		System.out.println(2 * PI * R); // ���� �ѷ�
		System.out.println(PI * R * R); // ���� ����
		System.out.println(PI * R * R * H); // �����
		System.out.println(4 * PI * R * R); // ���� �ѳ���

		/*
		 * ���� ����� ����
		 * 
		 * 1. ���� �ǹ̸� �ο��� �� �ִ�. 2. �������� ��������. 3. ���뼺�� ����(���Ӽ�) 4. ������������ ����.
		 * 
		 */
	}

	// ���� ����
	public void declareVariable() {
		// 1. ����
		// ��(true), ����(false)�� ������ �� �ִ� �ڷ���

		boolean isTrue; // 1byte�� ũ�⸦ ���´�

		// 2. ������
		// 2-1. ������(��������, ��������, 0)
		byte bNum; // 1byte
		short sNum; // 2byte
		int iNum; // 4byte --> �������߿� �⺻��
		long lNum; // 8byte
		
		// 2-2. �Ǽ���
		// �Ǽ��� �������� ���� ��� = �ε��Ҽ��� ����� ����Ͽ� int�� ǥ���� �� �ִ�
		// ����Ʈ�� ���� ������ �Ǽ����� �ξ� ���� ǥ���� �� �ִ�
		float fNum; // 4byte
		// 0.9999999 (float ����) [�Ҽ��� 8�� ǥ�������� �ݿø��Ͽ� 7�� ǥ��]
		
		// 0.999999999999999 (double ����) [�Ҽ��� 16�� ǥ�������� �ݿø��Ͽ� 15�� ǥ��]
		
		double dNum; // 8byte --> �Ǽ����� �⺻��
		
		// 3.������
		// ������ ������ ���� �� �ϳ����� ������ �� �ִ�.
		char ch; // �ڹٴ� 2byte
		
		// 4.���ڿ�
		// ���ڿ��� �⺻�ڷ����� �ƴ� --> ������
		// ���ڿ��� �޸� ũ�� �Ǵ� �� ������
		// String���� �޸𸮸� �����ϱ� ���� �ּ��� ���� �����ִµ�, �⺻���� int 4byte ũ��� �Ҵ�Ǿ� ���ȴ�
		// �޸� ũ��� �����ּ�ũ���� ���� �ٸ� ���̴� �򰥸��� ����
		// �޸��� ũ���� ��� �����ϳ��� 2����Ʈ
		String str;
		
		//---------------------------------
		// ������ ������ �� ����
		
		// boolean �ڷ��� ������ ���Ե� �� �ִ� ���ͷ�(��)�� true or false ��
		isTrue = true; isTrue = false;
		
		// ������
		bNum = 1;
//		bNum = 128; // ����Ʈ�� -128~127���� ǥ�� �����ϱ⿡ ����
		// ���� ���� �߸� �� ���� �������� mismatch error �߻� �Ѵ�
		
		sNum = 10000;
		iNum = 2000000000;
		
		lNum = 123L; // ������ long�� ���ͷ� ǥ����� ���ͷ��ڿ� L �Ǵ� l ǥ��
		fNum = 0.123F; // �Ǽ��� float�� ���ͷ� ǥ����� ���ͷ��ڿ� f �Ǵ� F ǥ��
		               // ���ͷ��ڿ� ǥ�⸦ ���ϰԵǸ� �⺻������ �νĵǾ� mismatch �߻� ���ɼ� ����
		
		dNum = 3.141592; // �Ǽ����� �⺻���̶� ǥ����� �ڿ� �����൵ ��
		
		// ������
		ch = 'a'; // �������� ''�� ���������, char �ڷ����� ���ͷ� ǥ����� ''
		str = "zzzzzzzzz"; // String �ڷ����� ���ͷ� ǥ����� "", �� ���ڸ� ǥ���Ѵ��ص� String�� ""
		
		
	}
	
	public void initVariable() {
		// init �ʱ�ȭ
		
		// 1.����
		boolean isTrue = false;
		
		// 2.������
		byte bNum = 1; // 1byte
		short sNum = 2; // 2byte
		int iNum = 4; // 4byte, ����(�ڷ�)�� ���� �⺻��
		long lNum = 8L; //8byte
		
		// 3.�Ǽ���
		float fNum = 4.0f; // 4byte
		double dNum = 8.0; // 8byte, �Ǽ�(�ڷ�)���� �⺻��
		
		// 4.������
		char ch = 'a';
		
		// 5.���ڿ�(������)
		String str = "A������";
		
		System.out.println("istTrue�� �ʱ�ȭ�Ȱ�:"+isTrue);
		System.out.println("bNum�� �ʱ�ȭ�Ȱ�:"+bNum);
		System.out.println("sNum�� �ʱ�ȭ�Ȱ�:"+sNum);
		System.out.println("iNum�� �ʱ�ȭ�Ȱ�:"+iNum);
		System.out.println("lNum�� �ʱ�ȭ�Ȱ�:"+lNum);
		System.out.println("fNum�� �ʱ�ȭ�Ȱ�:"+fNum);
		System.out.println("dNum�� �ʱ�ȭ�Ȱ�:"+dNum);
		System.out.println("ch�� �ʱ�ȭ�Ȱ�:"+ch);
		System.out.println("str�� �ʱ�ȭ�Ȱ�:"+str);
	}
}