package JavaBasics;

import java.util.Iterator;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array stores similar data type  [ 1 D (One Dimention Array)
		
		/*  Disadvantage of Array
		 * -- Size is fixed thus it's a static array - To over come this problem we use -- Collection -- ArrayList, HashTable -- Dynamic Array
		 * -- Store only similar type of data -- To overcome this we use -- object array --
		 */		
			
		
		System.out.println("\n1.__Array : int __");
		
		int i []= new int [4];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		
		System.out.println("Size of the Array: " + i.length);
		System.out.println("Value at index 3: " + i[2]);
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException
		
		for (int j = 0; j < i.length; j++) {//Print all the values in the array
			System.out.println("Index is now "  + j + ", and value is : "+ i[j]);
		}
		System.out.println("\n+++++++++++++++++++\n");

		
		System.out.println("\n2.__Array : double__");
		double d []= new double [4];
		d[0] = 1.20;
		d[1] = 2.20;
		d[2] = 3.30;
		d[3] = 4.40;
		System.out.println("Size of the Array: " + d.length);
		System.out.println("Value at index 3: " + d[2]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException
		
		//Print all the values in the array
		
		for (int j = 0; j < d.length; j++) {
			System.out.println("Index is now "  + j + ", and value is : "+ d[j]);
		}
		System.out.println("\n+++++++++++++++++++\n");

		
		System.out.println("\n3.__Array : char__");
		char c []= new char[4];
		c[0] = 'A';
		c[1] = '2';
		c[2] = 'C';
		c[3] = '$';
		System.out.println("Size of the Array: " + c.length);
		System.out.println("Value at index 3: " + c[2]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException
		
		//Print all the values in the array
		
		for (int j = 0; j < c.length; j++) {
			System.out.println("Index is now "  + j + ", and value is : "+ c[j]);
		}
		System.out.println("\n+++++++++++++++++++\n");
		
		
		
		System.out.println("\n4.__Array : boolean__");
		boolean b[]= new boolean[2];
		b[0] = true;
		b[1] = false;

		System.out.println("Size of the Array: " + b.length);
		System.out.println("Value at index 2: " + b[1]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException
		
		//Print all the values in the array
		
		for (int j = 0; j < b.length; j++) {
			System.out.println("Index is now "  + j + ", and value is : "+ b[j]);
		}
		System.out.println("\n+++++++++++++++++++\n");
		
		
		
		System.out.println("\n5.__Array : String__(String is a class not data type)");
		String s[]= new String[4];
		s[0] = "Shanjida";
		s[1] = "Hossain";
		s[2] = "Yasmeen";

		System.out.println("Size of the Array: " + s.length);
		System.out.println("Value at index 2: " + s[1]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException
		
		//Print all the values in the array	
		for (int j = 0; j < s.length; j++) {
			System.out.println("Index is now "  + j + ", and value is : "+ s[j]);
		}
		System.out.println("\n+++++++++++++++++++\n");
		
		
		System.out.println("\n6.__Array : Object (Class-- Super class of all the classes--Is used to store different data types");
		
		Object o[] = new Object[6];
		o[0] = "Tom";
		o[1] = 25;
		o[2] = 12.33;
		o[3] = 1/1/1990;
		o[4] = 'F';
		o[5] = "New York";
		
		System.out.println("Length of the object : " + o.length);
		
		for (int j = 0; j < o.length; j++) {
			System.out.println("Index is now "  + j + ", and value is : "+ o[j]);
		}
		
		
		
		
	}

}
