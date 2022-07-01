package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter words:");
		String[] question = scan.nextLine().split(" ");
		System.out.println(Arrays.toString(question));

		scan.close();
	}

}
