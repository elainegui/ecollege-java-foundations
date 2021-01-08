package eCollegeJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JFT14Ex6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		stringExtact();
	}

	static void stringExtact() {
		System.out.print("Enter a message: ");
		String inputStr = sc.nextLine();

		boolean flag = true;
		String[] arrayStr = null;

		while (flag) {
			try {
				System.out.print("Enter the position of the word to extact: For Example: 2: ");
				int positionEntered = sc.nextInt();
				arrayStr = inputStr.split(" ");
				String strFound = arrayStr[positionEntered - 1];
				flag = false;

				System.out.println("Extracted word: " + strFound);
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("Enter a number < " + (arrayStr.length + 1));
			} catch (InputMismatchException ie) {
				System.out.println("Enter a number not text.");
				sc.nextLine();
			}
		}
	}
}
