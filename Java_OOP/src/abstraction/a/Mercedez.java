package abstraction.a;

public class Mercedez extends SolarCar{
	
	public void mercedesInfo() {
		System.out.println("Mercedez : Invented in Germany");
	}

	@Override
	public void solarSpeed() {
		System.out.println("Abstract Solar: Speed Method from solar car Abstract class");
		
	}

	@Override
	public int solarCost() {
		int finalCost = 56000;
		System.out.println("Abstract Solar car cost: " + finalCost);
		return finalCost;
		
	}

	
}
