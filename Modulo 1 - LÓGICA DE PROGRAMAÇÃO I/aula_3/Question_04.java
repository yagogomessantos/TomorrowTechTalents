package aula_3;

import java.util.Scanner;

public class Question_04 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		int[] arrayInteiros = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o número " + (i + 1));
			arrayInteiros[i] = scanner.nextInt();
			scanner.nextLine();
		}
		scanner.close();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (arrayInteiros[i] < arrayInteiros[j]) {
					int auxiliarTemporario = arrayInteiros[i];
					arrayInteiros[i] = arrayInteiros[j];
					arrayInteiros[j] = auxiliarTemporario;
				}
			}
		}
		System.out.println("\nOrdem Decrescente:");
		for (int i = 4; i >= 0; i--) {
			System.out.println(arrayInteiros[i]);
		}

	}

}
