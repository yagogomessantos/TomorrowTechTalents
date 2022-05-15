package aula_6;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the maximum speed on the highway ?");
		double maximumSpeed = scanner.nextDouble();
		System.out.println("How fast were you driving ? ");
		double driverSpeed = scanner.nextDouble();
		scanner.close();

		double speedDifference = driverSpeed - maximumSpeed;
		if (speedDifference <= 0) {
			System.out.println("No speeding Ticket. Congratulations!!");
		} else if (speedDifference <= 10) {
			System.out.println("Your overspeeding penalty : R$ 50.00");

		} else if (speedDifference <= 30) {
			System.out.println("Your overspeeding penalty : R$ 100.00");

		} else {
			System.out.println("Your overspeeding penalty : R$ 200.00");

		}

	}

}
