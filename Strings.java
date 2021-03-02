package eCollegeJava;

import java.util.StringTokenizer;

public class Strings {

	public static void main(String[] args) {
		String str = "This is index of example";
		int index = str.lastIndexOf('s', 5);
		System.out.println(index);

		String javaFoundations = new String("Java Foundations");
		String jFoundations = "Java Foundations";
		System.out.println(javaFoundations == jFoundations);
		System.out.println(javaFoundations.equals(jFoundations));
		System.out.println(javaFoundations.compareTo(jFoundations));

		String s1 = new String("dinghy");
		String s2 = "dinghy";
		String s3 = s2;
		s1 = s1.concat("rubber");
		s2.concat(s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1 + " " + s2);

		// String constructors
		String st = "hello";
		char charsStr[] = { 'h', 'e', 'l', 'l', 'o' };
		String st2 = new String(charsStr);
		String st3 = new String(st);
		String st4 = new String(charsStr, 2, 3);  // llo

		// indexOf
		String a = "animal";
		System.out.println("index: " + a.indexOf("a", 6));
		System.out.println("index: " + a.indexOf("w", 1));

		// substring
		System.out.println("substring: " + a.substring(3, 3));
		System.out.println("substring: " + a.substring(3, 6));
		// System.out.println("substring: " + a.substring(3, 9)); //Exception
		// System.out.println("substring: " + a.substring(3, 2)); // Exception


		// startsWith() and endsWith()
		System.out.println("abc".startsWith("a"));


		// contains
		System.out.println("abc".contains("c"));

		// replace
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc

		// trim
		System.out.println("abc");
		System.out.println("\t a b c\n ".trim());
		System.out.println();


		// String Equality
		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x == z); // false
		System.out.println(x.equals(z));  // true

		String y = "Hello World!" + "";
		String w = "Hello World!";
		System.out.println(y == w); // true ??????????????
		System.out.println(x == y); // false

		// charAt
		x.charAt(1); // 'e'

		char chars[] = new char[2];
		int start = 0;
		int end = x.length() - 1;

		x.getChars(start, 2, chars, 0); // ?????????????????????????
		System.out.println(chars);  // ????????????????????????


		// StringTokenizer
		String record = "name=Jane Doe,address=1010 Main St.,city=Anycity";
		StringTokenizer tokenizer = new StringTokenizer(record, "=,");
		while (tokenizer.hasMoreTokens()) {
			String key = tokenizer.nextToken();
			String value = tokenizer.nextToken();
			System.out.println(key + ": " + value);
		}
		System.out.println();

		// intern
		String sr = new String("some string");
		String sr2 = new String("some string");
		System.out.println(sr == sr2);

		sr = sr.intern();
		sr2 = sr2.intern();
		System.out.println(sr == sr2);


	}

}
