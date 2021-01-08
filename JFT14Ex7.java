package eCollegeJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JFT14Ex7 {

	public static void main(String[] args) {
		writeToFile();

	}

	static void writeToFile() {
		//create a file
		File myFile = new File("C:\\Users\\Elaine\\Desktop\\ecollege\\MyPoem.txt");
		try {
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println(myFile.getName() + " already exists.");
			}

			//write to a file
			FileWriter writer = new FileWriter("C:\\Users\\Elaine\\Desktop\\MyPoem.txt");
			writer.write("The quick brown fox jumped over the moon.\n"
					+ "As he leapt, he looked back over his shoulder and cried aloud,\n" + "Hello World!");
			writer.close();

			System.out.println("Success!");

		} catch (IOException ioe) {
			System.out.println("Unable to write the file at this time");
			ioe.printStackTrace();
		}
	}
}
