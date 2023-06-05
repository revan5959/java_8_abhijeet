package lambdaImple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingByName {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "Revan", "revans@gmail.com"));
		list.add(new Person(2, "Nikhil", "nikhil@gmail.com"));
		list.add(new Person(3, "Kiran", "kiran@g mail.com"));
		list.add(new Person(4, "Nitin", "abcNitin@gmail.com"));
		list.add(new Person(5, "sudhakar", "sudhakar@gmail.com"));

		Comparator<Person> com = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};

		Collections.sort(list, com);

		for (Person p : list)
			System.out.println(p);

		////////// LAMBDA IMPLEMENTATION for the above anonymous
		////////// class///////////////////
System.out.println("////////// LAMBDA IMPLEMENTATION for the above anonymous");
		Comparator<Person> com1 = (e1, e2) -> {
			return e1.getEmail().compareToIgnoreCase(e2.getEmail());
		};

		Collections.sort(list, com1);
		for (Person p : list)
			System.out.println(p);
	}

}
