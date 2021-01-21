package eCollegeJava;

import java.text.DecimalFormat;

public class DecimalFormatClass {
	/*The DecimalFormat class has a method called .format() which will automatically format
	 * any double or float to three decimal places*/

	/*The .format() method has one parameter which is whatever is to be formatted , this
	 * can be a variable or function that yields a double*/

	/*The .format() returns a String*/

	/*Printing a double with println or printf may result in many decimals printed*/
	public static void main(String[] args) {

		/*format() will format a double or float to three decimal places*/

		DecimalFormat decimalF = new DecimalFormat();
		String val = decimalF.format(23.35);

		System.out.println(val);

		//Using DecimalFormat with println method:
		System.out.println("\nUsigned Decimal Format:");
		System.out.println("The tax is " + decimalF.format(23.35 + 34.445));
		System.out.println();

		//formatting numbers upto 2 decimal places in Java
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		System.out.println(df.format(364565.14));
		System.out.println(df.format(364565.1454));

		//formatting numbers upto 3 decimal places in Java
		df = new DecimalFormat("#,###,##0.000");
		System.out.println(df.format(364565.14));
		System.out.println(df.format(364565.1454));
		//if the decimal number doesn't contain 3 digits than zero will be per pended

//Read more: https://javarevisited.blogspot.com/2012/03/how-to-format-decimal-number-in-java.html#ixzz6jkJoUPFf

	}

}
