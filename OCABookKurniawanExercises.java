package eCollegeJava;

public class OCABookKurniawanExercises {

	public static void main(String[] args) {
		// Chapter2

		/*
		 * What is the output of this code?
		 * A. 3
		 * B. 5
		 * C. 7
		 * D. 9
		 */

		int y = 0;
		for (int x = 0; y < 5; ++x) {
			if (x % 2 == 0)
				continue;
			y += x;
		}
		System.out.println(y);





		/*
		 * What is the output of this code?
		 * A. 14
		 * B. 15
		 * C. 16
		 * D. None of the above
		 */

		int z = 0;
		for (;;) {
			if (z >= 10)
				break;
			z += ++z;
		}
		System.out.println(z);





		/*
		 * What is the output of this code?
		 * A. 14
		 * B. 15
		 * C. 16
		 * D. None of the above
		 */

		/*
		 * int w = 0;
		 * for (;;) {
		 * if (w >= 10)
		 * break;
		 * w += w++;
		 * }
		 * System.out.println(w);
		 */





// What is the value of y after the code is executed?

		// @formatter:off
		int i = 1;
		int b = 5;
		if (i == 2)
			if (i == 1)
				b = 50;
		else b = 500;
//@formatter:on

		System.out.println(b);



	}

}
