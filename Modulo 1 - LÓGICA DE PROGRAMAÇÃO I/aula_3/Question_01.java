package aula_3;

import java.util.Scanner;

public class Question_01 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		double[] notas = new double[4];
		double somaTotal = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
			somaTotal += notas[i];
		}
		scanner.close();
		if ((somaTotal / 4) >= 7) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}

	}
}
