package eCollegeJava;

public class MockQuestion1 {

	public static void main(String[] args) {
		new Widget();
		new Widget();
		//	System.out.println(getNoOfWidgets());

		//Question
		//Does this code compile?
		/*int x = 0;
		for (x = 0; x < 5; x++);{
			System.out.println(x);
		}*/

	}

}

class Widget {
	private static int noOfWidgets;

	public Widget() {
		noOfWidgets++;
	}

	public static int getNoOfWidgets() {
		return noOfWidgets;
	}
}
