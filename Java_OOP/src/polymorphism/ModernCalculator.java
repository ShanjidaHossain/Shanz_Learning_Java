 package polymorphism;

public class ModernCalculator extends LandCalculator {

	@Override
	public int landCalc(int a, int b, int c) {
		int total1 = a + b - c;
		System.out.println("Total area from local calculator : " + total1);
		return total1;
	};
	
	@Override
	public int landCalc(int a, int b) {
		int total2 = a - b * 99;
		System.out.println("Total area from local calculator : " + total2);
		return total2;
	};

	@Override
	public int landCalc(int a, int b, String c) {
		int total3 = a + 9 + b - Integer.parseInt(c);
		System.out.println("Total area from local calculator : " + total3);
		return total3;
	};

	@Override
	public int landCalc(int f, String d, int e) {
		int total4 = f - Integer.parseInt(d) + e;
		System.out.println("Total area from local calculator : " + total4);
		return total4;
	};

	/*
	@Override
	public final int landCalc(int a, int b, int c, int d) {
		int total5 = a + b + c + d;
		System.out.println("Total area from local calculator : " + total5);
		return total5;
	};

	@Override
	public static int landCalc(int a, int b, int c, int d, int e) {// Static method being over loaded
		int total6 = a + b + c + d + e;
		System.out.println("Total area from local calculator : " + total6);
		return total6;
	};
*/
	@Override
	public void landCalc(int a, int b, int c, int d, int e, int f) {
		int total7 = a * b + c + d + e * f + 3555;
		System.out.println("Total area from local calculator : " + total7);
	};

	@Override
	public void landCalc() {
		System.out.println("void type with no parameter ");
	};
}
