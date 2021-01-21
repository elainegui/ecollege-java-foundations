package eCollegeJava;

public class UnreachableCode {

	public static void main(String[] args) {
		/*	Unreachable statements might be unreachable because of the following reasons:
		
				1.Have a return statement before them
				2.Have an infinite loop before them
				3.Any statements after throwing exception in a try block b
		*/

		/*System.out.println("I will get printed");
		
		return;
		
		// it will never run and gives error
		// as unreachable code.
		System.out.println("I want to get printed");
		*/

		/*int a = 2;
		for (;;) {
		
			if (a == 2) {
				break;
				// it will never execute, so
				// same error will be there.
				System.out.println("I want to get printed");
			}
		}
		*/

		/*	try {
				throw new Exception("Custom Exception");
				// Unreachable code
				System.out.println("Hello");
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		*/

		/*	for (int i = 0; i < 5; i++) {
				continue;
				System.out.println("Hello");
			}*/

	}

}
