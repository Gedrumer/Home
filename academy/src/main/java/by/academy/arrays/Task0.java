package by.academy.arrays;

import java.util.Arrays;

public class Task0 {
	public static void main(String[] args) {
		int arr1[] = new int[10];
		int j = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				arr1[j] = i;

				j++;
			}
		}
		System.out.println(Arrays.toString(arr1));

		for (int h = 0; h < arr1.length; h++) {
			j++;
			System.out.println(arr1[h]);

		}

	}
}
