package OOP.Concept.Part2;

public class TestCar {

	public static void main(String[] args) {
	
		//Compile time polymorphism, static polymorphism
		BMW b =  new BMW();
		b.start();
		b.stop();
		b.theftSafety();
		b.engine();
		
		System.out.println(" --------------------- ");
		
		Car c = new Car();
		c.start();
		c.stop();
		
		
		System.out.println(" --------------------- ");
		
		Car  car =  new BMW(); //child class object can be referred by parent class reference variable - dynamic polymorphism - run time
		car.start();
		car.stop();
		car.refuel();
		
		//Down casting -- is not allowed but possible through casting and will give ClassCastException
		BMW bmw = (BMW) new Car();

	}

}
