package polymorphism;

public class LandCalculator {
	
/*
Method Overloading : 
	--Also known as-- has different name : Early, Static binding or Compile time polymorphism 
Same method name but with different set of parameter or different combination of parameter

Polymorphism : Ability to take many form

*/
	
	
	public int landCalc(int a, int b, int c) {
		int total1 = a + b + c;
		System.out.println("Total area from local calculator : " + total1);
		return total1;
	};
	
	public int landCalc(int a, int b) {
		int total2 = a + b;
		System.out.println("Total area from local calculator : " + total2);
		return total2;
	};
	
	public int landCalc(int a, int b, String c) {
		int total3 = a + b + Integer.parseInt(c);
		System.out.println("Total area from local calculator : " + total3);
		return total3;
	};
	
	public int landCalc(int f,  String d, int e) {
		int total4 = f  + Integer.parseInt(d) + e;
		System.out.println("Total area from local calculator : " + total4);
		return total4;
	};
	
	public final int landCalc(int a, int b, int c, int d) {
		int total5 = a + b + c + d;
		System.out.println("Total area from local calculator : " + total5);
		return total5;
	};
	
	public static int landCalc(int a, int b, int c, int d, int e) {//Static method being over loaded
		int total6 = a + b + c + d + e;
		System.out.println("Total area from local calculator : " + total6);
		return total6;
	};
	
	public void landCalc(int a, int b, int c, int d, int e, int f) {
		int total7 = a + b + c + d + e + f;
		System.out.println("Total area from local calculator : " + total7);
	};
	
	public void landCalc() {
		System.out.println("void type with no parameter ");
	};
	
}
