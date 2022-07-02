package by.academy.operators;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Ввести с консоли 2 числа, найти большее, меньшее,
//		среднее арифметическое.
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter first number:");
		int q1=sc.nextInt();
		System.out.println("Enter second number:");
		int q2=sc.nextInt();
		if(q1<q2) {
			System.out.println("Number "+q1+" < number "+q2);
			sum=(q1+q2)/2;
			System.out.println("Average: "+sum);
		}else if (q1>q2) {
			System.out.println("Number "+q1+" > number "+q2);
			sum=(q1+q2)/2;
			System.out.println("Average: "+sum);
		}else if (q1==q2) {
			System.out.println("Number "+q1+" equals number "+q2);
			sum=(q1+q2)/2;
			System.out.println("Average: "+sum);
		}
		sc.close();
		

	}

}
