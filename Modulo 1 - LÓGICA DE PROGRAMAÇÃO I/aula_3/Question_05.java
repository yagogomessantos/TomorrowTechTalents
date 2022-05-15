package aula_3;

import java.util.Scanner;

public class Question_05 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Digite o peso");
		double peso = scanner.nextDouble();
		System.out.println("Digite a altura");
		double altura = scanner.nextDouble();
		double imc = peso / (altura * altura);
		System.out.println(imc);
		if (imc < 18.5) {
			System.out.println("abaixo do peso");
		} else if (imc <= 24.9) {
			System.out.println("Peso normal");
		} else if (imc < 29.9) {
			System.out.println("Excesso de Peso");
		} else {
			System.out.println("Obeso");
		}
	}

}
