package aula_1;

import java.util.Scanner;

public class Question_02 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Type how many kilograms: ");
		double massInKilograms = scanner.nextDouble();
		System.out.println("Type the hight in meters:");
		double hightInMeters = scanner.nextDouble();
		System.out.println("Type the time in seconds:");
		double timeInSeconds = scanner.nextDouble();
		scanner.close();
		
		double horsePower = (massInKilograms * (hightInMeters / timeInSeconds) ) / 745.6999;
		
		System.out.printf("The HorsePower is: %f watts ", horsePower);
	}
	
	
	
}
