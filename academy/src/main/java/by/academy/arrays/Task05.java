package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][] arr1=new int [5][2];
		int[][] arr = new int[5][8];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i][0];
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.print("MAX " + max + " MIN " + min + " \n");
			arr1[i][0]=max;
			arr1[i][1]=min;
			
		}
		System.out.println(Arrays.deepToString(arr1));
	}
}
