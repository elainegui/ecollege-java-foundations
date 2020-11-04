package eCollegeJava;

public class JFT4Ex8 {

	public static void main(String[] args) {
		int c = 3;
		c++;
		System.out.println("The value of c is " + c); // ?
		int w = 0;
		w = ++c;
		System.out.println("The value of w is " + w); // ?
		System.out.println("The value of c is " + c); // ?
		int x = 0;
		x = c++;
		System.out.println("The value of x is " + x); // ?
		System.out.println("The value of c is " + c); // ?
		int y = 0;
		y = --c;
		System.out.println("The value of y is " + y); // ?
		System.out.println("The value of c is " + c); // ?
		int z = 10;
		z++;
		++z;
		--z;
		int qq = ++z;
		z = c--;
		System.out.println("The value of z is " + z); // ?
		System.out.println("The value of c is " + c); // ?
		System.out.println("The value of qq is " + qq); // ?

	}

}
