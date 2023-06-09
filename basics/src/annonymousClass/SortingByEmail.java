package annonymousClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingByEmail {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "Revan", "revans@gmail.com"));
		list.add(new Person(2, "Nikhil", "nikhil@gmail.com"));
		list.add(new Person(3, "Kiran", "kiran@gmail.com"));
		list.add(new Person(4, "Nitin", "abcNitin@gmail.com"));
		list.add(new Person(5, "sudhakar", "sudhakar@gmail.com"));

	

		Comparator<Person> com = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getEmail().compareToIgnoreCase(o2.getEmail());
			}
		};

		Collections.sort(list, com);
					// OR
		//Collections.sort(list, new HelperClass());// 

		System.out.println("Using Annonymous class");
		for (Person p : list)
			System.out.println(p);
	}

}
