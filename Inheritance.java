package eCollegeJava;

public class Inheritance {
//What is the output of the program?
	public static void main(String[] args) {
		//Peach peach = new Peach();
		//System.out.println(peach.getOrigin());
	}
}

/*class Peach extends Fruit {

	public Peach() {
		this("unknown");
	}

	public Peach(String peach) {
		super(peach);
	}
}*/

class Fruit {

	private String origin = "Ireland";

	public Fruit(String origin) {
		this.origin = origin;
	}

/*	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;*/
}