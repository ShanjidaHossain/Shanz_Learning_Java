package programming.challenge;

public class String_Immutable {

	public static void main(String[] args) {
		String s1 = "Java"; // "Java" String created in pool and reference assigned to s1

		String s2 = s1; // s2 is also having the same reference to "Java" in the pool

		System.out.println(s1 + " = " +  s2 + ": ");
		System.out.println(s1 == s2); // proof that s1 and s2 have same reference
		System.out.println();
		s1 = "Python";

		System.out.println(s1 + " = " +  s2 + ": ");
		System.out.println(s1 == s2);
		System.out.println();

		
		System.out.println(s2);
		// prints "Java" supporting the fact that original String value is unchanged,
		// hence String is immutable

	}

}
