package aula_1;

import java.util.Scanner;

public class Question_01 {

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Type the temperature in Celsius degrees");
		double celsiusTemperature = scanner.nextDouble();
		scanner.close();
		System.out.printf("The conversion to kelvin = %.2f \n", celsiusTemperature + 273.15);
		System.out.printf("The conversion to Fahrenheit = %.2f \n", celsiusTemperature * 1.8 + 32);
		System.out.printf("The conversion to Rankine = %.2f \n", celsiusTemperature * 1.8 + 32 + 459.67);
		System.out.printf("The conversion to Réaumur = %.2f \n", celsiusTemperature * 0.8);
	
	}

}
