package eCollegeJava;

public class Loops {

	public static void main(String[] args) {
		/*
		 * int count =1;
		 * for (count<5){
		 * System.out.println();
		 * count++;
		 * };
		 */

		// while and do while loops are sentinel controlled loops

		// for loop, while loop and do while loop are count-controlled loops




		// Examples to watch: (OCA Book - Boyarsky and Selikoff)

		// Adding Multiple Terms to the for Statement
		int x = 0;
		for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x);


		// Redeclaring a Variable in the Initialization Block
		/*
		 * int a = 0;
		 * for(long y = 0, a = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
		 * System.out.print(x + " ");
		 * }
		 */

		// in this case the variable a is redeclared

		// solution: declare y outside the for loop with a and the assign new
		// values to each of them inside the initialization block


		// Using Incompatible Data Types in the Initialization Block
		/*
		 * for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
		 * System.out.print(x + " ");
		 * }
		 */

		// Using Loop Variables Outside the Loop
		for (long b = 0, m = 4; m < 5 && b < 10; m++, b++) {
			System.out.print(b + " ");
		}
		// System.out.println(m+" ");



		//Exercise
		/*What is the output of the following code snippet?
				3: int x = 1, y = 15;
				4: while x < 10
				5: y––;
				6: x++;
				7: System.out.println(x+", "+y);
				A. 10, 5
				B. 10, 6
				C. 11, 5
				D. The code will not compile because of line 3.
				E. The code will not compile because of line 4.
				F. The code contains an infinite loop and does not terminate.*/

		/*	int a = 1, b = 15;
			while a < 10
			b––;
			a++;
			System.out.println(x+", "+y);*/
		
		
		//Exercise
		/*What is the output of the following code snippet?
				3: do {
				4: int y = 1;
				5: System.out.print(y++ + " ");
				6: } while(y <= 10);
				A. 1 2 3 4 5 6 7 8 9
				B. 1 2 3 4 5 6 7 8 9 10
				C. 1 2 3 4 5 6 7 8 9 10 11
				D. The code will not compile because of line 6.
				E. The code contains an infinite loop and does not terminate.*/

		/*	do {
				int c = 1;
				System.out.print(c++ + " ");
				} while(c <= 10);
		*/
		
	}

}
