package com.youtube.mosh;

import java.util.Arrays;

public class Learning_String {

	public static void main(String[] args) {
		String s = "Hello World !" ;
		System.out.println(s);
		
		
		System.out.println("\n_________Determine String Length__________\n");		
		
		if (s.length() == 0) {
		    System.out.println("s is empty");
		}
		else System.out.println("s isn't empty, it's: " + s + "\n");
		
		
		
		System.out.println("\n_________Finding Characters and Substrings__________\n");		
		
		String example = "This should be complicated enough to show some things we should show";
		System.out.println("String is : "+ example);
		System.out.println("\nFind the characters at the indexes given");
		System.out.println(example.charAt(0));
		System.out.println(example.charAt(5));

		// An StringIndexOutOfBoundsException is thrown in both these cases:
		// System.out.println(example.charAt(-1));
		// System.out.println(example.charAt(200));

		System.out.println("\nFind the index of characters or substrings");
		System.out.println(example.indexOf('s')); // returns the first occurence of 's'
		System.out.println(example.indexOf('s', 4)); // the first 's' after index 4
		System.out.println(example.indexOf("should")); // the index of the first "should" in our string
		System.out.println(example.indexOf("should", 15)); // the index of the first "should" in our
		                                                   // string _after_ index 15
		System.out.println("\nFind the last index of characters or substrings");
		System.out.println(example.lastIndexOf('s')); // returns the first occurence of 's' when we look backwards from the end of the string
		System.out.println(example.lastIndexOf('s', 45)); // searches for 's' backwards from the position 45
		System.out.println(example.lastIndexOf("should")); // returns the position at which the substring 'should' appears, looking backwards from the end of the string
		System.out.println(example.lastIndexOf("should", 20)); // finds substring 'should' from position 20 backwards, and returns the position at which it begins

		System.out.println("indexOf(int ch, int fromIndex) is often used in loops, when we want to do something for every occurrence of a character in a String.");
		int foundAt = -1;
		while (true) {
		    foundAt = example.indexOf('s', foundAt + 1);
		    if (foundAt == -1)
		        break;
		    else {
		        // do something with that information
		    }
		}
		
		System.out.println("_________ Compare to __________");		
		System.out.println("a".compareTo("a"));
		System.out.println("a".compareTo("b"));
		System.out.println("1".compareTo("12345678"));
		System.out.println("2".compareTo("12345678"));
		System.out.println("abcd".compareTo("abgggggggggg"));
		System.out.println("ORANGE".compareTo("apple")); 

		System.out.println("_________ Removing WhiteSpace__________");		

		String ourString = "      Any non-leading and non-trailing whitespace is  \n  preserved       ";
		System.out.println(ourString.trim());
		
		
		System.out.println("_________Splitting and Joining Strings_________");
		
		String ourFruits = "apples, oranges, pears, pineapples";
		String[] fruits = ourFruits.split(",");

		System.out.println(Arrays.toString(fruits));

		// This is a great place to use the aforementioned trim() method
		// to remove the space at the beginning of some of the words
		for(int i = 0; i < fruits.length; i++) {
		    fruits[i] = fruits[i].trim();
		}

		System.out.println(Arrays.toString(fruits)); // Arrays.toString() formats the output array on its own

		
		
		
		
		
		
	}

}
