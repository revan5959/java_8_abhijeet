package javaguides_java_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		// Create a steram
		Stream<String> stream = Stream.of("Java ", "Spring Boot ", "Rest API ");
		stream.forEach(System.out::print);

		System.out.println();
		// create stream from source
		Collection<String> collection = Arrays.asList("AWS CLOUD ", "DSA ", "Data Strcuture");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::print);

		System.out.println();

		List<String> list = Arrays.asList(" TypeScript ", " Javascript ", " Angular");
		list.stream().forEach(System.out::print);

		System.out.println();

		Set<String> set = new HashSet<String>(list);
		Stream<String> stream3 = set.stream();
		stream3.forEach(System.out::print);

		String[] strArray = { "A", "R", "E", "H" };
		Stream<String> stream4 = Arrays.stream(strArray);
		stream4.forEach(System.out::print);
	}

}
