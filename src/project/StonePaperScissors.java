package project;

import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String playerChoice;
		String computerChoice;
		String playAgain = "yes";
		int total = 0;
		int win = 0;
		int lose = 0;
		int tie = 0;

		System.out.println("***************************");
		System.out.println("* ROCK PAPER SCISSOR GAME *");
		System.out.println("***************************\n");

		String[] choice = { "rock", "paper", "scissor" };

		do {
			System.out.print("Enter a Choice (Rock, Paper, Scissor): ");
			playerChoice = sc.nextLine().toLowerCase().trim();

			if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")) {
				System.out.println("Invalid Move");
				continue;
			}

			computerChoice = choice[random.nextInt(0, 3)];
			System.out.println("Computer choice: " + computerChoice + "\n");

			if (playerChoice.equals(computerChoice)) {
				System.out.println("It is tie");
				tie++;
			} else if ((playerChoice.equals("rock") && computerChoice.equals("scissor"))
					|| (playerChoice.equals("paper") && computerChoice.equals("rock"))
					|| (playerChoice.equals("scissor") && computerChoice.equals("paper"))) {
				System.out.println("You win");
				win++;
			} else {
				System.out.println("You Lose");
				lose++;
			}
			total++;

			System.out.print("Play Again (Yes/No): ");
			playAgain = sc.nextLine().toLowerCase().trim();

			while (!playAgain.equals("yes") && !playAgain.equals("no")) {
				System.out.print("Invalid Input Please Enter (yes/no): ");
				playAgain = sc.nextLine().toLowerCase().trim();
			}

		} while (playAgain.equals("yes"));

		System.out.println("\n===== GAME SUMMARY =====");
		System.out.println("Total Games : " + total);
		System.out.println("Wins        : " + win);
		System.out.println("Losses      : " + lose);
		System.out.println("Ties        : " + tie);
		System.out.println("\nThanks For Playing...");

	}
}