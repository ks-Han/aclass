package com.kh.variable.controller;

public class D_Overflow {

	// overflow��?
	// �����Ͱ� ������ִ� ������
	// �ش� ���� �ڷ����� ���� ������ �Ѿ�� ���� ���ԵǸ�
	// ��Ÿ���� ��������
	// ��ȣ ��Ʈ ħ������ ������ �ʴ� �������� ����� ��Ÿ��.
	
	public void overflowEx() {
		byte bNum = 127; // byte�� ���� �ִ밪
		
		System.out.println(bNum + 1);
		
		bNum = (byte)(bNum + 1); // >>> 128
		System.out.println(bNum); // >>> -128
	}
	
}
