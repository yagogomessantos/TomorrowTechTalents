package aula_5;

public class Question_04 {
	public static double array2D[][] = { { 10.0, 2.0, 5.1, 96, 8 }, { 9.0, 85.0, 63.2, 15 }, { 52.3, 2.3, 12.3, 12 },
			{ 52.3, 2.3, 12.3, 12 } };

	public static void main(String[] args) {
		System.out.println("The total Summ  is: " + returnTheTotalSumm(array2D));
	}

	public static double returnTheTotalSumm(double[][] array2d) {
		double sum = 0;
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				sum += array2d[i][j];
			}
		}
		return sum;
	}

}
