package eCollegeJava;

import java.util.Arrays;

public class ArraysClass {
	byte x;

	public static void main(String[] args) {
		String[] array = new String[2];
		array[1] = "Ben";
		array[0] = "Lucy";

		System.out.println(array); // [Ljava.lang.String;@15db9742
		System.out.println(array.toString()); // [Ljava.lang.String;@15db9742

		// to print the array's contents:
		System.out.println(Arrays.toString(array));



		String[] e = new String[0];


		// binarySearch
		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);

		// The array should be sorted to produce a meaningful result
		Arrays.sort(random); // [-10, -4, 0, 6, 12]
		y = Arrays.binarySearch(random, x);
		System.out.println(y);

		y = Arrays.binarySearch(random, 9);
		System.out.println(y);

		// binarySeach cannot find 9 but notices shold be at index 4
		// the rule is to negate the index and subtract -1


		Object[][][] cubbies = new Object[3][0][5]; // compiles, but zero in length would cause IndexOtOfBoundsException
		System.out.println(Arrays.toString(cubbies));  // [[[Ljava.lang.Object;@6d06d69c, [[Ljava.lang.Object;@7852e922,
														  // [[Ljava.lang.Object;@4e25154f]
		// cubbies[0][0][0] = "tree"; // java.lang.ArrayIndexOutOfBoundsException


		Object[][][] cubbies2 = new Object[3][1][5];
		cubbies2[0][0][0] = 2;
		System.out.println(Arrays.toString(cubbies2));

	}
	/*
	 * static int x;
	 * int y;
	 *
	 * public static void main(String[] args) {
	 * System.out.println(x + y);
	 *
	 * }
	 */

	/*
	 * ArraysClass obj = new ArraysClass();
	 * obj.writeToFile();
	 *
	 * }
	 *
	 * public void writeToFile() {
	 * try {
	 * // code to write to file goes here.
	 * // assume there is a problem accessing the file.
	 * // let's throw an IOException to simulate the problem.
	 * throw new IOException(); // Line 14
	 * } catch (IOException e) {
	 * e.printStackTrace();
	 * }
	 * }
	 */

}