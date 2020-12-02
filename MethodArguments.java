package eCollegeJava;

public class MethodArguments {

	public static void main(String[] args) {
		MethodArguments obj = new MethodArguments();
		obj.methodOne();

	}

	public void methodOne() {
		int x = 10;
		methodTwo(x);
		System.out.println("x=" + x);
	}

	public void methodTwo(int x) {
		x = 20;
	}
}
/*In the program above, the main method calls methodOne. In turn, methodOne() calls
methodTwo(), and passes it a value. What is it exactly that we are passing?
Is it the variable x itself (declared on Line 7) that is passed to methodTwo() or is it a copy of
the value stored in the variable?
The answer is, it is a copy of the value stored in variable x, which is passed to methodTwo().
The copied value is stored in the method parameter of methodTwo(). The code executed in
methodTwo() does not affect variable x, declared on Line 7. This is known as passing by
value.
Primitive variables in Java are passed by value. A copy of the value stored in the
variable is passed to the called method. Any changes made in the called method do
not affect the primitive variable.
Therefore, in the above program, the output on Line 9 is: x=10.*/