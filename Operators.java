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
	}
}
