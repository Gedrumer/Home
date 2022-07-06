package by.academy.classworks.classwork3;

import java.util.Arrays;

public class ArrayTask2 {

	public static void main(String[] args) {
		int array[]=new int[50];
		for (int i = 0; i < array.length; i++) {
			if (i%2==1) {
				array[i]=i;
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
