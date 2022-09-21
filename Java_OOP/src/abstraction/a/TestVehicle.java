package abstraction.a;

import java.time.Year;

public class TestVehicle {

	public static void main(String[] args) {

		System.out.println("************************************"
				+ "\nAll this Method are implemented from AlfaRomeo using Extend and Impletement "
				+ "\n************************************");
		AlfaRomeo alfaRomeo = new AlfaRomeo();
		alfaRomeo.electricPrice();
		alfaRomeo.elelctricCarName();
		alfaRomeo.electricBattery();
		alfaRomeo.flyingaAutoPilot();
		alfaRomeo.flyingFeature();
		alfaRomeo.solarCost();
		alfaRomeo.solarSpeed();
		AlfaRomeo.alfaRomeoInfo(); // static method can be calling using class name it belongs to (class or
									// interface)
		alfaRomeo.alfaRomeoPrice();
		alfaRomeo.ferarriInfo();
		alfaRomeo.mercedesInfo();

		alfaRomeo.carStart();
		alfaRomeo.carStop();
		alfaRomeo.carBrake();
		alfaRomeo.carHonk();
		// alfaRomeo.carGear(); - static method, static can't be called by object
		Car.carGear();
		alfaRomeo.droneLightWeight();
		alfaRomeo.hoverCanFloat();
		alfaRomeo.rocketExpensive();
		alfaRomeo.taxiRent();
		alfaRomeo.taxiCarryingPassenger();
		alfaRomeo.truckCarryingGoods();

		System.out.println("************************************ "
				+ "\nCar Cannot instantiate a interface, you will need concrete class such as AlfaRomeo that has "
				+ "no unimplemented method since interface Car can't be instantiated " 
				+ "\n************************************");
		// Car car = new Car();

		Car car = new AlfaRomeo();
		car.carStart();
		car.carStop();
		car.carBrake();
		car.carHonk();
		Car.carGear();
		car.taxiRent();
		System.out.println("Electric car invented in  " +  Car.carYear);


		System.out.println("************************************ "
				+ "\nElectric Car, cannot instantiate because there are unimplemented method,"
				+ " you can instantiate using concrete method like alfaromeo "
				+ "\n************************************");
		// ElectricCar electricCar = new ElectricCar();
		ElectricCar eCar = new AlfaRomeo();
		eCar.electricBattery();
		eCar.elelctricCarName();
		eCar.rocketExpensive();
		eCar.mercedesInfo();
		eCar.solarSpeed();
		eCar.solarCost();
		eCar.ferarriInfo();
		eCar.flyingaAutoPilot();
		eCar.hoverCanFloat();
		System.out.println("Electric car name : " + eCar.electricName + ". Car price:  " +  eCar.electricCost);

	}
}
