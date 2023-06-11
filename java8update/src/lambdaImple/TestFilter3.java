package lambdaImple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(5);
		list.add(50);
		list.add(20);
		list.add(3);
		list.add(4);

		List<Integer> list2 = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(list2);

		
	}

}
