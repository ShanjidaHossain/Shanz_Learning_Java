package OOP.Concept.Part1;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(5, 6);
		
	}
	
	public static void main(int m) {
		System.out.println("Main method can be overloaded but never used");
	}
	
	//Method Overloading --> When method name is same with different argument or input parameters within same class
	//You cannot create a method inside a method
	
	public void sum() { // 0 Parameter
		System.out.println("Sum Method -- Zero param");
	}
	
	public void sum(int i) { // 1 Parameter
		System.out.println("Sum Method -- 1 param");
		System.out.println(i);

	}
	
	public void sum(int i, int j) { //2 Parameter
		System.out.println("Sum Method -- 2 param");
		System.out.println(i+j);
	}

}
