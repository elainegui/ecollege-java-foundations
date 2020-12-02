package eCollegeJava;

import java.util.ArrayList;

public class JFT9Ex1 {

	public static void main(String[] args) {
		//Exercise1
		ArrayList<String> albums = new ArrayList<String>();
		albums.add("Thriller");
		albums.add("The Dark Side of the Moon");
		albums.add("Bat Out of Hell");
		albums.add("Back in Black");
		albums.add("Come On Over");
		albums.add("Led Zeppelin IV");
		albums.add("Jagged Little Pill");

		for (String album : albums) {
			System.out.println(album + " ");
		}

		System.out.println();

		//Exercise2
		ArrayList<String> destinations = new ArrayList<String>();
		destinations.add("Ibiza");
		destinations.add("Gran Canaria");
		destinations.add("Nice");
		destinations.add("Tropea");

		for (int i = 0; i < destinations.size(); i++) {
			System.out.print(destinations.get(i) + "\t");
		}

		//Exercise3

	}

}
