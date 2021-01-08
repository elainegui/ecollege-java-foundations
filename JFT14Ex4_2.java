package eCollegeJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JFT14Ex4_2 {
	public static void main(String[] args) {

		//array
		String[] names = { "Cork", "Athlone", "Limerick", "Sligo", "Dublin" };

		//offer
		System.out.println("The following holiday destinations are available.");

		//print the destinations
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ": " + names[i]);
		}

		//user keyboard input object
		Scanner scanner = new Scanner(System.in);
		int destNo = 0;

		//is the input data correct?
		boolean inputCorrect = false;

		//loop while you get correct input data type
		while (inputCorrect == false) {

			//try - catch block
			try {

				//print selection question for user
				System.out.print("Enter a number to make your selection: ");

				//input
				destNo = scanner.nextInt();

				//if correct input data type print
				System.out.println("You will have great time in: " + names[destNo - 1] + "!");

				//and get out of the loop
				inputCorrect = true;

				//if incorrect data type
			} catch (InputMismatchException e) {
				System.out.println("Incorrect data value entered.");
				scanner.nextLine();

				/*The nextInt method scans the next token as an int. If the token can be translated
				 * into a valid int, it will be consumed and the scanner advances past the input.*/

				//if out of the scope of selection
			} catch (ArrayIndexOutOfBoundsException f) {
				System.out.println("A value from 1-5 should be entered.");
			}
		}
	}
}