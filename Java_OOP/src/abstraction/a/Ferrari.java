package abstraction.a;

public class Ferrari extends Mercedez implements Rocket{
	
	public void ferarriInfo() {
		System.out.println("Ferrari: Invented in Italy");
	}

	@Override
	public void rocketExpensive() {
		System.out.println("Interface Rocket: Expensive method from Rocket interface");
		
	}
}
