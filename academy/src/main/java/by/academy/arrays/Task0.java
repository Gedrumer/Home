package by.academy.homework2;

import java.util.Arrays;

public class Task0 {
    public static void main(String[] args) {
        int  arr1[]=new int[9];
        int j=0;
    int[] arr= {2,4,6,8,10,12,14,16,18,20};
    System.out.println(Arrays.toString(arr));
    for(int i=1;i<=20;i++){
        if(i%2==0){
            arr1[j]=i;
            j++;
        }
    }System.out.println(Arrays.toString(arr1));
    for(int h=0;h<=arr1.length;h++){
        System.out.println(arr1[h]);
    }

    


    }
}
