package eCollegeJava;

import java.util.Scanner;

public class JFT4Ex4 {
	public static void main(String[] args) {
		// total hours
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in the total minutes:");
		int minutes = sc.nextInt();
		System.out.println("Hours: " + minutes / 60 + " Minutes: " + minutes % 60);
		sc.close();
	}

}
