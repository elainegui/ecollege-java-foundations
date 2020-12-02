package eCollegeJava;

public class Webinars {

	public static void main(String[] args) {
		byte x = 10;
		x *= 100; //

		int y = 10;
		x /= y;

		System.out.println(x + " " + y);

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

		float changeInPocket = 1.45f;
		float priceOfTicket = 5.00f;
		String buyTicket = changeInPocket >= priceOfTicket ? "Admittance granted!" : "Admittance denied!";
		System.out.println(buyTicket);

		/*
		Q44: What is the output of the program (if any?).

		A: Admittance granted!
		
		B: Admittance denied!
		
		C: The program fails to compile (there is no output).
		
		D: The program compiles but crashes due to a runtime error.
		
		*/

		String[] arguments = { "X", "Y", "Z" };

		int xc = 0;
		int yc = 3;
		do {
			System.out.println(arguments[++xc]);
		} while (xc++ < --yc);

		/*
		Q65: What is the output of the program (if any?)

		A: X
		   Y
		   Z
		
		B: Z
		   Y
		   X
		
		C: Y (followed by an ArrayIndexOutOfBoundsException)

		D: Z (followed by an ArrayIndexOutOfBoundsException)

		E: X (followed by an ArrayIndexOutOfBoundsException)

		F: The program fails to compile (there is no output).
		
		*/
	}
}