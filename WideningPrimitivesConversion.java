package eCollegeJava;

//from : OCA Java SE 8 Programmer Study Guide (Exam 1Z0-808)
//by Budi Kurniawan
public class WideningPrimitivesConversion {

	public static void main(String[] args) {
		// WIDENING CONVERSION

		// BYTE (TO SHORT, INT, LONG, FLOAT OR DOUBLE)

		byte b = 0b110;
		short s = b;
		double d = b;


		// SHORT (TO INT, LONG, FLOAT OR DOUBLE)

		short s1 = 4;
		long l = s1;


		// CHAR (TO INT, LONG, FLOAT OR DOUBLE)

		char c = 'e';
		// byte b = c;
		// short s2 = c;
		int i = c;


		// INT TO LONG, FLOAT OR DOUBLE
		int i2 = 55;
		long l2 = i2;

		// obs: a conversion from an int or a long to a float may result in loss of
		// precision


		// LONG TO FLOAT OR DOUBLE

		// FLOAT TO DOUBLE


		// obs: The widening primitive conversion occurs implicitly


	}

}
