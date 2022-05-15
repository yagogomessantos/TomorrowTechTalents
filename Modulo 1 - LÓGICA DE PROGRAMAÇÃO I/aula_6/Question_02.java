package aula_6;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much do you earn per hour (R$) ? ");
		double salaryPerHour = scanner.nextDouble();
		System.out.println("Number of hours worked in the month ? ");
		double hoursWorkedPerMonth = scanner.nextDouble();
		scanner.close();
		double monthCompensation = salaryPerHour * hoursWorkedPerMonth;

		System.out.println("\nCompensation with no Taxes: R$" + monthCompensation);
		System.out.println("FGTS: R$" + 0.11 * monthCompensation);
		System.out.println("Taxes from labor union: R$" + 0.03 * monthCompensation);

		double taxFromIR = 0;
		if (monthCompensation <= 900) {
			System.out.println("IR: R$0,00");
			taxFromIR = 0;
		} else if (monthCompensation <= 1500) {
			taxFromIR = 0.05 * monthCompensation;
			System.out.println("IR: R$" + taxFromIR);
		} else if (monthCompensation <= 2500) {
			taxFromIR = 0.1 * monthCompensation;
			System.out.println("IR: R$" + taxFromIR);
		} else {
			taxFromIR = 0.2 * monthCompensation;
			System.out.println("IR: R$" + taxFromIR);
		}

		double finalCompensationPerMonth = (monthCompensation - (0.03 * monthCompensation)) - taxFromIR;
		System.out.println("Final Compensation: R$" + finalCompensationPerMonth);
	}
}
