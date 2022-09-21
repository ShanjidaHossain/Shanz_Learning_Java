package abstraction;

public class TestVehicle {

	public static void main(String[] args) {

		System.out.println("***************************************");
		
		AlfaRomeo alfaRomeo = new AlfaRomeo();
		alfaRomeo.electricPrice();
		alfaRomeo.electricBattery();
		AlfaRomeo.alfaRomeoInfo(); 
		alfaRomeo.alfaRomeoPrice();
		alfaRomeo.carStart();
		alfaRomeo.carStop();
		alfaRomeo.carBrake();
		alfaRomeo.carHonk();		

		System.out.println("****************************************");

		Car car = new AlfaRomeo();
		car.carStart();
		car.carStop();
		car.carBrake();
		car.carHonk();
		Car.carGear();
		System.out.println("Electric car invented in  " +  Car.carYear);


		System.out.println("***************************************");
		ElectricCar eCar = new AlfaRomeo();
		eCar.electricBattery();
		eCar.electricPrice();


	}
}
