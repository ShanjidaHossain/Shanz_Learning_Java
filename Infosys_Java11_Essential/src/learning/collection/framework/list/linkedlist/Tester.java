package learning.collection.framework.list.linkedlist;
import java.util.*;

class Tester {

	public static void main(String args[]) {
		// Creating a LinkedList
		List<String> cities = new LinkedList<String>();

		// Adding elements
		cities.add("Milan");
		cities.add("Venice");
		cities.add("Munich");
		cities.add("Vienna");

		// Displaying elements
		System.out.println(cities);

		// Inserting elements
		cities.add(3, "Prague");
		System.out.println(cities);

		// Removing elements
		cities.remove("Munich");
		System.out.println(cities);

		// Replacing element
		cities.set(2, "Berlin");
		System.out.println(cities);

		// Displaying size
		System.out.println(cities.size());

		// Checking if an element is present
		System.out.println(cities.contains("Paris"));

		// Getting element at specific position
		System.out.println(cities.get(0));

		// Clearing the elements from the LinkedList
		cities.clear();
		System.out.println(cities);

		// Try to test the other methods of the LinkedList class
	}
}