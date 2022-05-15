package aula_6;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How long do you smoke(years)?");
		double yearsOfSmoke = scanner.nextDouble();
		System.out.println("How many cigarrets do you smoke a day?");
		int numberOfCigarettes = scanner.nextInt();
		System.out.println("How much does a pack of cigarette cost?");
		double pricePerPack = scanner.nextDouble();
		scanner.close();

		double moneySpent = (((yearsOfSmoke*365)*numberOfCigarettes)/20)*pricePerPack;
		System.out.println("You spent " + moneySpent + " Reais during that time on cigarettes");
	}
}
