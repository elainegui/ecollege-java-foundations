package eCollegeJava;

public class PrimitivesConversionECollege {

	short sh33 = 123;
	// char c = sh33; // error: would require cast
	// sh33=c; // error: would require cast

	// because not all short values are char values, and neither are all char values
	// short values.


	// IMPORTANT
	byte bb3 = 0b0001;
	int c3 = 7;
	// c3=bb3; // we cannot make assignments in the class field


	public static void main(String[] args) {
		// c3 = bb3;

		// The c3 and bb3 variables to be accessible, they should be declared with a
		// static modifier
		// Or, we can call them by using an object of the class

		PrimitivesConversionECollege p = new PrimitivesConversionECollege();
		p.c3 = p.bb3;



		byte num1 = 53;
		byte num2 = 47;
		byte num3 = 0;
		// num3 = (num1 + num2); //when the compiler sees the + operator w/ two bytes,
		// it considers num1 and num2 as ints

		/*
		 * Smaller data types, namely byte, short, and char, are first promoted to int
		 * any time
		 * they’re used with a Java binary arithmetic operator, even if neither of the
		 * operands is
		 * int.
		 */

		// Question
		byte byZ;
		byZ = 2 + 3; // no problem
		byZ = 53 + 47; // no problem
		// byZ = 127 + 1; // problem //128 is greater than the range of a byte(-128 to
		// 127)
		// byZ = 10 + num1; // between 10 and num1, the compiler considers the greater
		// type (int)

		byZ = (5 + (30 - 5) * 2);

		short shortNum = 20;
		short shortNum2 = 10;
		// short shortNum3 = shortNum + shortNum2; //the same, both variables are
		// promoted to int before the operation, resunlting in type int

		byte byteNum = 12;
		byte byteNum2 = byteNum;

		int cVar = 50 * 50;
		/*
		 * prior to be assigned to a variable, the result of an equation is placed in a
		 * temporary
		 * location in the memory. The location size is always equal to the size of an
		 * int type or
		 * the size of the largest data type used in the expression or statement
		 */
		// For example, if you multiply two int types, the container size will be an int
		// type in size or 32 bits.

		/*
		 * if the two values that you multiply yield a value that is beyond the scope of
		 * an int type,
		 * the int value must be truncated to fit the result into the temporary location
		 * in memory.
		 * This calculation yields an incorrect answer because the variable for your
		 * answer receives
		 * a truncated value, regardless the type used for your answer
		 */
		// 55_555 * 66_666 = 3_703_629_630
		int d = 55_555 * 66_666;

		System.out.println("d = " + d); // the result is 3,703,629,630

		// int primitive gets 32 bits of space
		// int primitive max range is 2147483647 (2^31) +-2 billion

		/*
		 * To solve this problem, we should set at least one of the variables in your
		 * equation to the long
		 * type to ensure the largest possible temporary container size
		 */

		// long get 64 bits of space so can hold an int

		long d2 = 55_555L * 66_666;
		System.out.println("d = " + d2);

		int myInt;
		long myLong = 123987654321L;
		myInt = (int) (myLong); // Number is 'chopped'.
		System.out.println("myInt = " + myInt);

		/*
		 * Java technology compiler makes certain assumptions when it evaluates
		 * expressions.
		 * Most operations result in int or long
		 * byte, char and short values are promoted to int before the operation
		 */

		byte b1 = 1, b2 = 2, b3;
		// b3 = b1+b2; //Error: result is an int but b3 is a byte

		/*
		 * If either the argument is of the long type, the other is also promoted to
		 * long, and the result
		 * is of the long type
		 */

		/*
		 * If an expression contains a float, the entire expression is promoted to
		 * float, and literal
		 * floating-point values are viewed as double
		 */

		short a, b, c;
		a = 1;
		b = 2;
		/*
		 * c = a + b; //compiler error. The operands a and b are both automatically
		 * promoted from a short
		 * type to an int type before they are added. The assignment operator = attempts
		 * to assign the int
		 * result to the short variable c. However this assignment is illegal and causes
		 * a compiler error
		 */

		// float f1 = 2.94; // 2.94 is a double type which cannot fit into a float
		// variable.
		// The F after the number tells the compiler it is a float type

		byte w = 10;
		// w = w + 1000; //does not compile byte+int=int
		w += 1000; // cast //w = (byte) (10+1000)
		// we cannot store 1010 in byte, so there will be truncation of the byte
		// the runtime will insert a cast when you use an arithmetic operator (ex +=)
		// answer will be different
		// byte: -128 to 127
		System.out.println("w = " + w);

		// caution with promotion - Topic5
		// Equation:
		// 55555*66666 = 37036229630

		// Example of potential issue:
		int num11 = 55555;
		int num22 = 66666;
		long num33;
		num33 = num11 * num22; // num1 and num2 are int. Before the compiler assigns the multiplication to the
								 // variable
								 // num3, it stores in a temporarily location in memory in int container. But
								 // this multiplication result is too long to
								 // store in that int container,
								 // so the value will be truncated, and the output will be wrong
		System.out.println("num3 " + num33);

		// Example of potential solution:
		int numA = 55555;
		long numB = 66666; // changed from int to long
		long numC; // it will ensure the largest possible container size
		numC = numA * numB;
		System.out.println(numC);

		// Example of potential issue:
		// 7/2=3.5
		int numD = 7;
		int numE = 2;
		double numF;
		numF = numD / numE;
		System.out.println("numF: " + numF);

		// Example of potential solution:
		int numG = 7;
		double numH = 2; // changed from int to double
		double numI;
		numI = numG / numH;
		System.out.println("numI: " + numI);

		// Example of potential issue:
		int myInt2;
		long myLong2 = 123987654321L;
		myInt2 = (int) (myLong2);
		System.out.println("myInt2: " + myInt2); // myInt2 is chopped. myInt is -566397263

		// Safer example of casting:
		int myInt3;
		long myLong3 = 99L;
		myInt3 = (int) (myLong3); // no data loss, only zeroes. My int is 99
		System.out.println("myInt3: " + myInt3);

		// Example of potential issue:
		int myInt4;
		double myPercent = 51.9;
		myInt4 = (int) (myPercent); // number is "chopped". myInt4 is 51
		System.out.println("myInt4: " + myInt4);

		// Example of potential issue:
		int num4 = 53; // 32 bits of memory to hold the value
		int num5 = 47; // 32 bits of memory to hold the value
		// byte num6; //8 bits of memory reserved
		// num6 = (num4 + num5); //causes compile error

		// Solution using a larger type for num6:
		int num6; // changed from byte to int
		num6 = (num4 + num5);
		System.out.println("num6: " + num6);

		// Solution using casting:
		int num7 = 53;
		int num8 = 47;
		byte num9;
		num9 = (byte) (num7 + num8); // no data loss
		System.out.println("num9: " + num9);

		// Automatic promotion
		// Example of potential problem:
		short aa, bb, cc;
		aa = 1;
		bb = 2; // a and b are automatically promoted to integers
		// cc = aa + bb; //compiler error

		// Example of potential solution:
		// declare c as an int type in the original declaration
		// type cast the (a+b) result in the assignment line: c=(short)(a+b)

		// Question
		byte bb3;
		int c3 = 7;
		// bb3 = c3;
		// c3 = bb3;

		int g = 101;
		int h = g++;
		int noOfBallons = h = 2;

		System.out.println(noOfBallons);

		noOfBallons = h = 2 + 3;

		System.out.println(noOfBallons);

		noOfBallons = h -= 5;
		System.out.println(noOfBallons);
		System.out.println(h);

		noOfBallons = h += 5 + 2;

		System.out.println(noOfBallons);
	}
}
