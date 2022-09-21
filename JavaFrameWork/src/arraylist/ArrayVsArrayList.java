package arraylist;
import java.util.ArrayList;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		System.out.println("\n************** Regular Variable **************");
		//Regular variable that holds data
		String n1 = "shanj";
		String n2 = "sazz";

		System.out.println(n1 + " " + n2);
		
		System.out.println("\n************** Array **************");
		// Array that holds lot of data, you can have Object and primitive data type
		String [] cars = {"Alfa","Range"}; // Can only have two since I declared only two, can be replaced
		cars[1] = "Rover";
		//cars[6] = "nissan"; -- out of bound.. array you cannot add more index
		System.out.println(  "Example 1: "+ cars[1] + ", " + cars[0]);

		String [] array =  new String[10];
		array[0] = "Shanjida";
		array[1] = "Hossain";
		System.out.println(  "Example 2: "+ array[0]);
		System.out.println("\nTo Print all use loop : \n");
		
		for (int i = 0; i <10; i++) {
			System.out.println(array[i] +": index in " + i);
		}
		System.out.println("\nLength of the array is: " + array.length);

		
		System.out.println("\n************** Array List **************");

		//Array List -- Size can be declared or not, if user add array lists will automatically expend
		ArrayList<String> books =  new ArrayList<String> (10);
		
		System.out.println("\n___________Original Array List");
		books.add("Comic"); //0
		books.add("Thriller");	
		books.add("Documents");	
		books.add("Romance");	
		books.add("Horror");	
		books.add("Law");	
		books.add("Business"); 
		books.add("Fiction");	
		books.add("Non Fiction");	
		books.add("Fantasy");	
		books.add("Science"); 
		books.add("Autobiography"); //11 - We declared only 10 but added this 11th one so array list will adjust to add this new entry
		
		System.out.println(books.get(11)); //will get the item in index 11
		System.out.println(books.size()); // should be 11
		System.out.println(books); // will print all the data in booksS
		
		System.out.println("Using for (Iterator for array - Type need to be specfic i.e string, int, double)");
		for (String b : books) {
			System.out.println("Book genre at index: " + books.indexOf(b) + " - "+ b);
		}
		
		System.out.println("Using for (Regular for loop, arraylist type doesn't matter)");
		for (int i = 0; i < books.size(); i++) {
			System.out.println( "For looop: "  +  books.get(i));
		}
		
		System.out.println("\n___________Removing index 0 from the Array List");
		books.remove(0); // will remove data in index 1
		System.out.println(books.size()); // now will print current size after removing should be 10
		System.out.println(books); // print new list 
		
		System.out.println("\n___________Adjusting the size and removing index 0 again from the Array List");
		books.trimToSize(); // if current allocation size reserved for books is 15 will trip it to what ever the array list size is
		books.remove(0); // again removing at index 0
		System.out.println(books.size()); // printing the size after removal
		System.out.println(books); // print the array list
		
		for (String b : books) {
			System.out.println("Book genre at index: " + books.indexOf(b) + " - "+ b);
		}

		System.out.println("\n___________Clearning entire Array List");
		books.clear(); // Clear entire array list
		System.out.println(books); // print array list, should be just one entry
		System.out.println(books.size());

		System.out.println("\n___________Adding new entry on the cleared Array List");
		books.add("Marvel"); // adding new entry to the empty list
		System.out.println(books); // print array list, should be just one entry
		System.out.println(books.size());

		
		
		
	}
}
