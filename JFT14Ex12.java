package eCollegeJava;

public class JFT14Ex12 {

	public static void main(String[] args) {
		// Do I have to write exception handling code here?
		//try {
		new JFT14Ex12().methodA();
		//} catch (Exception e) {
		//System.out.println(e.getClass());
		//}
	}

	public void methodA() {
		// Do I have to write exception handling code here?
		//try {
		methodB();
		//} catch (Exception e) {
		//System.out.println(e.getClass());
		//}
	}

	public void methodB() {
		// Create an Array and access a bad index
		// What happens?
		// Do I have to write exception handling code here?

		//try {
		int[] numbers = { 10, 20, 40 };
		System.out.println(numbers[100]);
		/*} catch (Exception e) {
			System.out.println(e.getClass());
		}*/
	}

}
