package aula_3;

import java.util.Scanner;

public class Question_02 {

	public static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		while (true) {
			System.out.println("------------------");
			System.out.println("Digite um número: ");
			int numero = scanner.nextInt();
			scanner.nextLine();
			if (numero < 0) {
				System.out.println("Numero é negativo\n");
			} else if (numero > 0) {
				System.out.println("Numero é positivo\n");
			} else if (numero == 0) {
				System.out.println("Fim");
				break;
			}
		}
		scanner.close();

	}

}
