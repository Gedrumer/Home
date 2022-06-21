package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 10:");
		int q1 = sc.nextInt();
		for (int i = 1; i != 11; i++) {
			int x = q1 * i;
			System.out.println(x);
		}

		sc.close();
	}

}
