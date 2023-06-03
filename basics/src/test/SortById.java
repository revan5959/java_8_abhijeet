package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortById {

	public static void main(String[] args) {

		ArrayList<HelperCLasss> list = new ArrayList<>();
		list.add(new HelperCLasss("Revan", 123));
		list.add(new HelperCLasss("Abhi", 102));
		list.add(new HelperCLasss("Siddu", 99));
		list.add(new HelperCLasss("Kavya", 59));

		Collections.sort(list, new HelperCLasss());
		
		for(HelperCLasss h : list)
			System.out.println(h);
	}

}
