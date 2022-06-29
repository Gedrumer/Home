package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int w = 0;
		int e = 0;
		Scanner scaner = new Scanner(System.in);
		System.out.println("Enter first word");
		String question1 = scaner.nextLine();
		question1 = question1.toLowerCase();
		char[] arr1 = question1.toCharArray();
		System.out.println("Enter second word");
		String question2 = scaner.nextLine();
		question2 = question2.toLowerCase();
		char[] arr2 = question2.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			int q = (int) arr1[i];
			w = w + q;
		}
		for (int i = 0; i < arr2.length; i++) {
			int q = (int) arr1[i];
			e = e + q;
		}
		if (w == e) {
			System.out.println(question1 + " and " + question2 + " -> true");
		} else {
			System.out.println(question1 + " and " + question2 + " -> false");
		}
		scaner.close();
	}
}
