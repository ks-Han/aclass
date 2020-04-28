package com.kh.variable.controller;

public class C_Casting {

	/*
	 * ��ǻ���� �� ó�� ��Ģ 1. ���� �ڷ��� ������ ������ �����ϴ� 2. ���� �ڷ��� ������ ����� �����ϴ�. 3. ����� ����� ��꿡
	 * ���� �ڷ����� ����
	 * 
	 * --> �� ��ȯ�� �ٸ� ��� �ڵ�ĳ���� �Ǵ� ����ĳ���� ����ȯ�� ���� 1. �ڵ� ����ȯ 2. ����(�����) ����ȯ
	 * 
	 */

	// �ڵ� ����ȯ
	// ���� ������ ���� �ڷ����� ū �ڷ����� ���� ��
	// �����Ϸ��� �ڵ����� �ڵ� �ڷ����� ū �ڷ������� ��ȯ ��Ű�� ��.
	public void autoCasting() {
		Integer i = new Integer(12); // 4byte
		Double d = new Double(3.3); // 8byte
		Double result = new Double(i + d); // int���� double�� ����� double������ ���尡��

		System.out.println(i + " + " + d + " = " + (i + d));
		System.out.println(i + " + " + d + " = " + result);
//		System.out.println(i.getClass().getName());
//		System.out.println(d.getClass().getName());
//		System.out.println(result.getClass().getName());

		// int(4byte) -> long(8byte)
		int i2 = 2147483647;
//		int i3 = i2 + 1; // �ִ� ǥ�������� �ʰ��Ͽ� �ٸ� ���� �ڷ��� ���� ���� �� ���� ���̳ʽ��� ����� 
//		System.out.println(i3);  // -2147483648 �� ���
		long l2 = i2 + 1L; // 1L�� �ƴ� 1�� �ᵵ �ڵ����� �� �ڷ����� ���缭 ����
		System.out.println(l2);

		// float(4byte) -> double(8byte)
		float f3 = 2.13F;
		double d3 = 3.14;
		double result3 = f3 + d3;

		System.out.printf("%.2f + %.2f = %.2f\n", f3, d3, result3);

		// 10���� ���ѼҼ��� 2������ ��ȯ�ϸ� ���ѼҼ��� �Ǵ� ��찡 ����.
		// �׷���, ��ǻ�ʹ� �Ǽ��� �ε��Ҽ������� ǥ���ϱ� ������
		// 2���� ���� �Ҽ��� ��Ȯ�� ǥ���ϴµ� �Ѱ谡 �ִ�.
		// �׷��� ������ �߻��Ѵ�.

		// char(2byte) -> int(4byte)
		int i4 = 'A'; // int�� ������ char�� ���ͷ� �� ����
		/*
		 * char -> int �ڵ�����ȯ�� ������ ���� char��� �ڷ��� ������ ���� ��ü�� �����ϴ� ������ �ƴ� 2byte���� ���� ���ڸ�
		 * �����ϰ�, �����ڵ��� ����ǥ���� �ش� ��ȣ�� ��ġ�ϴ� ���ڸ� ã�� ����ϴ� �ڷ����̴�
		 */

		// char �ڷ��� ������ ������ �����ϱ�
		char ch5 = 65; // �����ڵ忡�� ����ǥ�� ã�⶧���� ������ �����ϴ� �͵� ����
						// ������ �����ڰ��ƴ� ����ǥ���� �ش��ϴ� ���� ���ڸ� ���

		System.out.println("i4�� �� : " + i4); // 65
		System.out.println("ch5�� �� : " + ch5); // A

		// byte, short, int
		byte bNum1 = 1;
		byte bNum2 = 10;
//		byte bResult = bNum1 + bNum2; // ���ͷ� ���� int�� �̱⶧���� ������ ��

		// byte, short, char, int
		// �� �� ���� �ڷ����� int ���ͷ��� ���� �ʱ�ȭ�� �� �ִ�.
		// �̴� int �ڷ����� �����ϰ� ���� �� ���� ����
		// �ʱ�ȭ �� ���� byte, short, char �ڷ��� ������
		// ���� �̿��Ͽ� ���(����) ���� ��
		// ������ int������ ����ó���� ����ȴ�.
		
		byte bResult = (byte)(bNum1 + bNum2); // ���� ĳ���� (int�� Ÿ���� byte��)
		// ����ĳ���� �ÿ� ������ �ս��� �Ͼ �� �ִ�.

	}
	
	// ���� ����ȯ
	public void forcedCasting() {
		// ���� ������ ���� �ڷ��� -> ū �ڷ������� ���� ��ȯ ��Ű�� ��
		
		int iNum1 = 10;
		long lNum1 = 10L;
		
		int result = (int)(iNum1 + lNum1);
		
	}
}
