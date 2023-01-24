package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {

	static String path = "src/files/";
	static Scanner sc = new Scanner(System.in);

	public void listFiles() {

		File[] files = new File(path).listFiles();

		List<String> list = new ArrayList<>();

		for (File file : files) {
			if (files.length != 0)
				// validate if item is a file
				if (!file.isFile()) {
					continue;
				}
			// add files into the list
			list.add(file.getName());
		}

		if (files.length == 0)
			// print message if folder is empty
			System.out.println("No files in directory");
		else
			// print list
			System.out.println("The list of files in the folder:");
		System.out.println();
		list.forEach(i -> System.out.println(i));
		System.out.println();

	}

	public static void addFile() {

		System.out.println("Enter file name: \n");
		File file = new File(path + sc.next());
		try {
			if (file.createNewFile())
				System.out.println("File: " + file.getName() + " created.");
			else
				System.out.println("File: " + file.getName() + " already exists.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void removeFile() {

		System.out.println("Enter file name: \n");

		File file = new File(path + sc.next());

		if (file.delete())
			System.out.println("File " + file.getName() + " delete successfully");
		else
			System.out.println("File " + file.getName() + " not found");

	}

	public static void searchFile() {

		System.out.println("Enter file name: \n");

		File file = new File(path + sc.next());
		
		if(file.exists()) 
			System.out.println("File " + file.getName() + " found");
		else
			System.out.println("File " + file.getName() + " not found");
		}

		
	}


