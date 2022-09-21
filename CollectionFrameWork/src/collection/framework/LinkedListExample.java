package collection.framework;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		System.out.println("Array : Can hold anything, any type data, Cons: After size declaration size shink or expanded");
		String [] nameArrayStrings = new String[4];
		String [] nameArrayStrings2 = {"Sansa", "Gulfam", "Kofil"};
		System.out.println(nameArrayStrings2);
		
		
		System.out.println("Linked list and ArrayList : Collection framework, implement List interface");
		System.out.println("*******************");
		System.out.println(" Array List: \nFastest to find item, Cons: Can only hold Objects. Time + Space to add and remove item");
		ArrayList<String> namesaArrayList =  new ArrayList<>();
		namesaArrayList.add("Sansa");
		namesaArrayList.add("Kofil");
		namesaArrayList.add("Sofa-nizba");
		namesaArrayList.add("Gulfam");
		
		System.out.println(" Linked: \nFastest to Add or Remove item, Cons: Searching a value, will go thorugh entire list");
		LinkedList<String> namesLinkedList =  new LinkedList<>();
		namesLinkedList.add("Sansa");
		namesLinkedList.add("Kofil");
		namesLinkedList.add("Sofa-nizba");
		namesLinkedList.add("Gulfam");

		
		
	
	}

}
