package eCollegeJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JFT14Ex10 {

	public static void main(String[] args) {
		try {
			methodA();
			System.out.println("Message written to text file.");
		} catch (IOException ioe) {
			System.out.println("Unable to write to the file at this time");
		}

	}

	static void methodA() throws IOException {
		methodB();
	}

	static void methodB() throws IOException {

		File file = new File("C:\\Users\\Elaine\\Desktop\\ecollege\\Output.txt");
		file.createNewFile();

		FileWriter writer = new FileWriter(file);
		writer.write("I am learning Java programming");
		writer.close();

	}
}
