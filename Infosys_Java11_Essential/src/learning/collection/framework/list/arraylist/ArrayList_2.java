package learning.collection.framework.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(); // Creating an ArrayList object
		// Adding the element to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		System.out.println("My number list: " + numbers);

		// Adding the number 15 at a particular index (index: 2) in the ArrayList
		numbers.add(2, 15);
		System.out.println("Observe the second index: " + numbers);

		// Finding the size of the ArrayList
		System.out.println("The array size: " + numbers.size());

		// Retrieving the element at a specified index
		System.out.println("The number present at the fifth index is: " + numbers.get(5));

		// Modifying the element at a specified index
		numbers.set(2, 200);
		System.out.println("The number at the 2nd index is changed from 2 to 200: " + numbers);

		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		System.out.println("My number list: " + numbers);

		// Adding the number 15 at a particular index (index: 2) in the ArrayList
		numbers.add(2, 15);
		System.out.println("Observe the second index: " + numbers);

		// Finding the size of the ArrayList
		System.out.println("The array size: " + numbers.size());

		// Retrieving the element at a specified index
		System.out.println("The number present at the fifth index is: " + numbers.get(5));

		// Modifying the element at a specified index
		numbers.set(2, 200);
		System.out.println("The number at the 2nd index is changed from 2 to 200: " + numbers);

	}

}
