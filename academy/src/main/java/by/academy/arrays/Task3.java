package by.academy.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int arr[]=new int [8];
        int h=0;
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]= rand.nextInt(1,10);
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2!=0){
                arr[j]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
