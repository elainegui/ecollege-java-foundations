package eCollegeJava;

import java.util.Scanner;

public class JFT4Ex7 {

	public static void main(String[] args) {
		// carpeting
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in the length: ");
		double length = sc.nextDouble();
		System.out.println("Type in the width: ");
		double width = sc.nextDouble();
		System.out.println("Square feet: " + (length * width));
		System.out.println("Square yards: " + (length * width) / 9);
		System.out.println("Cost of carpeting in square yards: " + 37.99 * ((length * width) / 9) + " euro.");
		sc.close();
	}

}
