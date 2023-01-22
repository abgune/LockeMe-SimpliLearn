package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {

	static String path = "src/files";

	public static void listFiles() {

		File[] files = new File(path).listFiles();

		List<String> list = new ArrayList<>();

		for (File file : files) {
			if (files.length != 0)
				// validate if item is a "normal" file
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

}
