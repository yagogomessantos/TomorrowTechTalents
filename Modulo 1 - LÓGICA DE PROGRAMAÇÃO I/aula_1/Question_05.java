package aula_1;

import java.util.Scanner;

public class Question_05 {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Type your salary: ");
		double salary = scanner.nextDouble();
		System.out.printf("Before the salary adjustment: %.2f\n", salary);
		System.out.printf("After the salary adjustment: %.2f", salary*1.07);
		
	}
}
