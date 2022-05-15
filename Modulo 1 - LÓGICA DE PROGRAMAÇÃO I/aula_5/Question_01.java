package aula_5;

import java.util.Random;

public class Question_01 {

	public static void main(String[] args) {

		Random random = new Random();
		double randomArray[] = new double[10];
		double numberRandom;

		for (int i = 0; i < 10; i++) {
			numberRandom = random.nextDouble() * 100;
			randomArray[i] = numberRandom;
		}

		System.out.println("The values of the random array: ");
		for (int j = 0; j < 10; j++) {
			System.out.println(randomArray[j]);
		}

	}
}
