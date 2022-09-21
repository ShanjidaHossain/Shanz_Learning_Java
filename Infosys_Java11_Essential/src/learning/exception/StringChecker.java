package learning.exception;
class StringChecker {
	public void divideByStringLength() {
		String[] sarr = { "Hi", "hello", "" };
		int[] numarr = { 1, 0, 5 };
		try {
			for (int i = 0; i < numarr.length; i++) {
				System.out.println("value:"+numarr[i+1]/sarr.length);
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());			
		}
		//no catch block for ArrayIndexOutOfBoundsException
		//Exception gets propagated to calling environment
		finally {
			System.out.println("In inner finally");
		}
	}
	public static void main(String[] args) {
		StringChecker checker = new StringChecker();
		try {
			checker.divideByStringLength();
		}
		//Exception catch block can catch any Exception
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("In outer finally");
		}
	}
}
