package aula_3;

import java.util.Scanner;

public class Question_02 {

	public static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		while (true) {
			System.out.println("------------------");
			System.out.println("Digite um n�mero: ");
			int numero = scanner.nextInt();
			scanner.nextLine();
			if (numero < 0) {
				System.out.println("Numero � negativo\n");
			} else if (numero > 0) {
				System.out.println("Numero � positivo\n");
			} else if (numero == 0) {
				System.out.println("Fim");
				break;
			}
		}
		scanner.close();

	}

}
