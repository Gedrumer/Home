package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
//		Создайте массив из 4 случайных целых чисел из отрезка [10;99], 
//		выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
		Random rand = new Random();
		boolean q = true;
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10, 99);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1]) {
				q = false;
				break;
			}
		}
		if (q) {
			System.out.println("Array strictly increasing sequence");
		} else {
			System.out.println("Array not strictly increasing sequence");
		}

	}

}
