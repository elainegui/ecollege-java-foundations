package eCollegeJava;

import java.util.ArrayList; //without this import statement, the program fails to compile
import java.util.List;

public class ArrayListTutorDemo {

	public static void main(String[] args) {

		ArrayList myCDs = new ArrayList();

		myCDs.add(new CD());

		/*The class above compiles. We can store any object type in the ArrayList, as we have not
		used the <> operator, to specify a specific data type (more on this later). Because we can
		store any object type, the compiler issues warnings. It is not ideal to have an ArrayList which
		can store different object types (a complex discussion for the Java Foundations course)*/

		//Example2
		java.util.ArrayList myCDs2 = new java.util.ArrayList<String>();
		myCDs2.add("Billie Jean");
		//this code compiles with warnings
		//java uses unchecked or unsafe operations

		//Example3
		ArrayList<CD> myCDs3 = new ArrayList<CD>();
		//myCDs3.add("Billie Jean");  //compiler error

		//the ArrayList is considered to be 'type-safe'
		//only CD objects can be stored

		ArrayList<CD> myCDs4 = new ArrayList();
		myCDs4.add(new CD()); //fine

		/*inclusion of the second diamond operator is optional
		(on the instantiation of the ArrayList), if the first diamond
		operator has been specified (with a data type) on declaration
		*/

		//Example5
		List myCDs5 = new ArrayList();
		myCDs5.add(new CD());

		//Example9
		//ArrayList<> myCDs6 = new ArrayList<>();
		//Bad syntax. Both diamond operators can not be left empty

		//Example 10
		//ArrayList myCDs7 = new List();

		List<String> colloquialisms = new ArrayList<String>(2);
		//number 2 ensures minimum capacity for the ArrayList
		colloquialisms.add("How are ya?");
		colloquialisms.add("Top man");
		colloquialisms.add("Nice one");
		colloquialisms.add("Sorted");

		for (String s : colloquialisms) {
			System.out.println(s);
		}

		/*ArrayList things = new ArrayList();
		things.add(new ArrayListTutorDemo());
		ArrayListTutorDemo myArray = things.get(0);
		*/
		//the call to get(0) is ok // but the compiler does not know that the item added was a type of ArrayListTutorDemo

		ArrayList<Integer> id = new ArrayList<>();
		id.add(1); // [1]
		//id.add("student id"); // does not compile
		id.add(1, 8);
		System.out.println("id list: " + id);

		/*	List<Object> list1 = new ArrayList<>();
			list1.add(0, "element1"); // ["element1"]
			list1.add(1, "element2"); // ["element1", "element2"]
			list1.add(3, "element2"); // throws IndexOutOfBoundsException
		*/

		//what happens when you try to compile and run this class?
		/*List<String> artists = new ArrayList<>();
		try {
			artists.add(1, "Will Biteman");
			artists.add(2, "Hermann Longlegs");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (String artist : artists) {
			System.out.println(artist);
		}*/

		//What exception will be thrown if the program is invoked without arguments?
		/*try {
			int count = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.err.println("Error: Not a number");
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	}
	static class CD {}

}
