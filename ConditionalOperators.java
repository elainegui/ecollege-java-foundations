package eCollegeJava;

public class ConditionalOperators {

	public static void main(String[] args) {
		int atendees = 4;
		boolean largeVenue;

		//if statement
		if (atendees >= 5) {
			largeVenue = true;
		} else {
			largeVenue = false;
		}

		//same outcome with less code
		largeVenue = (atendees >= 5);
	}

}
