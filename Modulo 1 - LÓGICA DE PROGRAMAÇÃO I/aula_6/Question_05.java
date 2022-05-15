package aula_6;

import java.util.Scanner;

public class Question_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] agenda = new String[5][3];
		int optionsMenu = 0;

		while (true) {
			System.out.println("\n(1) Add a contact");
			System.out.println("(2) Remove a contact ");
			System.out.println("(3) Exit");
			optionsMenu = scanner.nextInt();
			scanner.nextLine();
			if (optionsMenu == 3) {
				break;
			}
			if (optionsMenu == 1) {
				int freePosition = -1;
				for (int i = 0; i < agenda.length; i++) {
					for (int j = 0; j < agenda[i].length; j++) {
						if (agenda[i][j] == (null)) {
							freePosition = i;
							break;
						}
					}
					if (freePosition != -1) {
						break;
					}
				}
				if (freePosition == -1) {
					System.out.println("Agenda is full. You need to remove a contact to add");
				} else {
					System.out.println("Type the code: ");
					agenda[freePosition][0] = scanner.nextLine();
					System.out.println("Type the number: ");
					agenda[freePosition][1] = scanner.nextLine();
					System.out.println("Type the age: ");
					agenda[freePosition][2] = scanner.nextLine();
				}
				System.out.println("-----------AGENDA------------\nCode ----- Number ----- Age");
				for (String[] contact : agenda) {
					boolean printController = false;
					for (String value : contact) {
						if(value == null) {
							continue;
						}
						System.out.printf(value + "      ");
						printController = true;
					}
					if (printController) {
						System.out.println("");
					}
				}
			}
			if (optionsMenu == 2) {
				System.out.println("Type the code of the contact to remove: ");
				String code = scanner.nextLine();
				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i][0] == (null)) {
						System.out.println("There is no contact with this code");
						break;
					} else if (agenda[i][0].equals(code)) {
						agenda[i][0] = null;
						agenda[i][1] = null;
						agenda[i][2] = null;
						break;
					}
				}
			}
		}
		scanner.close();
	}
}
