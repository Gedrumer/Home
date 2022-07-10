package by.academy.strings;

public class Task01 {
	public static void main(String[] args) {
		String str = "I like Java!!!";

		System.out.println(str.charAt(10));
		System.out.println(str.endsWith("!!!"));//endsWith  !!!
		System.out.println(str.startsWith("I like"));//startsWith I like
		System.out.println(str.contains("Java")); //contains содержит
		System.out.println(str.lastIndexOf("Java")); // lastIndexOf() позиция подстроки 
		System.out.println(str.replace("a","o"));//replace замена символов
		System.out.println(str.toLowerCase());//toLowerCase нижний регистр
		System.out.println(str.toUpperCase());//toUpperCase верхний регистр
		System.out.println(str.substring(7,11));//substring вырезать подстроку
	}

}
