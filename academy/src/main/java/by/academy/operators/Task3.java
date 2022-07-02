package by.academy.operators;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month:");
		String word = sc.nextLine();
		word=word.toLowerCase();
		switch (word) {
		case "january":
			System.out.println("Number of month: 1");
			break;
		case "february":
			System.out.println("Number of month: 2");
			break;
		case "march":
			System.out.println("Number of month: 3");
			break;
		case "april":
			System.out.println("Number of month: 4");
			break;
		case "may":
			System.out.println("Number of month: 5");
			break;
		case "june":
			System.out.println("Number of month: 6");
			break;
		case "july":
			System.out.println("Number of month: 7");
			break;
		case "august":
			System.out.println("Number of month: 8");
			break;
		case "september":
			System.out.println("Number of month: 9");
			break;
		case "october":
			System.out.println("Number of month: 10");
			break;
		case "november":
			System.out.println("Number of month: 11");
			break;
		case "december":
			System.out.println("Number of month: 12");
			break;
		default:
			System.out.println("Not a month");
		}

		sc.close();

	}

}
