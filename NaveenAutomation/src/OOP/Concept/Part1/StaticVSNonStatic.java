package OOP.Concept.Part1;

public class StaticVSNonStatic {
	
	// Static method and variable can be called directly or using class name
	// Non static method and variable require object to access them

	String nameString = "Shanjida" ; // non static Global variable
	static int age =  29;					// static Global variable
	
	public static void main(String[] args) {
		
		//how to call static method and variable
		sum(); // access them directly
		StaticVSNonStatic.sum(); // access using class name
		
		System.out.println(age);
		System.out.println(StaticVSNonStatic.age);

		//how to call non static method and variable
		StaticVSNonStatic obj = new StaticVSNonStatic();
		obj.sendMail();
		System.out.println(obj.nameString);
		
		// Can you access static method using object reference? Yes, but we should access it through static way
		obj.sum(); // not good practice
		StaticVSNonStatic.sum();
		
	}
	
	public void sendMail() { // non Static Method
		
	}
	
	public static void sum() { // static Method
		
	}

}
