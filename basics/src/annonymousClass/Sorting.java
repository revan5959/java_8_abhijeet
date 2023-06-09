package annonymousClass;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "Revan", "revans@gmail.com"));
		list.add(new Person(2, "Nikhil", "nikhil@gmail.com"));
		list.add(new Person(3, "Kiran", "kiran@gmail.com"));
		list.add(new Person(4, "Nitin", "abcNitin@gmail.com"));
		list.add(new Person(5, "sudhakar", "sudhakar@gmail.com"));

		//sort based on the names
		Collections.sort(list, new HelperClass());// should pass object of only Comparator

		for (Person p : list)
			System.out.println(p);

	}

}
