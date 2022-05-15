package aula_3;

import java.util.Scanner;

public class Question_03 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		int contador = 1;
		while (contador <= 100) {
			if (contador % 10 == 0) {
				System.out.println(contador + "  Múltiplo de 10");
				contador++;
				continue;
			}
			System.out.println(contador);
			contador++;
		}

	}

}
