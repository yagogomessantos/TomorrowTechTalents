package aula_5;

import java.util.Random;

public class Question_09 {

	public static int array[][] = new int[3][5];
	public static int sumOfRowsInArray[] = new int[3];
	public static int sumOfColumnsInArray[] = new int[5];

	public static void main(String[] args) {

		int sumOfRows = 0;
		int sumOfColumns = 0;

		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
				sumOfRows += array[i][j];
			}
			sumOfRowsInArray[i] = sumOfRows;
			sumOfRows = 0;
		}
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				sumOfColumns += array[j][i];
			}
			sumOfColumnsInArray[i] = sumOfColumns;
			sumOfColumns = 0;
		}
		System.out.println("The array: \n");
		for (int[] array : array) {
			boolean formaterControl = false;
			for (int value : array) {
				System.out.printf(value + " ");
				formaterControl = true;
			}
			if (formaterControl) {
				System.out.println("");
			}
		}
		System.out.println("");
		for (int k = 0; k < sumOfRowsInArray.length; k++) {
			System.out.println("The sum of Row " + (k + 1) + ": " + sumOfRowsInArray[k]);
		}
		System.out.println("");
		for (int l = 0; l < sumOfColumnsInArray.length; l++) {
			System.out.println("The sum of Column " + (l + 1) + ": " + sumOfColumnsInArray[l]);
		}
	}

}
