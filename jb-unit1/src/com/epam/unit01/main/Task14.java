package com.epam.unit01.main;

public class Task14 {
	public static void main(String[] args) {
		//��������� ����� ���������� � ������� ����� ������ � ���� �� ��������� ������� R
		double Pi = Math.PI;
		double s, ss, sss, ssss; // 1� 2� 3� � 4� �������
		s=Math.pow(Pi, 1);
		ss=Math.pow(Pi, 2);
		sss=Math.pow(Pi, 3);
		ssss=Math.pow(Pi, 4);
		System.out.println("������ �������� ����� PI = " + s + "; ������ �������� ����� PI=" +ss+ "; ������ �������� ����� PI=" +sss + "; �������� �������� ����� PI=" +ssss);
	}
}