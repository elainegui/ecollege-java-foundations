package eCollegeJava;

public class ArrayListAutoboxUnbox {

	public static void main(String[] args) {
		Integer intObject = new Integer(1);
		int intPrimitive = 2;

		Integer tempInteger;
		int tempPrimitive;

		tempInteger = new Integer(intPrimitive);
		tempPrimitive = intObject.intValue();

		tempInteger = intPrimitive; //Auto box
		tempPrimitive = intObject; //Auto unbox

		//obs: be careful when using autobox in loops,
		//there's a performance cost in using this feature

	}

}
