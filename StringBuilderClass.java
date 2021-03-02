package eCollegeJava;

public class StringBuilderClass {

	public static void main(String[] args) {

		/* What is the output? */

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		// Method chaining
		b = b.append("f").append("g");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// Constructors
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal"); // StringBuilder(CharSequence ch or String s)
		StringBuilder sb3 = new StringBuilder(10);  // 10 is the capacity

		// The capacity is the number of characters the sequence can currently hold
		// The size is the number of characters in the sentence
		// In a String both size and capacity are the same

		// The default capacity for the StringBuilder is 16. Java automatically can
		// increase the capacity
		// if we add more caracters that increas the capacity

		// charAt, indexOf, length, substring

		// append
		System.out.println(sb2.append(true));
		System.out.println(sb2.append('E'));
		System.out.println(sb2.append(2.5F));

		// insert
		System.out.println(sb2.insert(5, false));

		// delete and chatAt
		StringBuilder sb4 = new StringBuilder("abcdef");
		sb4.delete(1, 3); // sb = adef
		// sb4.deleteCharAt(5); // throws an exception

		// reverse
		System.out.println(sb4.reverse());

		// toString
		StringBuilder sb5 = new StringBuilder("java");
		String s1 = "java";


		System.out.println(s1.equals(sb5.toString()));
		System.out.println(s1 == (sb5.toString()));


		// StringBuilder Equality
		StringBuilder sb6 = new StringBuilder("animal");
		StringBuilder sb7 = new StringBuilder("animal");
		StringBuilder sb8 = sb6;

		System.out.println();
		System.out.println(sb6 == sb7);
		System.out.println(sb6.equals(sb7)); // StringBuilder does not implement equals()
		System.out.println(sb8 == sb6);

		// capacity
		System.out.println(sb6.capacity()); // 22 (16+22)

		// setCharAt
		sb6.setCharAt(0, 'A');
		System.out.println(sb6);  // Animal

		// substring
		StringBuilder letters = new StringBuilder("abcdefg");
		int total = letters.substring(6, 6).length();
		System.out.println(total);


	}

}
