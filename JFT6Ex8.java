package eCollegeJava;

import java.util.Scanner;

public class JFT6Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in the student's grade (with decimals):");
		float grade = sc.nextFloat();
		if (grade > 100) {
			System.out.println("Please type a vaid grade");
		} else if (grade >= 85) {
			System.out.println("Grade achieved: A");
		} else if (grade >= 70) {
			System.out.println("Grade achieved: B");
		} else if (grade >= 55) {
			System.out.println("Grade achieved: C");
		} else if (grade >= 40) {
			System.out.println("Grade achieved: D");
		} else if (grade >= 25) {
			System.out.println("Grade achieved: E");
		} else if (grade >= 10) {
			System.out.println("Grade achieved: F");
		} else {
			System.out.println("Grade acieved: No Grade");
		}

	}

}
