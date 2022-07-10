package by.academy.strings;

import java.util.Arrays;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
//		Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) 
//		значений их длины.
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int q = scan.nextInt();
		String[] str1 = new String[q];
		for (int i = 0; i < str1.length; i++) {
			System.out.println("Enter string number " + (i + 1));
			String str = scan2.nextLine();
			str1[i] = str;
		}
		System.out.println(Arrays.toString(str1));
		Arrays.sort(str1);// в порядке возрастания
		System.out.println("SORT" + Arrays.toString(str1));

		scan.close();
		scan2.close();
	}

}
