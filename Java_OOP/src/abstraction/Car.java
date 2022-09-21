package abstraction;

public interface Car {
	
	public static final int carYear= 1859;
	//public static final String test= "hhh";
	
	public void carStart();
	public String carStop();
	public abstract void carBrake();
	
	
	public default void carHonk() {
		System.out.println("Interface Car: Honk from Car Interface.");
	}
	
	public static void carGear() {
		System.out.println("Interface Car: Gear Feature from Car interface");
	}

}
