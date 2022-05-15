package aula_1;

import java.util.Scanner;

public class Question_04 {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("Type your age: ");
		int age = scanner.nextInt();
		scanner.close();
		
		System.out.printf("You have %d days",age*365);
		
		
	}
	
	
}
