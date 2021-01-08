package eCollegeJava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JFT14Ex8 {
//reading the content of a file

	public static void main(String[] args) {

		//create a file object
		File fileToRead = new File("C:\\Users\\Elaine\\Desktop\\ecollege\\MyPoem.txt");

		try {
			//read the file
			Scanner sc = new Scanner(fileToRead);

			//output the contents
			while (sc.hasNextLine()) {
				String output = sc.nextLine();
				System.out.println(output);
			}
			System.out.println("The contents of the file had been successfully read!");

		} catch (IOException ioe) {
			System.out.println("Unable to read from the file at this time.");
		}

	}

}
