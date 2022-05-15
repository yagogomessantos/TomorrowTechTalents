package aula_5;

import java.util.Random;
import java.util.Scanner;

public class Question_06 {

	public static Random random = new Random();
	public static Scanner scanner = new Scanner(System.in);
	public static int answerTemplate[] = new int[13];
	public static int arrayOfBets[][] = new int[3][13];
	public static int arrayOfResultsByPlayer[] = new int[3];

	public static void main(String[] args) {

		for (int i = 0; i < 13; i++) {
			answerTemplate[i] = random.nextInt(3) + 1;
		}
		int numberPlayers = 0;
		int countingMatchResults = 0;
		while (numberPlayers < 3) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("\n---------------------");
				System.out.println("\nPlayer" + (numberPlayers + 1) + " numbers ");
				countingMatchResults = 0;
				for (int j = 0; j < 13; j++) {
					System.out.println("Player" + (numberPlayers + 1) + " number " + (j + 1) + ": ");
					arrayOfBets[i][j] = scanner.nextInt();
					scanner.nextLine();
					if (arrayOfBets[i][j] == answerTemplate[j]) {
						arrayOfResultsByPlayer[i] = ++countingMatchResults;
					}
				}
				numberPlayers++;
			}
		}
		System.out.println("\nThe correct Template: ");
		for (int i = 0; i < 13; i++) {
			System.out.printf(answerTemplate[i] + " ");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("\n\nPlayer" + (i + 1) + ": ");
			if(arrayOfResultsByPlayer[i] == 13) {
				System.out.println("Winner");
			}
			System.out.println("Right Numbers: "+arrayOfResultsByPlayer[i] + " ");
			for (int j = 0; j < 13; j++) {
				System.out.printf(arrayOfBets[i][j] + " ");
			}
		}
	}

}
