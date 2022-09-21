package exception;

public class UseOfTryCatchBlock {

	public static void main(String[] args) {
		try {
			int a =12;
			int b = 0;
			int divide = a/b;
			System.out.println(divide);
		}catch (ArithmeticException e) {
			System.out.println("Exception: "+ e);
		}

	}

}
