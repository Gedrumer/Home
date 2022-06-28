package by.academy.arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int arr[]=new int[50];
        int h=0;
        for(int i=0;i<=100;i++){
            if(i%2!=0){
                arr[h]=i;
                h++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
        /*System.out.println(Arrays.toString(arr));
         */
    }
}
