package com.game;

import java.util.Random;
import java.util.Scanner;

public class LetsPlay {

	private static final int A = 1;
	private static final int K = 11;
	private static final int Q = 12;
	private static final int J = 13;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		int[] cards1 = new int[] { A, 2, 3, 4, 5, 6, 7, 8, 9, 10, K, Q, J };
		int[] cards2 = new int[] { A, 2, 3, 4, 5, 6, 7, 8, 9, 10, K, Q, J };
		int[] cards3 = new int[] { A, 2, 3, 4, 5, 6, 7, 8, 9, 10, K, Q, J };
		int[] cards4 = new int[] { A, 2, 3, 4, 5, 6, 7, 8, 9, 10, K, Q, J };

		System.out.println("1.2Players \n2.4Players");
		int choose = s.nextInt();
		while (true) {
			switch (choose) {
			case 1:
				int car = new Random().nextInt(cards1.length);
				int car2 = new Random().nextInt(cards2.length);
				System.out.println("Player 1 Enter Your Name");
				String player1 = s.next();
				System.out.println("Player 2 Enter Your Name");
				String player2 = s.next();
				System.out.println(player1 +" " +car);
				System.out.println(player2 +" " +car2);
				if (car > car2) {
					System.out.println(player1 + " You Won");
				} else if (car == car2) {
					System.out.println("Equals");
				} else {
					System.out.println(player2 + " You Won");
				}
				break;
			case 2:
				int card1 = new Random().nextInt(cards1.length);
				int card2 = new Random().nextInt(cards2.length);
				int card3 = new Random().nextInt(cards3.length);
				int card4 = new Random().nextInt(cards4.length);
				System.out.println("Player 1 Enter Your Name");
				String players1 = s.next();
				System.out.println("Player 2 Enter Your Name");
				String players2 = s.next();
				System.out.println("Player 3 Enter Your Name");
				String players3 = s.next();
				System.out.println("Player 4 Enter Your Name");
				String players4 = s.next();
				System.out.println(players1 + "Your Card is" + card1);
				System.out.println(players2 + "Your Card is" + card2);
				System.out.println(players3 + "Your Card is" + card3);
				System.out.println(players4 + "Your Card is" + card4);
				if (card1 > card2 && card1 > card3 && card1 > card4) {
					System.out.println(players1 + " You Won");
				} else if (card2 > card3 && card2 > card4) {
					System.out.println(players2 + " You won");
				} else if (card3 > card4) {
					System.out.println(players3 + " You Won");
				} else {
					System.out.println(players4 + "You Won");
				}
				break;
			default:
				System.out.println("invalid");
				System.exit(0);
			}
		}
	}
}