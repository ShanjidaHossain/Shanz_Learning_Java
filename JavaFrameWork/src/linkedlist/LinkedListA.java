package linkedlist;

import java.util.LinkedList;

public class LinkedListA {

	public static void main(String[] args) {

		LinkedList<String> linked =  new LinkedList<String> ();
		
		linked.addFirst("United Kingdom");
		linked.add("Bangladesh");
		linked.add("America");
		linked.add(3, "Africa");
		linked.add("Canada");
		linked.add("Japan");
		linked.addLast("Italy");

		System.out.println("\n____________Original Linked List___________");
		for (String l : linked) {
			System.out.println("Element at " +  linked.indexOf(l) + ": "+ l);
		}
		
		System.out.println("Size of the Linked List: "+ linked.size());
		System.out.println("First element of the Linked List: "+ linked.getFirst()); 		
		System.out.println("Last element of the Linked List: "+ linked.getLast());

		
		
		
		System.out.println("\n______After removing first and last element____");
		linked.removeFirst();
		linked.removeLast();
		
		for (String l : linked) {
			System.out.println("Element at " +  linked.indexOf(l) + ": "+ l);
		}
		
		System.out.println("Size of the Linked List: "+ linked.size());
		System.out.println("First element of the Linked List: "+ linked.getFirst()); 		
		System.out.println("Last element of the Linked List: "+ linked.getLast());

		System.out.println("\n______After clearing linkedlist____");
		linked.clear();
		System.out.println(linked);
	}
	
}
