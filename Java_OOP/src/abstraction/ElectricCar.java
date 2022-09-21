package abstraction;

public abstract class ElectricCar {
	
	public String electricName = "Tesla";
	public int electricCost = 450000;
	
	public ElectricCar() {
		System.out.println("Abstract Electric : Constructor");
	}
	
	public abstract void electricPrice(); //method declared
	//public abstract String elelctricCarName();

	public  void electricBattery() {// method implemented
		System.out.println("Abstract Electric: The Battery is very efficient");
		
	}
	

}
