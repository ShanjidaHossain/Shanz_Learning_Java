package learning.collection.framework.list.arraylist;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0, 1);
		list.add(1, 4);
		list.add(2, 7);
		list.add(2, 8);
		System.out.println("Printing List 1: " + list);

		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("Apple");
		fruit.add("Grapes");
		fruit.add("Orange");
		System.out.println("Printing List 1: " + fruit);

		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("banana");
		list2.add("apple");
		System.out.println("Printing List 2: " + list2);
		System.out.println("Size of list2 is : " + list2.size());

		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("banana");
		list1.add("apple");
		//list.addAll(list1);
		System.out.println(list);
		System.out.println("Printing List 1: " + list2);
    
	}

}