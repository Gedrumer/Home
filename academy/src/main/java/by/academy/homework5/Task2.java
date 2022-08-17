package by.academy.homework5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int max = 1_000_000;
		int n = 100_000;
		ArrayList<Integer> list1 = new ArrayList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			list1.add(rand.nextInt(max));
		}
		System.out.println("Arralist");
		System.out.println(System.currentTimeMillis() - startTime1);
		long startTime3 = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			list2.add(rand.nextInt(max));
		}
		System.out.println("Linkedlist");
		System.out.println(System.currentTimeMillis() - startTime3);
		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			list1.get(rand.nextInt(n));
		}
		System.out.println("Arralist get");
		System.out.println(System.currentTimeMillis() - startTime2);
		long startTime4 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			list2.get(rand.nextInt(n));
		}
		System.out.println("Linkedlist get");
		System.out.println(System.currentTimeMillis() - startTime4);
	}

}
