package learning.collection.framework.list.linkedlist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class DemoSort {

	public static void main(String[] args) {
		List<String> employeeNames = Arrays.asList("Rachael", "Ross", "Monica", "Chandler", "Joey", "Phoebe");

		// Displaying employeeNames before sorting
		System.out.println(employeeNames);

		// list.sort() takes the implementation of Comparator interface for inducing the
		// ordering
		Comparator<String> compare1 = new SortImplementationOne();
		employeeNames.sort(compare1);

		// Displaying employeeNames after sorting based on natural ordering
		System.out.println(employeeNames);

		// list.sort() takes another implementation of Comparator interface for inducing
		// the ordering
		Comparator<String> compare2 = new SortImplementationTwo();
		employeeNames.sort(compare2);

		// Displaying employeeNames after sorting based on length of each element
		System.out.println(employeeNames);
	}
}