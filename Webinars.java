package eCollegeJava;

public class Webinars {

	public static void main(String[] args) {
		byte x = 10;
		x *= 100; //

		int y = 10;
		x /= y;

		System.out.println(x + " " + y);

	}
	/*
	Q35: What is the value of x and y (if any)?
	
	A: 10 10
	B: 0 10
	C: 1000 10
	D: 10 1000
	E: The program fails to compile
	F: None of these answers are correct

	*/

	/*Answer: That code will compile. The *= indicates that a cast is putting automatically by the compiler.
	Don't worry about the loss of precision
	*/
}
