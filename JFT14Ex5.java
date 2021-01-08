package eCollegeJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JFT14Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a message: ");

		boolean flag = true;
		String inputMsg = null;

		inputMsg = sc.nextLine();

		System.out.print("Now enter the position of the character that you want to extact: ");
		while (flag) {
			try {
				int positionEntered = sc.nextInt();

				char c = inputMsg.charAt(positionEntered - 1);

				System.out.println("The extracted character from your message is: " + c);
				flag = false;

			} catch (IndexOutOfBoundsException e) {
				System.out.print("Please enter a number of less than " + (inputMsg.length() + 1) + " characters: ");
			} catch (InputMismatchException ie) {
				System.out.print("Error: Please enter a number to indicate the position: ");
				sc.nextLine();
			}

		}

	}

}
