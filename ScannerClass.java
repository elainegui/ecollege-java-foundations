package eCollegeJava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Type in a byte: ");
		byte outputB = sc.nextByte();
		System.out.println(outputB);

		System.out.print("Type in a short: ");
		Short outputS = sc.nextShort();
		System.out.println(outputS);

		System.out.print("Type in a int: ");
		int outputI = sc.nextInt();
		System.out.println(outputI);

		System.out.print("Type in a long: ");
		int outputL = sc.nextInt();
		System.out.println(outputL);

		System.out.print("Type in a float: ");
		float outputF = sc.nextFloat();
		System.out.println(outputF);

		System.out.print("Type in a double: ");
		double outputD = sc.nextDouble();
		System.out.println(outputD);

		//next()  Reads a string that ends before a whitespace character
		System.out.print("Type in a string: ");
		String outputStr = sc.next();
		System.out.println(outputStr);

		sc.close();

		System.out.println("nextLine() in use:  ");
		String str = "Hello World! \n 3 + 3.0 = 6.0 true ";
		Scanner sc2 = new Scanner(str);
		//print the first line
		System.out.println(sc2.nextLine());
		//print the next line
		System.out.println(sc2.nextLine());

		sc2.close();

	}

}
