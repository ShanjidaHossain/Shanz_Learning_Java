package abstraction.a;

public abstract class ElectricCar extends FlyingCar implements HoverCar{
	
	public String electricName = "Tesla";
	public int electricCost = 450000;
	
	public ElectricCar() {
		System.out.println("Abstract Electric : Constructor");
	}
	
	public abstract void electricPrice(); //method declared
	public abstract String elelctricCarName();

	public  void electricBattery() {// method implemented
		System.out.println("Abstract Electric: The Battery is very efficient");
		
	}
	

}
