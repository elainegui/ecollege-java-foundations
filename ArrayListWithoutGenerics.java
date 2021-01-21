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

	}
}
