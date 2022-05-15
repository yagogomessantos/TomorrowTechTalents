package aula_2;

import java.util.Scanner;

public class Question_01 {

	public static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("Type your name: ");
		String name = scanner.nextLine();
		System.out.println("Type your class Id: ");
		String classId = scanner.nextLine();
		double arrayGrade[] = new double[3];
		double averageGrade = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Type the grade " + (i + 1 ) + ":");
			arrayGrade[i] = scanner.nextDouble();
			averageGrade += arrayGrade[i];
		}
		System.out.println("The student: " + name + " Class id:" + classId);
		System.out.println("Your average grade is: " + averageGrade/3);

	}

}
