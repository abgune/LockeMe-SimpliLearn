package main;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);

	public static void displayMenu() {

		
		System.out.println("Choose the options below: ");
		System.out.println("1. Show list of existing files.");
		System.out.println("2. Manipulate Files");
		System.out.println("3. Logout");
	}

	public void menuOperations() {
		System.out.println("Welcome Admin");
		while (true) {
			displayMenu();
			int input = sc.nextInt();

			switch (input) {

			case 1: System.out.println("List of all files desc order");
				break;
			case 2: System.out.println("List of all operations");
				break;
			case 3:
				System.out.println("Logging off");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option");
				System.out.println("");

			}
		}

	}
}
