package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
//		Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
//		Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
//		Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
		Random rand = new Random();
		int[] arr1 = new int[11];
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rand.nextInt(-1, 1);
			if (arr1[i] == 0)
				a1++;
			if (arr1[i] < 0)
				a2++;
			if (arr1[i] > 0)
				a3++;
			if (i == arr1.length - 1) {
				if (a1 > a2 && a1 > a3) {
					System.out.println("Most often found 0");
				}
				if (a2 > a1 & a2 > a3) {
					System.out.println("Most often found -1");
				}
				if (a3 > a1 && a3 > a2) {
					System.out.println("Most often found 1");
				}

			}
		}
		System.out.println("First array: " + Arrays.toString(arr1));

	}

}
