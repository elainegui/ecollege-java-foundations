package eCollegeJava;

import java.util.Scanner;

public class JTF4Ex5 {

	public static void main(String[] args) {
		// investiment
		Scanner sc = new Scanner(System.in);
		System.out.println("How much will you invest?");
		double investiment = sc.nextDouble();
		System.out.println("The principal is: " + investiment + " euro.");
		System.out.println("The interest rate is 0.05.");
		System.out.println("The interest earned is " + investiment * 0.05);
		System.out.println("The value of the investiment is: " + (investiment + (investiment * 0.05)) + " euro.");
		sc.close();
	}

	// fffd

	// dff

}
