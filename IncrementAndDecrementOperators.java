package eCollegeJava;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		int x = 1;
		// in the below expression, x is incremented by 1 and then decrementd by 2
		int y = x++ + --x;
		// y is 1 + 1
		System.out.println("x: " + x + " y: " + y);
	}

}
