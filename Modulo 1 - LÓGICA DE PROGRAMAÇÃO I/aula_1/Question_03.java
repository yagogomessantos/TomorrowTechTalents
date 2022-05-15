package aula_1;

import java.util.Scanner;

public class Question_03 {
	
	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("Type the amount of loan you want: ");
		double loan = scanner.nextDouble();
		System.out.println("How many months you will repay? ");
		int months = scanner.nextInt();
		scanner.close();
		
		System.out.printf("The Compound interest is: %f", loan * Math.pow((1.02),months));
		
	}

}
