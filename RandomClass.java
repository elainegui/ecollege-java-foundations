package eCollegeJava;

import java.util.Arrays;
import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// Random class
		//stored in the java.util package

		Random r = new Random();
		int randomNo = r.nextInt(5);
		//the nextInt(int bound) generates a random number between 0 (inclusive) and the specified value (exclusive)
		System.out.println(randomNo);

		//nextInt()
		randomNo = r.nextInt();
		//All 2^32 possible int values are produced with (approximately) equal probability.
		System.out.println(randomNo);

		//nextDouble()  //also nextFloat() generates a random value between 0.0 and 1.0
		double randomNoDouble = r.nextDouble();
		System.out.println(randomNoDouble); //

		Random rand = new Random(0);
		int randInt = rand.nextInt();
		System.out.println(randInt);

		randInt = rand.nextInt(3);
		System.out.println(randInt);

		//nextBytes(byteArray)
		//generates random bytes and places them into a user-supplied byte array
		byte[] byteArray = new byte[3];
		byteArray[0] = 1;
		System.out.println(Arrays.toString(byteArray));
		r.nextBytes(byteArray);
		System.out.println(Arrays.toString(byteArray));
	}

}
