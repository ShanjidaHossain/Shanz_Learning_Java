package testingg;
public class Tester {
	public static void main(String[] args) {
		Demo object1 = new Demo();
		Demo object2 = object1;

		object1.value1 += 1;
		object1.value2 += 1;

		System.out.println("For Object 1--");
		object1.display();
		System.out.println("For Object 2--");
		object2.display();
	}
}