package by.academy.strings;

import java.util.Scanner;

public class Task0 {

	public static void main(String[] args) {
//		 Ввести n строк с консоли, найти самую короткую и самую длинную строки. 
//		 Вывести найденные строки и их длину.
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter number of lines:");
		String minString = null;
		String maxString = null;
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("Enter string number " + (i + 1));
			String str = scan2.nextLine();
			if (i == 0) {
				minString = str;
				maxString = str;
			}
			if (minString.length() > str.length()) {
				minString = str;
			}
			if (maxString.length() < str.length()) {
				maxString = str;
			}

		}
		System.out.println("MIN LENGTH: " + minString.length() + " MIN STRING " + minString);
		System.out.println("MAX LENGTH: " + maxString.length() + " MAX STRING " + maxString);
		scan.close();
		scan2.close();
	}

}
