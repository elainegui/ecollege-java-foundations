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
		java.util.ArrayList myCDs2 = new java.util.ArrayList();
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
		List<CD> myCDs5 = new ArrayList<CD>();
		myCDs5.add(new CD());

		//Example9
		//ArrayList<> myCDs6 = new ArrayList<>();
		//Bad syntax. Both diamond operators can not be left empty

		//Example 10
		//ArrayList myCDs7 = new List();

	}
	static class CD {}
}
