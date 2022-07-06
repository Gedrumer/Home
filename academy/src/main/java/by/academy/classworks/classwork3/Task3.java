package by.academy.classworks.classwork3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int q1 = sc.nextInt();
		int q2 = 1;
		for (int i = 1; i <= q1; i++) {
			q2 = q2 * i;

		}
		System.out.println(q2);
		sc.close();

	}

}
