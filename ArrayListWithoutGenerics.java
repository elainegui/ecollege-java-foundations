package eCollegeJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithoutGenerics {

	public static void main(String[] args) {
		//List<Integer> partList = new ArrayList<Integer>();

		//java example using syntax prior to Java 1.5
		List partList = new ArrayList(3);

		partList.add(new Integer(1111));
		partList.add(new Integer(2222));
		partList.add(3333);
		partList.add("Oops a string!");

		//Iterator<> elements = partList.iterator(); //Iterator has to have an argument <E>
		Iterator<Object> elements = partList.iterator();
		while (elements.hasNext()) {
			Object partNumberObject = (elements.next()); //error RuntimeException: ClassCastException
			//	int partNumber = partNumberObject;

			System.out.println("Part number : " + partNumberObject);
		}

		ArrayList myFriends = new ArrayList();
		//no compiler error
		//That's java4 , when Generics did not exist
		//if we do nor specify the data type the array list will store Object types

		//Question
		//which the following statements will enable to compile and display:
		//Jennifer Allison Phillipa Sue?

		ArrayList names = new ArrayList();
		//ArrayList names = new ArrayList(3);
		//ArrayList names = new ArrayList<>(3);
		//ArrayList names = new ArrayList<String>();
		//ArrayList<String> names = new ArrayList<String>();
		//ArrayList<String> names = new ArrayList<>();
		//ArrayList<String> names = new ArrayList<String>(3);

		names.add("Jennifer");
		names.add("Alison");
		names.add("Phillipa");
		names.add("Sue");

		/*for (String s : names) {
			System.out.print(s + " ");
		}*/

		/*for (int i = 0; i < names.length(); i++) {
		
		}*/

		Iterator it = names.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		/*we are using a raw type. A raw type is a generic type that hasn't been parameterized
		 * ArrayList is a generic type, so you really should parameterize it with the type of elements
		 *  that you expect to be inside the list
		 *  my loop variable is type String. A type Object cannot be converted in this case to a smaller type String.
		 *
		 * In the normal for loop, the length() method is not recognized
		 *
		 * changing for the type Iterable, however, I don't care what the element type of Iterable is, because every
		 * object can be printed using println method
		*/

		//Question
		//Does the code compile?
/*		ArrayList al = new ArrayList<String>();
		al.add("Duke");
		al.add(new String("Duke J"));*/

		//the code compiles with warnings

	}
}
