package eCollegeJava;

public class ExceptionClass {

	public static void main(String[] args) {
		System.out.println(1.0 == 1);
		/*	int i = 0;
			try {
				i++;
			} catch (IOException e) {
				e.printStackTrace();
			}*/
		/*A statement like i++ doesn't do any input or output. The code inside the try clause can't possibly throw an IOException. So the compiler comes back and says, "Hey, catch clause.
		 * Get real. Get off your high horse."*/
/*
		try {
			ExceptionClass exClass = new ExceptionClass();
			exClass.writeToFile();
		} catch (IOException e) {

		}*/

	}

	/*public void writeTextToFile throws IOException() {

	}*/

	/*public void writeTextToFile() {
		throw new IOException();
	}*/

}
