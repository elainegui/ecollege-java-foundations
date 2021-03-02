package eCollegeJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics {

	public static void main(String[] args) {
		// constructor
		// syntax pre Java 5

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);


		// if we do nor specify the data type the array list will store Object types
		List partList = new ArrayList(3);
		partList.add(new Integer(1111));
		partList.add(new Integer(2222));
		partList.add(3333);
		partList.add("Oops a string!");

		// toString
		System.out.println(partList);
		System.out.println(partList.toString());

		// ArrayList implements toString()




		// Question
		// which the following statements will enable to compile and display:
		// Jennifer Allison Phillipa Sue?

		ArrayList names = new ArrayList();
		// ArrayList names = new ArrayList(3);
		// ArrayList names = new ArrayList<>(3);
		// ArrayList names = new ArrayList<String>();
		// ArrayList<String> names = new ArrayList<String>();
		// ArrayList<String> names = new ArrayList<>();
		// ArrayList<String> names = new ArrayList<String>(3);

		names.add("Jennifer");
		names.add("Alison");
		names.add("Phillipa");
		names.add("Sue");

		/*
		 * for (String s : names) {
		 * System.out.print(s + " ");
		 * }
		 */



	}
}
