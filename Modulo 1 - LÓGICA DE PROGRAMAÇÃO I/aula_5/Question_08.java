package aula_5;

import java.util.Scanner;

public class Question_08 {

	public static Scanner scanner = new Scanner(System.in);
	public static int array[] = new int[10];

	public static void main(String[] args) {

		for(int i = 0; i<10; i++) {
			System.out.println("Type the number " + (i+1));
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println("The number you want to search: ");
		for(int i = 0; i<10; i++) {
			if(array[i] == scanner.nextInt()) {
				System.out.println("The value exists in the set");
			} else {
				System.out.println("--");
			}
		}
	}

}
