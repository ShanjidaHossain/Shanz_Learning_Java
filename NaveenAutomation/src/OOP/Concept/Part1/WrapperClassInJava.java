package OOP.Concept.Part1;


public class WrapperClassInJava {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println( x + 99);
		
		int y = Integer.parseInt(x);
		System.out.println( y + 99);
		
		String i = "100";
		System.out.println(i+100);
		double j = Double.parseDouble(i);
		System.out.println(j+100);
		
		String b = "true";
		boolean bol = Boolean.parseBoolean(b);
		System.out.println(bol);
		
		int k = 10150;
		String s = String.valueOf(k);
		System.out.println(s);
		
		String u = "100A";
		int a = Integer.parseInt(u); //NumberFormatException -- for input 100A
		System.out.println(a);
		
	}

}
