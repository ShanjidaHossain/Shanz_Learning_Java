package polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("\n-----------Land Calculator-----------");
		LandCalculator lc = new LandCalculator();
		lc.landCalc(1, 2, 3);
		lc.landCalc(3, 4);
		lc.landCalc(1, 1, '2');
		lc.landCalc(1, "5", 1);
		lc.landCalc(2, 2, 2, 2);
		LandCalculator.landCalc(1, 1, 1, 1, 1); // Static called directly using class name
		lc.landCalc(1, 2, 3, 4, 5, 6);
		lc.landCalc();
		
		ModernCalculator mc = new ModernCalculator();
		
		mc.landCalc(2, 5);
		mc.landCalc(1, 1, '2');
		mc.landCalc(1, "5", 1);
		mc.landCalc(2, 2, 2, 2);
		mc.landCalc(1, 2, 3, 4, 5, 6);

	}

}
