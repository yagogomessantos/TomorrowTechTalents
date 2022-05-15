package aula_5;

public class Question_03 {

	public static double array2D[][] = { { 10.0, 97.0, 5.1, 96, 8 }, { 9.0, 85.0, 63.2, 15 }, { 52.3, 2.3, 12.3, 12 },
			{ 52.3, 2.3, 12.3, 12 } };

	public static void main(String[] args) {
		System.out.println("The biggest number is: " + returnTheMaxNumber(array2D));
	}

	public static double returnTheMaxNumber(double[][] array2d) {
		double maxNumber = array2d[0][0];
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (maxNumber < array2d[i][j]) {
					maxNumber = array2d[i][j];
				}
			}
		}
		return maxNumber;
	}

}
