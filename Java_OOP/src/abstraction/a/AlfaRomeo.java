package abstraction.a;

public class AlfaRomeo extends ElectricCar implements Car, Drone{
	
	
	public AlfaRomeo() {
		System.out.println("Alfa Romeo: Constructor (Regular Class)");
	}
	
	public static void alfaRomeoInfo() {
		System.out.println("Alfa Romeo: info method");
	}
	
	public int alfaRomeoPrice(){
		int price = 65000;
		System.out.println("Alfa Romeo:  Price " + price);
		return price;	
		}

	@Override
	public void taxiRent() {
		System.out.println("Interface Taxi: rent method ");	
	}

	@Override
	public void taxiCarryingPassenger() {
		System.out.println("Interface Taxi: carrying passenger method ");
	}

	@Override
	public void truckCarryingGoods() {
		System.out.println("Interface Taxi: carrying goods method ");
	}

	@Override
	public void hoverCanFloat() {
		System.out.println("Interface Hover: can float method ");	
	}

	@Override
	public void droneLightWeight() {
		System.out.println("Interface Drone: light weight method ");
	}

	@Override
	public void carStart() {
		System.out.println("Interface Car: Start ");
		
	}

	@Override
	public String carStop() {
		String mString= "stop method"; 
		System.out.println("Interface Car: " + mString );
		return null;
	}

	@Override
	public void carBrake() {
		System.out.println("Interface Car: Brake ");
	}

	@Override
	public void electricPrice() {
		System.out.println("Abstract Electric: Price ");	
	}

	@Override
	public String elelctricCarName() {
		System.out.println("Abstract Electric: Name ");
		return null;
	}

	@Override
	public void flyingaAutoPilot() {
		System.out.println("Abstract Flying: Auto pilot Method ");
		
	}

}
