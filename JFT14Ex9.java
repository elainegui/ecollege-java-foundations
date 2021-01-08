package eCollegeJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JFT14Ex9 {
	/*Java program that reads in the number of units sold of a product
	(in the last 12 months) from a text file named Sales.txt*/
	/*The program should calculate both the total number of units sold of the product and the average
	number sold per month. This information needs to be subsequently written to a text file named,
	‘Sales Summary.txt’.*/

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Elaine\\Desktop\\ecollege\\Sales.txt");

		try {
			//create the sales file
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write("10 20 35 56\n24 12 45 1\n80 43 23 45");
			writer.close();

			//sum the ints in the file
			Scanner sc = new Scanner(file);
			int sum = 0;
			int count = 0;
			while (sc.hasNextLine()) {
				sum += sc.nextInt();
				count++;
			}

			//create the sales summary file
			File fileSummary = new File("C:\\Users\\Elaine\\Desktop\\ecollege\\Sales Summary.txt");
			fileSummary.createNewFile();

			//write the total and average sales in summary
			FileWriter writerSummary = new FileWriter(fileSummary);
			writerSummary
					.write("Sales Total: " + sum + " Sales Average: " + String.format("%.2f", (double) sum / count));
			writerSummary.close();

		} catch (IOException ioe) {
			System.out.println("Exception caught. Unable to read file.");
		}

	}

}
