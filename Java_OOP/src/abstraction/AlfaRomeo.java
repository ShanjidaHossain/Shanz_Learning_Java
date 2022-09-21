package abstraction;

public class AlfaRomeo extends ElectricCar implements Car{
	
	
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
	public void carStart() {
		System.out.println("Interface Car: Start ");		
	}

	@Override
	 public String carStop() {
		String mString= "stop method"; 
		System.out.println("Interface Car: " + mString );
		return mString;
	}

	@Override
	public void carBrake() {
		System.out.println("Interface Car: Brake ");		
	}

	@Override
	public void electricPrice() {
		 System.out.println("Abstract Electric: Price "); 
		
	}

	
}
