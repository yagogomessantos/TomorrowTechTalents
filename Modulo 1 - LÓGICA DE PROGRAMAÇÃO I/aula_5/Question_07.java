package aula_5;

import java.util.Random;
import java.util.Scanner;

public class Question_07 {

	public static char StudentsAnswer[][] = new char[10][10];
	public static Scanner scanner = new Scanner(System.in);
	public static char AnswerSheet[] = new char[10];

	public static void main(String[] args) {

		System.out.println("Type the letters correponding to the Answer Sheet(10 questions) separated by space: ");
		for (int k = 0; k < 10; k++) {
			AnswerSheet[k] = scanner.next().toUpperCase().charAt(0);
		}
		for(int k =0; k <10; k++) {
			System.out.printf("" +AnswerSheet[k]);
		}

		Random random = new Random();
		char randomChar = (char) (random.nextInt(5) + 65);
		int countRightAnswers = 0;
		for (int i = 0; i < StudentsAnswer.length; i++) {
			for (int j = 0; j < StudentsAnswer[i].length; j++) {
				StudentsAnswer[i][j] = randomChar;
				randomChar = (char) (random.nextInt(5) + 65);
				if(AnswerSheet[j] ==StudentsAnswer[i][j]) {
					countRightAnswers++;
				}
			}
			System.out.printf("\nStudent " + (i+1) + " - Right Questions: " + countRightAnswers);
			if(countRightAnswers < 6) {
				System.out.print(" - FAILED THE TEST");
			} else {
				System.out.print(" - PASSED THE TEST");
			}
			countRightAnswers = 0;
		}
	}
}










