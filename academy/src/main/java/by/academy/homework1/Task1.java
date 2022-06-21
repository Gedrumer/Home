package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum:");
		float q1 = sc.nextFloat();
		System.out.println("Enter age:");
		float q2 = sc.nextFloat();
		if (q1 < 100) {
			float a1 = (q1 * 5) / 100;
			float a2 = q1 - a1;
			System.out.println("Your sum with discount: " + a2);
		} else if (q1 >= 100 && q1 < 200) {
			float a1 = (q1 * 7) / 100;
			float a2 = q1 - a1;
			System.out.println("Your sum with discount: " + a2);
		} else if (q1 >= 200 && q1 < 300 && q2 >= 18) {
			float a1 = (q1 * 16) / 100;
			float a2 = q1 - a1;
			System.out.println("Your sum with discount: " + a2);
		} else if (q1 >= 200 && q1 < 300 && q2 < 18) {
			float a1 = (q1 * 9) / 100;
			float a2 = q1 - a1;
			System.out.println("Your sum with discount: " + a2);
		} else if (q1 >= 300 && q1 < 400) {
			float a1 = (q1 * 15) / 100;
			float a2 = q1 - a1;
			System.out.println("Your sum with discount: " + a2);
		} else if (q1 >= 400) {
			float a1 = (q1 * 20) / 100;
			float a2 = q1 - a1;
			System.out.println("Your sum with discount: " + a2);
		}
		sc.close();

	}

}
