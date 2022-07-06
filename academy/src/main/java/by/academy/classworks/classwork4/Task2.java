package by.academy.classworks.classwork4;

public class Task2 {

	public static void main(String[] args) {
		String str = "I like Java!!!";

		System.out.println(str.charAt(10));
		System.out.println(str.endsWith("!!!"));//endsWith ������������� �� !!!
		System.out.println(str.startsWith("I like"));//startsWith ���������� � I like
		System.out.println(str.contains("Java")); //contains �������� �� 
		System.out.println(str.lastIndexOf("Java")); // lastIndexOf() ����� ������� � ������ 
		System.out.println(str.replace("a","o"));//replace �������� �������
		System.out.println(str.toLowerCase());//toLowerCase � ������� ��������
		System.out.println(str.toUpperCase());//toUpperCase � �������� ��������
		System.out.println(str.substring(7,11));//substring �������� ������ �� ... ��....
	}

}
