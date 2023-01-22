package main;

import java.util.Scanner;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static void displayMainMenu() {

		System.out.println("Choose the options below: ");
		System.out.println("1. Show list of existing files.");
		System.out.println("2. Manipulate Files");
		System.out.println("3. Logout");

		int input = sc.nextInt();

		mainMenuSwitch(input);
	}

	public static void mainMenuSwitch(int input) {
		// System.out.println("Welcome Admin");

		switch (input) {
		case 1:
			FileOperations fo = new FileOperations();
			fo.listFiles();
			break;
		case 2:
			operationsMenu();
			break;
		case 3:
			System.out.println("Logging off");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
			System.out.println("");

		}
		displayMainMenu();
	}

	public static void operationsMenu() {

		System.out.println("");
		System.out.println("1. Add new file");
		System.out.println("2. Delete existing file");
		System.out.println("3. Search file");
		System.out.println("0. Return to main menu");

		int input = sc.nextInt();
		operationsSwitch(input);

	}

	public static void operationsSwitch(int input) {

		switch (input) {

		case 1:
			FileOperations.addFile();
			break;
		case 2:
			FileOperations.removeFile();
			break;
		case 3:
			FileOperations.searchFile();
			break;
		case 0:
			displayMainMenu();
			break;
		default:
			System.out.println("Invalid option");
			System.out.println("");

		}
		operationsMenu();

	}

}
