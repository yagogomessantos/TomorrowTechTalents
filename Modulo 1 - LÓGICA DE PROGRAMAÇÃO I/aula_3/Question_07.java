package aula_3;

import java.util.Scanner;

public class Question_07 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		scanner.nextLine();
		int fatorial = numero;
		numero--;
		if (numero == 0) {
			System.out.println("Fatorial: " + 0);
		}
		while (numero > 0) {
			fatorial *= numero;
			numero--;
		}
		System.out.println("Fatorial: " + fatorial);
	}
}
