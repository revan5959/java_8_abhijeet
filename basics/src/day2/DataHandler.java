package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataHandler {

	public void sortByName(List<Customers> custList) {

		Comparator<Customers> cum = new Comparator<Customers>() {

			@Override
			public int compare(Customers o1, Customers o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}

		};

		Collections.sort(custList, cum);

		System.out.println("----------Customer Sorting by Name-----------");
		for (Customers custSortName : custList)
			System.out.println(custSortName);

	}

	public void sortByAge(List<Customers> custList) {

		Comparator<Customers> cum = new Comparator<Customers>() {

			@Override
			public int compare(Customers o1, Customers o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}

		};

		Collections.sort(custList, cum);
		System.out.println("----------Customer Sorting by Age-----------");

		for (Customers custSortAge : custList)
			System.out.println(custSortAge);
	}

	public static void main(String[] args) {

		List<Customers> custList = new ArrayList<>();
		custList.add(new Customers(123, "Revan", 21));
		custList.add(new Customers(101, "Abhi", 44));
		custList.add(new Customers(333, "Rahuli", 24));
		custList.add(new Customers(212, "Bhavani", 10));

		DataHandler dataHandler = new DataHandler();

		dataHandler.sortByAge(custList);
		dataHandler.sortByName(custList);
	}
}
