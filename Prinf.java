package eCollegeJava;

public class Prinf {

	public static void main(String[] args) {
		/*Format specifiers begin with a percent sign (%) followed by a character that represents
		the type of data to be output. The format specifier %s acts as a placeholder for a string*/

		/*At the first format specifier’s position, %s, printf() substitutes the placeholder with the value of the
		first argument “Hello”.*/
		System.out.printf("%s\n%s\n", "Hello", "World!");

		/*We can also use the printf() method to print integers. We use %d as the format specifier.*/
		System.out.printf("%d", 26);

		int number1 = 10;
		int number2 = 20;

		System.out.printf("Sum is %d\n", (number1 + number2)); // Line 1
		if (number1 == number2) {
			System.out.printf("%d == %d\n", number1, number2); // Line 2
		}
		if (number1 != number2) {
			System.out.printf("%d != %d\n", number1, number2); // Line 3
		}
		if (number1 < number2) {
			System.out.printf("%d < %d\n", number1, number2); // Line 4
		}
		if (number1 > number2) {
			System.out.printf("%d > %d\n", number1, number2); // Line 5
		}
		if (number1 <= number2) {
			System.out.printf("%d <= %d\n", number1, number2); // Line 6
		}
		if (number1 >= number2) {
			System.out.printf("%d >= %d\n", number1, number2); // Line 7
		}

		/* the %n format specifier, which we have already seen in the previous
		examples. It performs the same function as the \n escape character*/

		System.out.printf("The end start again.%n", "Started back.");

		//	System.out.println("%d\n", 123);

		System.out.printf("%d", 123);

		double age = 40.48765;
		System.out.printf("\nMy age is: %.1f", age);
		//	System.out.printf("My age is: %d", age);

		System.out.printf("\nMy age is: %.1f\n", age, number1);

		System.out.printf("The toral is %.2f%n", 23.35);
		System.out.printf("The toral is %.1f%n", 23.35);
		System.out.printf("The toral is %.3f%n", 23.35);

		//System.out.printf("*%s*", "books");
		//System.out.printf("%s%s%s\n", 4, "*", "books", 4, "*");

		//System.out.printf("%*s", 40 + strlen("Name2") / 2, "Name2", 40 - strlen("Name2") / 2, "");
		//System.out.printf("***********%s************", "books");
		//System.out.printf("%10s%s%10s", "**********", "books", "**********");
		//System.out.printf("%4s%s%4s", "**********", "books", "**********");

		String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
		System.out.format(format, "FirstName", "Init.", "LastName");
		System.out.format(format, "Real", "", "Gagnon");
		System.out.format(format, "John", "D", "Doe");

		String ex[] = { "John", "F.", "Kennedy" };

		System.out.format(String.format(format, (Object[]) ex));

	}

}
