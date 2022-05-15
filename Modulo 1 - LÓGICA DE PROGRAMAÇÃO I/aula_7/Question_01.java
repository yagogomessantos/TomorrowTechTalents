package aula_7;

import java.util.ArrayList;
import java.util.List;

public class Question_01 {

	public static void main(String[] args) {
		String test = "yago";
		System.out.printf("%-50s ------", test);
		
		ArrayList<String> lista  = new ArrayList<>();
		lista.add(test);
		lista.trimToSize();

	

	}
}
