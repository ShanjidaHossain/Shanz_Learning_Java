package programming.challenge;

public class Factorial_of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 5l;
		System.out.println(factorial(n));

	}
	
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
