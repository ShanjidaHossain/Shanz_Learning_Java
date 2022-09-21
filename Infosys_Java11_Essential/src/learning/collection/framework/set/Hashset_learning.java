package learning.collection.framework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Hashset_learning {
	public static void main(String[] args) {
		HashSet<String> food = new HashSet<String>(); // Creating HashSet

		// Create HashSet
		food.add("Pasta"); // Add elements to the hash set
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		
		//printing all users
		for (String tempFood : food) {
			System.out.println(tempFood);
		}
		
		//creating Iterator object using iterator() method
		Iterator<String> iterator = food.iterator();
		//using hasNext() method to find if next element is present
		while(iterator.hasNext()) {
		        //using next() method to get the next element
				System.out.println(iterator.next());
		}	
		
		// Creating HashSet
		HashSet<String> food2 = new HashSet<String>(); 
		//Creating List
		List<String> foodList = new ArrayList<String>();
		foodList.add("Pasta"); 
		foodList.add("Noodles");
		foodList.add("Sandwich");
				
		// Add elements to the hashset from list
		food.addAll(foodList);

	}

}
