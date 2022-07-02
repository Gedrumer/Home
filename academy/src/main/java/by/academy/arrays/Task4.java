package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
//    	Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, 
//    	выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, 
//    	для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
    	Random rand=new Random();
    	int[] q=new int[5];
    	int[] w=new int[5];
    	int sum=0;
    	int sum1=0;
    	for(int i=0;i<q.length;i++) {
    		q[i]=rand.nextInt(0,5);
    		w[i]=rand.nextInt(0,5);
    		sum=sum+q[i];
    		sum1=sum1+w[i];
    	}
    	System.out.println(Arrays.toString(q));
    	System.out.println(Arrays.toString(w));
    	System.out.println("Average first array "+sum);
    	System.out.println("Average second array "+sum1);
    	if (sum>sum1) {
    		System.out.println("Average sum first array bigger than average sum second array");
    	}else if (sum<sum1) {
    		System.out.println("Average sum second array bigger than average sum first array");
    	}else if (sum==sum1) {
    		System.out.println("Average sum first array equals average sum second array");
    	}
    	
    }
}
