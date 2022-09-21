
public class AwesomeJava {

	public static void main(String[] args) {
		call();
		Cat.phurr();
		
		Cat myCat = new Cat();
		myCat.name = "sansa";
		myCat.age = 6 ;
		System.out.println(myCat.name + ", " + myCat.age);

		Cat myCat2 = new Cat();
		myCat.name = "stella";
		myCat.age = 5 ;
		
		Cat myCat3 = new Cat();

	}
	
	private static void call() {
		System.out.println("Hey you !");

	}

}
