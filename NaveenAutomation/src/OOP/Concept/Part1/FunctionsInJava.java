package OOP.Concept.Part1;

public class FunctionsInJava {

	//Starting point of execution
	public static void main(String[] args) {

		FunctionsInJava field = new FunctionsInJava();
		
		field.test();
		
		int i = field.add();
		System.out.println("Add Method:" + i);
		
		String s = field.dev();
		System.out.println("Dev  Method: " + s);
		
	    int div = field.division(98,8);
		System.out.println("Division  Method: " + div);

	}

	// non static method

	// void does not return any value
	public void test() {
		System.out.println("\n__Test method__");
	}

	// returns type = int
	public int add() { // no input , output only
		System.out.println("\n__Add method__");
		int a = 1;
		int b = 2;
		int c = a + b;
		return c;
	}

	// returns type = string
	public String dev() {// no input , output only
		System.out.println("\n__Dev Method__");
		String s = "Java";
		return s;
	}

	// return type = int
	// x,y --> input parameters/ arguments
	public int division(int x, int y) {
		System.out.println("\n__Division Method__");
		int d = x / y;
		return d;
	}

}
