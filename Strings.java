package eCollegeJava;

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
	}

}
