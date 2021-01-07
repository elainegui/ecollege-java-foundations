package eCollegeJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JFT14Ex4 {

	public static void main(String[] args) {
		String[] destinations = { "Cork", "Athlone", "Limerick", "Sligo", "Dublin" };

		int i = 1;
		for (String s : destinations) {
			System.out.println(i + ": " + s);
			i++;
		}

		int numEntered;
		boolean flag = true;
		while (flag) {
			try {
				System.out.println("Enter a number to make your selection:");
				Scanner sc = new Scanner(System.in);
				numEntered = sc.nextInt();

				if (numEntered >= 1 && numEntered <= 5) {
					flag = false;

					System.out.println("You will have a grat time in: " + destinations[numEntered - 1]);

				} else {
					System.out.println("A value from 1 -5 should be entered");
				}

			} catch (InputMismatchException e) {
				System.out.println("Incorrect data value added");
			}

		}
	}
}