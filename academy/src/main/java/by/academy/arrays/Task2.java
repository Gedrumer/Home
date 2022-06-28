package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int arr[]=new int [15];
        int h=0;
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]= rand.nextInt(0,9);
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                h++;
            }
        }
        System.out.println("Sum = "+h);
    }
}
