package eCollegeJava;

import java.util.Random;

public class JFT13Ex5 {

	public static void main(String[] args) {
		String[] names = new String[] { "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
				"JACK", "QUEEN", "KING" };
		String[] symbols = new String[] { "Spades", "Clubs", "Diamonds", "Hearts" };

		int n1 = new Random().nextInt(14);
		int n2 = new Random().nextInt(14);
		int n3 = new Random().nextInt(14);

		System.out.println(names[n1] + " of " + symbols[new Random().nextInt(5)] + "\n" + names[n2] + " of "
				+ symbols[new Random().nextInt(5)] + "\n" + names[n3] + " of " + symbols[new Random().nextInt(5)]);

		if ((n1 + n2 + n3) > 21) {
			System.out.println("Result - Defeat - house wins!");
		} else {
			System.out.println("Result - Victory - You beat the house!");
		}
	}
}
