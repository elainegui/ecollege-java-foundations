package eCollegeJava;

public class JFT14Ex3 {

	public static void main(String[] args) {
		byte[] numbers = { 6, 5, 4, 3, 2, 1 };
		try {
			System.out.println(numbers[2500]);
		} catch (Exception e) {
			System.out.println("Error: Unable to access data - bad index.");
		}
	}
}
