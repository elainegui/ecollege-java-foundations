package eCollegeJava;

import java.util.Scanner;

public class JFT4Ex6 {

	public static void main(String[] args) {
		// coin machine
		Scanner sc = new Scanner(System.in);
		System.out.println("How much will you change?(without cents)");
		int money = sc.nextInt();
		System.out.println("Sum of money is: " + money);
		System.out.println("No of 20's: " + money / 20);
		System.out.println("No of 10's: " + (money % 20) / 10);
		System.out.println("No of 5's: " + ((money % 20) % 10) / 5);
		System.out.println("No of 1's: " + (((money % 20) % 10) % 5));
		sc.close();
	}

}
