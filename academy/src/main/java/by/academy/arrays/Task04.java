package by.academy.arrays;

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		char[][] arr = new char[4][2];
		for (int i = 0; i < arr.length; i++) {
			for (char j = 0; j < arr[i].length; j++) {
				arr[i][j] = (char) (j + 1);
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
