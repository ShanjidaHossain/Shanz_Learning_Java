package programming.challenge;

public class SwapNumber {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swapNumbers(a, b);
		System.out.printf("a is %d, b is %d", a, b); // a is 10, b is 20
	}

	
		public static void swapNumbers(int a, int b) {
	    b = b + a;
		a = b - a;
		b = b - a;
	}
	
}
