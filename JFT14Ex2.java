package eCollegeJava;

public class JFT14Ex2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int num3 = 0;

		try {
			int result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("Error: Arithmetic Exception, Cannot / 0. Program Closing.");
		}
	}

}
