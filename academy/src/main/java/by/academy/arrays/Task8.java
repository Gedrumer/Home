package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task8 {

	public static void main(String[] args) { 
// Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. 
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом. 
// Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

		Random rand=new Random();
		int[] arr1=new int[10];
		int[] arr2=new int[10];
		double[] arr3= new double[10];
		int required=0;
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rand.nextInt(1,9);
			arr2[i] = rand.nextInt(1,9);
			arr3[i]=(double)arr1[i]/arr2[i];
		}
		System.out.println("First array: " + Arrays.toString(arr1));
		System.out.println("Second array: "+Arrays.toString(arr2));
		System.out.println("Third array: "+Arrays.toString(arr3));
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]%1==0) {
				required++;	
			}
		}
		System.out.println("Number of required elements: "+required);
		
		
	}

}
