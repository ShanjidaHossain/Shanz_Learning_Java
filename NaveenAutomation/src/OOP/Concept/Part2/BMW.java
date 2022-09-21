package OOP.Concept.Part2;

public class BMW extends Car {
	
	//Method overriding
	//when some method is present in parent class as well as child class with the same name and number of arguments
	public void start() {
		System.out.println("BMW -------- Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW -------- Theftsafety");
	}
	
}
