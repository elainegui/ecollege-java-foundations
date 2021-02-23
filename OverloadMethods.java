package eCollegeJava;

public class OverloadMethods {

	// Two rules apply for overloaded methods:
	// - Argument list must differ
	// - Return types can be different

	/*
	 * So, these are not allowed:
	 * public void print (int i) {}
	 * public String print (int i) {}
	 */

	// in addition to overload methods,
	// we can overload the constructors

	// from:
	// https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.2
	static int m(byte a, int b) {
		return a + b;
	}

	static int m(short a, short b) {
		return a - b;
	}

	public static void main(String[] args) {
		// System.out.println(m(12, 2)); // compile-time error

	}
	// Neither strict nor loose invocation contexts include the implicit narrowing
	// of integer constant expressions
	// which is allowed in assignment contexts.
	// The designers of the Java programming language felt that including these
	// implicit narrowing conversions
	// would add additional complexity to the rules of overload resolution
	// (§15.12.2).

	/*
	 * causes a compile-time error because the integer literals 12 and 2 have type
	 * int, so neither method m matches
	 * under the rules of overload resolution.
	 * A language that included implicit narrowing of integer constant expressions
	 * would need additional rules
	 * to resolve cases like this example
	 */

}
