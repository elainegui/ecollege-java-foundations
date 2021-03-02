package eCollegeJava;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {

		// add
		// it has 2 method signatures:
		// boolean add (E element)
		// void add (int index, E element)

		ArrayList list = new ArrayList();
		System.out.println(list.add("hawk"));
		System.out.println(list.add(Boolean.TRUE));
		// System.out.println(list.add(4, "robin"));
		list.add(1, 1); // primitive added

		System.out.println(list);


		// remove
		// it has 2 method signatures:
		// boolean remove (Object object)
		// E remove (int index)

		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.remove("cardinal")); // prints false
		System.out.println(birds.remove("hawk")); // prints true
		System.out.println(birds.remove(0)); // prints hawk
		System.out.println(birds); // []


		// set
		birds.add("hawk"); // [hawk]
		System.out.println(birds.size()); // 1
		birds.set(0, "robin"); // [robin]
		System.out.println(birds.size()); // 1
		// birds.set(1, "robin"); // IndexOutOfBoundsException

		System.out.println(birds.set(0, "blue jay"));  // robin

		System.out.println();



		// isEmpty and size
		birds = new ArrayList<>();
		System.out.println(birds.isEmpty()); // true
		System.out.println(birds.size()); // 0
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.size()); // 2



		// clear
		birds.clear();
		System.out.println(birds.isEmpty());


		// contains
		birds.add("hawk"); // [hawk]
		System.out.println(birds.contains("hawk")); // true



		// equals
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); // true
		one.add("a"); // [a]
		System.out.println(one.equals(two)); // false
		two.add("a"); // [a]
		System.out.println(one.equals(two)); // true


		// putting primitives in the ArrayList
		// It is not allowed. What happens is that they are automatically autoboxed into
		// wrapper classes
		// Since java 5 the autoboxing is automatic
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		// int h = heights.get(0); //NullPointerException
		Integer h = heights.get(0);
		System.out.println(h); // null

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);
		System.out.println(numbers);



		// toArray - Converting from ArrayList into array
		birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("robin");
		Object[] objectArray = birds.toArray(new String[0]);
		System.out.println("\ntoArray:" + objectArray.length); // 2
		String[] stringArray = birds.toArray(new String[0]);
		System.out.println(stringArray.length); // 2


		//@formatter:off
		/*ArrayList knows how to convert itself to an array. The only problem
		is that it defaults to an array of class Object. This isn’t usually what you want. Line 8
		specifies the type of the array and does what we actually want. The advantage of specifying
		a size of 0 for the parameter is that Java will create a new array of the proper size for the
		return value. If you like, you can suggest a larger array to be used instead. If the ArrayList
		fits in that array, it will be returned. Otherwise, a new one will be created.*/
		//@formatter:on

		Object[] objectArray2 = birds.toArray(new String[0]);
		System.out.println("\ntoArray:" + objectArray2.length); // 2
		String[] stringArray2 = birds.toArray(new String[0]);
		System.out.println(stringArray2.length); // 2
		String[] stringArray3 = birds.toArray(new String[20]);
		System.out.println(stringArray2.length); // 2


		// Array.asList - Converting from Array into ArrayList

		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> listBird = Arrays.asList(array); // returns fixed size list
		System.out.println(listBird.size()); // 2
		listBird.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array)
			System.out.print(b + " "); // new test
		// listBird.remove(1); // throws UnsupportedOperation Exception

		//@formatter:off
		/*Line 21 converts the array to a List. Note that it isn’t the java.util.ArrayList we’ve
		grown used to. It is a fi xed-size, backed version of a List. Line 23 is okay because set()
		merely replaces an existing value. It updates both array and list because they point to the
		same data store. Line 24 also changes both array and list. Line 25 shows the array has
		changed to new test. Line 26 throws an exception because we are not allowed to change
		the size of the list.*/
		//@formatter:on


		// Varargs
		List<String> listArgs = Arrays.asList("one", "two");

		// It's a good way to create an ArrayList
		// We can easily create and populate a List in one line


		// sort
		// We use a helper class to sort an ArrayList
		int i = 3;
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(99);
		numbersList.add(5);
		numbersList.add(81);
		Collections.sort(numbersList);
		System.out.println(numbersList); // [5, 81, 99]


		// equals
		// ArrayList overrides equals
		List<Integer> numList1 = Arrays.asList(1, 3, 5);
		List<Integer> numList2 = Arrays.asList(1, 3, 5);

		if (numList1.equals(numList2))
			System.out.println("equal");
		if (numList1 == numList2)
			System.out.println("==");

		numList1 = new ArrayList<>();
		// numList1.remove(0); // IndexOutOfBoundsException





		//@formatter:off
		/*
		Which of the following are true statements about the following code? (Choose all that
				apply)*/

			List<Integer> ages = new ArrayList<>();
				ages.add(Integer.parseInt("5")); //autoboxing

				ages.add(Integer.valueOf("6"));
				//ages.add(7);  //autoboxing
				ages.add(null);

				//for (int age : ages) System.out.print(age);  //Exception

				System.out.println();

			/*	A. The code compiles.
				B. The code throws a runtime exception.
				C. Exactly one of the add statements uses autoboxing.
				D. Exactly two of the add statements use autoboxing.
				E. Exactly three of the add statements use autoboxing.*/

		//formatter:on





		/*
		 * // Iterator<> elements = partList.iterator(); //Iterator has to have an
		 * argument
		 * // <E>
		 * Iterator<Object> elements = partList.iterator();
		 * while (elements.hasNext()) {
		 * Object partNumberObject = (elements.next()); // error RuntimeException:
		 * ClassCastException
		 * // int partNumber = partNumberObject;
		 *
		 * System.out.println("Part number : " + partNumberObject);
		 * }
		 *
		 * Iterator it = names.iterator();
		 *
		 * while (it.hasNext()) {
		 * System.out.print(it.next() + " ");
		 * }
		 */

		/*
		 * we are using a raw type. A raw type is a generic type that hasn't been
		 * parameterized
		 * ArrayList is a generic type, so you really should parameterize it with the
		 * type of elements
		 * that you expect to be inside the list
		 * my loop variable is type String. A type Object cannot be converted in this
		 * case to a smaller type String.
		 *
		 * In the normal for loop, the length() method is not recognized
		 *
		 * changing for the type Iterable, however, I don't care what the element type
		 * of Iterable is, because every
		 * object can be printed using println method
		 */

		// Question
		// Does the code compile?
/*
 * ArrayList al = new ArrayList<String>();
 * al.add("Duke");
 * al.add(new String("Duke J"));
 */

		// the code compiles with warnings



	}

}
