package eCollegeJava;

public class PrimitivesConversionECollege {
	public static void main(String[] args) {
		/*int num1 = 53;

		int num2 = 47;
		byte num3;
		num3 = (num1 + num2);*/

		int cVar = 50 * 50;
		/*prior to be assigned to a variable, the result of an equation is placed in a temporary
		 * location in the memory. The location size is always equal to the size of an int type or
		 * the sie of the largest data type used in the expression or statement*/
		// For example, if you multiply two int types, the container size will be an int
		// type in sie or 32 bits.

		/*if the two values that you multiply yield a value that is beyond the scope of an int type,
		 * the int value must be truncated to fit the result into the temporary location in memory.
		 * This calculation yields an incorrect answer because the variable for your anwer receives
		 * a truncated value, regardless the type used for your answer*/
		// 55_555 * 66_666 = 3_703_629_630
		int d = 55_555 * 66_666;

		System.out.println("d = " + d);

		/*To solve this problem, we should set at least one of the variables in your equation to the long
		 * type to ensure the largest possible temporary container size*/

		long d2 = 55_555L * 66_666;
		System.out.println("d = " + d2);

		int myInt;
		long myLong = 123987654321L;
		myInt = (int) (myLong);   // Number is 'chopped'.
		System.out.println("myInt = " + myInt);

		/*Java technology compiler makes certain assumptions when it evaluates expressions.
		 * Most operations result in int or long
		byte, char and short values are promoted to int before the operation  */

		byte b1 = 1, b2 = 2, b3;
		// b3 = b1+b2; //Error: result is an int but b3 is a byte

		/*If either the argument is of the long type, the other is also promoted to long, and the result
		 *  is of the long type*/

		/*If an expression contains a float, the entire expression is promoted to float, and literal
		 * floating-point values are viewed as double */

		short a, b, c;
		a = 1;
		b = 2;
		/*c = a + b;  //compiler error. The operands a and b are both automatically promoted from a short
		 * type to an int type before they are added. The assignment operator = attempts to assign the int
		 * result to the short variable c. However this assignment is illegal and causes a compiler error*/

		// float f1 = 2.94; // 2.94 is a double type which cannot fit into a float
		// variable.
		// The F after the number tells the compiler it is a float type

		byte w = 10;
		// w = w + 1000; //does not compile byte+int=int
		w += 10; // cast //w = (byte) (10+1000)
		// we cannot store 1010 in byte, so there will be truncation of the byte //the
		// answer will be different
		// byte: -128 to 127
		System.out.println("w = " + w);

	}
}
