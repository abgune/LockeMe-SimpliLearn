package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static int getInput() {
		int input;

		while (true) {
			try {
				//System.out.println("Please enter a number");
				input = sc.nextInt();
				break;

			} catch (InputMismatchException error) {

				System.err.println("Not a valid input, please enter a number:");
				sc.next();
				continue;
			}
		}
		return input;
	}

	public static void info() {
		System.out.println();
		System.out.println("*****************LockedMe.com*******************");
		System.out.println("**The application is designed to manage files.**");
		System.out.println("************************************************");
		System.out.println("***********Developed by Abilio Junior***********\n");
	}
	
	
	public static void displayMainMenu() {

		System.out.println("Choose the options below: ");
		System.out.println("1. Show list of existing files.");
		System.out.println("2. Manipulate Files");
		System.out.println("3. Logout");

		mainMenuSwitch(getInput());

	}

	public static void mainMenuSwitch(int input) {
	
		switch (input) {
		case 1:
			FileOperations.listFiles();
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
			
		}
		displayMainMenu();
	}

	public static void operationsMenu() {

		System.out.println("");
		System.out.println("Choose the options below: ");
		System.out.println("1. Add new file");
		System.out.println("2. Delete existing file");
		System.out.println("3. Search file");
		System.out.println("0. Return to main menu");

		operationsSwitch(getInput());

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

			System.err.println("Invalid option /n");
			System.out.println("");

		}
		operationsMenu();

	}

}
