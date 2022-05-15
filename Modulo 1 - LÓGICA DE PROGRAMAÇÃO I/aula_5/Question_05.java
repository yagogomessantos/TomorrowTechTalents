package aula_5;

import java.util.Scanner;

public class Question_05 {
	public static double array2D[][] = { { 10.0, 2.0, 5.1, 96 }, { 9.0, 85.0, 63.2, 15 }, { 52.3, 2.3, 12.3, 12 },
			{ 52.3, 2.3, 12.3, 12 } };

	public static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Type the number of the column(1 - 4): ");
		int rowPosition = scanner.nextInt();
		System.out.println(
				"The total Average of the row " + "" + rowPosition + " is: " + returnTheAverage(array2D, rowPosition-1));
	}

	public static double returnTheAverage(double[][] array2d, int row) {
		double sum = 0;
		for (int j = 0; j < array2d[row].length; j++) {
			sum += array2d[row][j];
		}
		return sum / array2d[row].length;
	}
}
