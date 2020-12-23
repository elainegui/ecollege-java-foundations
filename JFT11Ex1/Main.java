package eCollegeJava.JFT11Ex1;

public class Main {

	public static void main(String[] args) {
		Adult adult = new Adult("Billy White", 30, "male", 6.5f, 11.0f, "5645614F", "Software Developer", true, true);
		System.out.println(adult.toString());
		System.out.println(adult.eat());
		System.out.println(adult.drive());

		System.out.println();

		Child child = new Child("Frank Davis", 3, "male", 1.5f, 3.0f, "N/A");
		System.out.println(child.toString());
		System.out.println(child.eat());
		System.out.println(child.swim());

		System.out.println();

		Baby baby = new Baby("Gillian Taylor", 1, "female", 0.6f, 1.0f, true);
		System.out.println(baby.toString());
		System.out.println(baby.sleep());
		System.out.println(baby.swim());

	}

}
