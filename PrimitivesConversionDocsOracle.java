package eCollegeJava;

/**
 * @author https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.2
 *         chapter 5: Conversions and Contexts
 *         https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.2
 */
public class PrimitivesConversionDocsOracle {
	public static void main(String[] args) {

		// CASTING CONVERSION of a float literal to type int. Without the cast operator,
		// this would be a compile-time error, because this is a narrowing conversion :
		int i = (int) 12.5f;


		// STRING CONVERSION of i's int value:
		System.out.println("(int)12.5f==" + i);

		// (...)

		// ASSIGNMENT CONVERSION of i's value to type float.
		// This is a widening conversion (5.1.2):
		float f = i;


		// String conversion of f's float value:
		System.out.println("after float widening: " + f);


		// NUMERIC PROMOTION of i's value to type float.
		// This is a binary numeric promotion.
		// After promotion, the operation is float*float:
		System.out.print(f);
		f = f * i;


		// Two string conversions of i and f:
		System.out.println("*" + i + "==" + f);


		// WIDENING PRIMITIVE CONVERSION
		int big = 1234567890;
		float approx = big;
		System.out.println(big - (int) approx);
		/*
		 * thus indicating that information was lost during the conversion from type int
		 * to type float because values of type float are not precise to nine
		 * significant digits.
		 */

	}

}
