package by.academy.homework2;

import java.util.Scanner;

public class Deal {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		String[] cover = { "Heart", "Spider", "Diamond", "Club" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int cards = cover.length * rank.length;
		int players = 0;

		String[] number = new String[cards];
		System.out.println("Enter number of players ");
		players = sc.nextInt();

		for (int i = 0; i < cover.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				number[i * rank.length + j] = cover[i] + " " + rank[j];
			}
		}

		for (int i = 0; i < cards; i++) {
			int indexRandom = (int) (Math.random() * cards);
			String wordRandom = number[indexRandom];
			number[indexRandom] = number[i];
			number[i] = wordRandom;
		}
		for (int i = 0; i < players * 5; i++) {
			if (i % 5 == 0 || i == players * 5 + 1) {
				System.out.print("\nCards " + (i / 5 + 1) + "-player: ");
			}
			System.out.print(number[i] + "; ");
		}
	}
}
