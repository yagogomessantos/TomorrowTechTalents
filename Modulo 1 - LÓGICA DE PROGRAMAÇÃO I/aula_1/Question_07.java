package aula_1;

import java.util.Scanner;


public class Question_07 {
	public static Scanner scanner ;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("Type the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Type the second number: ");
		int secondNumber = scanner.nextInt();
		scanner.close();
		
		System.out.println("\n----------------------");
		System.out.println("\nResult:");
		System.out.println("\nAddition: " + firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
		System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
		System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
		System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + ((double)firstNumber/(double)secondNumber));

	}

}
