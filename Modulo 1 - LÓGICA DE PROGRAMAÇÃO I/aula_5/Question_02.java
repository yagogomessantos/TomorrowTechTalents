package aula_5;

import java.util.Scanner;

public class Question_02 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		double randomArray2D[][] = new double[2][5];
		int numberAssistantToPrint = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Type the number " + (numberAssistantToPrint + 1));
				randomArray2D[i][j] = scanner.nextDouble();
				numberAssistantToPrint++;
			}
		}
		System.out.println("The Array-2d is: ");
		for (int j = 0; j < 5; j++) {
			System.out.printf(randomArray2D[0][j] + " ");
		}
		System.out.println();
		for (int k = 0; k < 5; k++) {
			System.out.printf(randomArray2D[1][k] + " ");
		}
	}

}
