package lambdaImple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestFilter4 {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(97875887, "Revan", "Siddu"));
		list.add(new Person(14555554, "Vinod", "ambur"));
		list.add(new Person(52477889, "Deepak", "garu"));
		list.add(new Person(25478899, "Arun", "karan"));
		list.add(new Person(10045588, "Bhavani", "patil"));

		List<Person> collect = list.stream().filter(e -> e.getName().toCharArray().length > 5)
				.collect(Collectors.toList());
		list.forEach(e -> System.out.println(e));// forEach(consumer type functional interface)
		// System.out.println(collect);
		System.out.println("--------------------------------------------------------------");
		Consumer<Person> con = e -> System.out.println(e);
		list.forEach(con);

	}

}
