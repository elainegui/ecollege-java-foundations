package eCollegeJava;

public class Operators {
	public static void main(String[] args) {

		int a = 2;
		int b = a * 10;
		b *= 10;
		b /= 10;
		b %= 80;
		System.out.printf("%d and %d%n", a, b);

		int c = 20;
		c %= 2;
		System.out.println(c);

		int d = 20;
		d %= 80;
		System.out.println(d);

		// Modulus Operator %
		double e = 10.1 % 2;
		System.out.println(e);

		// exercise
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);

		// Compound Assignment Operators
		long w = 10;
		int z = 5;
		// z = z*w; //does not compile
		z *= w; // compiles

		// the compiler will first cast z to a long , multiply z and w
		// and cast the result to an int

		// Assignment Operator
		long k = 5;
		long l = (k = 3);
		System.out.println(k);
		System.out.println(l);
		// the result of the assignment
		// is an expression in and of itself, equal to the value of the assignment.


		// Relational Operators
		// If the two numeric operands are not of the same data type, the
		// smaller one is promoted.
		long m = 8;
		int n = 2;
		System.out.println(m >= n);

		// Relational instanceof operator
		// returns true if the reference that a points to is an instance of
		// a class, subclass, or class that implements a particular
		// interface, as named in b
		Operators op = new Operators();
		System.out.println(op instanceof Operators);

		// Logical Operators
		// The logical operators, (&), (|), and (^), may be applied to both numeric and
		// boolean data
		// types. When they’re applied to boolean data types, they’re referred to as
		// logical operators.
		// Alternatively, when they’re applied to numeric data types, they’re referred
		// to as bitwise
		// operators, as they perform bitwise comparisons of the bits that compose the
		// number.

		// Short-Circuit Logical Operators
		// The short-circuit operators are nearly identical to the logical operators,
		// & and |, respectively, except that the right-hand side of the expression may
		// never be
		// evaluated if the final result can be determined by the left-hand side of the
		// expression

		// Equality Operators
		// three scenarios:
		/*
		 * 1. Comparing two numeric primitive types. If the numeric values are of
		 * different data
		 * types, the values are automatically promoted as previously described. For
		 * example,
		 * 5 == 5.00 returns true since the left side is promoted to a double.
		 * 2. Comparing two boolean values.
		 * 3. Comparing two objects, including null and String values.
		 */




	}
}
