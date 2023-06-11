package javaguides_java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("Bannana");
		list.add("Apple");
		list.add("Orange");

		// Natural Order
		List<String> lists1 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(lists1);

		List<String> list2 = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(list2);

		List<String> list3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list3);

		// Descending Order
		List<String> list4 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list4);
		List<String> list5 = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(list5);

		// Sorting Employee

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Revan", 29, 400000));
		empList.add(new Employee(20, "Kiran", 39, 350000));
		empList.add(new Employee(30, "Abhishek", 26, 800000));
		empList.add(new Employee(40, "Nitin", 19, 200000));

		System.out.println("----------Sorting-----------Ascending");
		List<Employee> empListSortedAsc1 = empList.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(empListSortedAsc1);

		List<Employee> empListSortedAsc2 = empList.stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList());

		List<Employee> empListSortedAgeAsc2 = empList.stream().sorted(Comparator.comparingInt(Employee::getAge))
				.collect(Collectors.toList());

		List<Employee> empListSortedAgeAsc3 = empList.stream().sorted((o1,o2)-> o1.getAge()- o2.getAge()).collect(Collectors.toList());
		
		List<Employee> empListSortedNameAsc1 = empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println(empListSortedNameAsc1);
		
		System.out.println("----------Sort-----------Descending");
		List<Employee> empListSortedDsc1 = empList.stream().sorted((o1, o2) -> (int) -(o1.getSalary() - o2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(empListSortedDsc1);

		List<Employee> empListSortedDsc2 = empList.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		
		List<Employee> empListSortedAgeDsc2 = empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		List<Employee> empListSortedNameDsc1 = empList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		System.out.println(empListSortedNameDsc1);
		

	}

}
