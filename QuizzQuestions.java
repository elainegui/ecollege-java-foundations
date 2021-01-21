package eCollegeJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuizzQuestions {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("Sandy");
		list.add("Joyce");
		list.add("Raymond");

		Iterator iterator = list.iterator();

		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println(element + " "); /*	//What is the output?
												int x, y, z = 10;
												System.out.println(x + y + z);*/

			//What value of x will be displayed in the console?
/*		int x = 9;
		while (x++ <= 18) {
			x += 5;
		}
		System.out.println(x);*/
		}
	}

	public void test() {
		return;
	}
}