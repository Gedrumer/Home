package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type data:");
		String q1 = sc.next();
		System.out.println("Enter variable:");
		String q2 = sc.next();
		q1 = q1.toLowerCase();
		switch (q1) {
		case "int":
			int answer = Integer.valueOf(q2);
			int answer1 = answer / 2;
			System.out.println(answer1);
			break;
		case "double":
			double answers = Double.valueOf(q2);
			double answer2 = (answers * 70) / 100;
			System.out.println(answer2);
			break;
		case "float":
			float answerss = Float.valueOf(q2);
			float answer3 = answerss * answerss;
			System.out.println(answer3);
			break;
		case "char":
			char answer4 = q2.charAt(0);
			int answer4Int = (int) answer4;
			System.out.println("Char code: "+answer4Int);
			break;
		case "string":
			System.out.println("Hello " + q2);
			break;
		default:
			System.out.println("Unsupported type");

		}

		sc.close();
	}

}
