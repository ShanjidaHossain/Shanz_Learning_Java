package learning.collection.framework.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Brian");
		names.add("Ross");
		names.add("Steve");
		names.add("Rachel");
		names.add("Steve");

		// Checking whether any element is present
		if (names.isEmpty()) {
			System.out.println("No names are present!!");
		}

		// Displaying the number of names in the list
		System.out.println("Number Of names: " + names.size());

		// Creating newNames list
		List<String> newNames = new ArrayList<String>();
		newNames.add("Emily");
		newNames.add("Melissa");

		// Adding elements of newNames list into names list
		names.addAll(newNames);

		// Displaying all names
		System.out.println("The list of names: ");
		System.out.println("========================================");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("========================================");

		// Checking whether the name Ross is present or not
		if (names.contains("Ross")) {
			System.out.println("The name is present already!!!");
		} else {
			System.out.println("The name is not present!!");
		}

		// Converting list to array
		Object[] namesArray = names.toArray();

		// Deleting all the items from the orders
		names.clear();

		System.out.println(names.isEmpty());
	}

}
