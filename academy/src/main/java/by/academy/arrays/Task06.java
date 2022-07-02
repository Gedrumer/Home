package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr=new int [5];
		int []arr1 = new int [5];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			sum=sum+arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		int average=sum/arr.length;
		System.out.println(average);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<average) {
				arr1[i]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
