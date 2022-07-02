package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task7 {

	public static void main(String[] args) {
//		Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. 
//		Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
		Random rand = new Random();
		int max = 0;
		int index = 0;
		int[] arr = new int[12];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(-15, 15);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Max number: "+max+" and index: "+index);

	}
}
