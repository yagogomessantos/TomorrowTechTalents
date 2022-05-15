package aula_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Question_06 {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Type the amount of money (Brazilian Reais):  ");
		BigDecimal valueInReal = new BigDecimal(scanner.nextLine());
		scanner.close();
		
		BigDecimal britishPoundToReal = new BigDecimal("6.12701");
		BigDecimal euroToReal = new BigDecimal("5.10804");
		BigDecimal usDollarToReal = new BigDecimal("4.7048877");
		
		System.out.printf("The value %.2f Reais to US Dollar is: $%.2f\n",valueInReal,valueInReal.divide(usDollarToReal, RoundingMode.HALF_UP));
		System.out.printf("The value %.2f Reais to Euro is: €%.2f\n",valueInReal,valueInReal.divide(euroToReal, RoundingMode.HALF_UP));
		System.out.printf("The value %.2f Reais to British Pound sterlin is: £%.2f\n",valueInReal,valueInReal.divide(britishPoundToReal, RoundingMode.HALF_UP));
		
	}
	
	
	
	
}
