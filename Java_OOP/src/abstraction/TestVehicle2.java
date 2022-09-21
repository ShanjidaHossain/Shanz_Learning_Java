package abstraction;

public class TestVehicle2 {

	public static void main(String[] args) {

		System.out.println("*************Instantiating Regular Class***************");
		
		AlfaRomeo alfaRomeo = new AlfaRomeo();
		alfaRomeo.electricPrice();
		alfaRomeo.electricBattery();
		AlfaRomeo.alfaRomeoInfo(); 
		alfaRomeo.alfaRomeoPrice();
		alfaRomeo.carStart();
		alfaRomeo.carStop();
		alfaRomeo.carBrake();
		alfaRomeo.carHonk();		

		System.out.println("*******Instantiating Car using Concrete Class************");

		Car car = new AlfaRomeo();
		car.carStart();
		car.carStop();
		car.carBrake();
		car.carHonk();
		Car.carGear();
		System.out.println("Electric car invented in  " +  Car.carYear);


		System.out.println("************Abstract Electric Car****************");
		ElectricCar eCar = new AlfaRomeo();
		eCar.electricBattery();
		eCar.electricPrice();

		System.out.println("**************Interface****************");
		Car car2 = new Car() { // Instantiated by anonymous inner car

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
			
		};	
		
		car2.carHonk();
		Car.carGear();
		car2.carStart();
		}
}
