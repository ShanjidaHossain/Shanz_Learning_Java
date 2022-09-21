package OOP.Concept.Part1;

public class LocalVSGlobalMethod {
	
	//Global variable || Class variable
	String nameString = "TOM";
	int age = 25;
	

	public static void main(String[] args) {
		
		//Local Variable
		int i = 10;
		System.out.println(i);

		//To access global variable
		// Create object
		LocalVSGlobalMethod obj =  new LocalVSGlobalMethod();
		System.out.println(obj.nameString + ", " + obj.age);
		
		
		
	}

	public void sum() {
		int i = 10;
		int j = 20;
		int age = 25;
	}
}
