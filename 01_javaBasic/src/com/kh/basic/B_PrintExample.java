package com.kh.basic;

public class B_PrintExample {

	String tmpPrintOut = "���ڿ����";

	public void printValue() {
		System.out.println(tmpPrintOut);
		System.out.print("���õ� ȭ����");
		System.out.println();
		System.out.println("������");
		System.out.println();
		System.out.println();

		// ���� ���
		// ������ ��� ���ڿ��� ���� ""�� �����ʴ´�
		System.out.println("���� ���");
		System.out.println(123);

		// ���� + ����, ���� + ���ڿ�, ���ڿ� + ���ڿ��� �����ϴ�
		System.out.println(1 + 2);
		System.out.println("���ڿ� " + "��ġ��");
		System.out.println(5 + 10 + "Hello"); // >>>15Hello
		System.out.println("Hello" + 5 + 10); // >>>Hello510
										      // -- ������ ���� ���� (���ڿ��� �������ͼ� �ڿ��ִ� �������� ���ڿ��� ��ȯ��)
											  // -- ������ ���������� ������ ���ϰ� �ڿ� ���ڿ��� ���� �� ���ڿ��� ��ȯ��
	}
}
