package aula_6;

import java.util.Scanner;

public class Question_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] answerArray = new String[5];
		System.out.println("Telefonou para a v�tima?");
		answerArray[0] = scanner.nextLine().toUpperCase();
		System.out.println("Esteve no local do crime?");
		answerArray[1] = scanner.nextLine().toUpperCase();
		System.out.println("Mora perto da v�tima?");
		answerArray[2] = scanner.nextLine().toUpperCase();
		System.out.println("Devia para a v�tima?");
		answerArray[3] = scanner.nextLine().toUpperCase();
		System.out.println("J� trabalhou com a v�tima? ");
		answerArray[4] = scanner.nextLine().toUpperCase();
		scanner.close();
		int counter = 0;
		for (int i = 0; i < answerArray.length; i++) {
			if (answerArray[i].equals("SIM")) {
				counter++;
			}
		}
		if (counter == 2) {
			System.out.println("Suspeito");
		} else if (counter == 3 || counter == 4) {
			System.out.println("C�mplice");
		} else if (counter == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}

	}

}
