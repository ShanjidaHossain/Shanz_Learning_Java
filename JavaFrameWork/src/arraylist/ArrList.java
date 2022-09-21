package arraylist;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<String> books =  new ArrayList<String> (10);
		
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
		books.remove(0);
		
		System.out.println("Size of the Array: " + books.size()); // should be 11
		System.out.println(books + "\n"); // will print all the data in booksS
		
		for (String b : books) {// Print all the entry using for iterator
			System.out.println("Book genre at index: " + books.indexOf(b) + " - "+ b);
		}	
	}
}
