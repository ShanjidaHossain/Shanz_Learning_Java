package car.project;

public class Car {
	
	int minSpeed = 0;
	int maxSpeed = 100;
	
	double weight = 4079;
	
	boolean isTheCarOn =  false;
	char condition = 'A';
	String nameOfCarString = "Lucy";
	
	double maxFuel =  16;
	double currentFuel = 8;
	double mpg = 26.4;
	
	int numOfPeopleInCar = 1;
	int maxCapacity = 6;
	
	public Car() {
		
	}
	
	public Car (int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
		maxSpeed = customMaxSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;		
	}
	
	public void printVariable( ) {
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Min Speed: " + minSpeed);
		System.out.println("Car weight: " + weight);
		System.out.println("Is car On: " + isTheCarOn);
		System.out.println("How new is the car: " + condition);
		System.out.println("Name of the car: " + nameOfCarString);
		System.out.println("How many people in the car: " + numOfPeopleInCar);

	}
	
	public void getIn() {
		if(numOfPeopleInCar < maxCapacity) {
		numOfPeopleInCar ++;
		System.out.println("Someone got in the car ! " + numOfPeopleInCar);
		}else 
		System.out.println("The car is full ! " + numOfPeopleInCar + " = " + maxCapacity);
	}
	
	public void getOut() {
		if(numOfPeopleInCar > 0) {
		numOfPeopleInCar --;
		}else {
			System.out.println("No one is in the car ! " + numOfPeopleInCar);
		}
	}

	public double howManyMilesToOutGas() {
		return currentFuel * mpg;
	}
	
	public double maxMilesPerFillUp() {
		return maxFuel / mpg;
	}
	
	public void wreakCar( ) {
		condition = 'C';
	}
	
	public void upgradeMinSpeed() {
		minSpeed= maxSpeed;
		maxSpeed = maxSpeed + 1 ;
	}
	
	public void turnTheCarOn() {
		
		if (isTheCarOn == false) {
			isTheCarOn = true;			
		} else {
			System.out.println("The car is already on !" + isTheCarOn);
		}
		
	}
	
	public static void main(String[] args) {

		//testing
		Car myCar =  new Car();
		myCar.getOut();
		myCar.getOut();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.getIn();
		myCar.turnTheCarOn();
		myCar.turnTheCarOn();

	}

}
