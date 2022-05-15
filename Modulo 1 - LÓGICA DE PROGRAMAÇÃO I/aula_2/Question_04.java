package aula_2;

import java.util.Scanner;

public class Question_04 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String arrayBeachNames[] = new String[5];
		double arrayBeachDistance[] = new double[5];
		double mostDistantBeachValue = arrayBeachDistance[0];
		String mostDistanBeachName ="";
		double sumTotalDistance = 0;
		int countHowMany = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Type the name of the beach  " + (i + 1));
			arrayBeachNames[i] = scanner.nextLine();
			System.out.println("Type the distance of the beach " + (i + 1));
			arrayBeachDistance[i] = scanner.nextDouble();
			scanner.nextLine();
			if (mostDistantBeachValue < arrayBeachDistance[i]) {
				mostDistantBeachValue = arrayBeachDistance[i];
				mostDistanBeachName = arrayBeachNames[i];
			}
			if (arrayBeachDistance[i] < 15 && arrayBeachDistance[i] > 10) {
				countHowMany++;
			}
			sumTotalDistance += arrayBeachDistance[i];
		}
		scanner.close();
		System.out.println("The most distant beach is: " + mostDistanBeachName);
		System.out.println("The number of beaches between 10km and 15km from the Hotel: " + countHowMany);
		System.out.printf("The average distance is: %.2f ", sumTotalDistance / 5);

	}

}
