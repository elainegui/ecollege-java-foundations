package eCollegeJava;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		names.add("Joe");
		names.add("Livia");
		names.add("Cathy");

		Iterator it = names.iterator();

		//iterator is pointing right before the 1st element
		while (it.hasNext()) {
			//the next element will move the cursor to the 1st element
			System.out.println(it.next());

			//when the iterator is on the last element, iterator.hasNext() will return false
		}

		//that is exactly what the for loop does
	}

}
