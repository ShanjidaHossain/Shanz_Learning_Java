package OOP.Concept.Part1;

public class Car {

	int model;
	int wheel;

	public static void main(String[] args) {

		// new Car() --> Object for car class
		// nissan, audi, tesla --> reference

		Car nissan = new Car();
		Car audi = new Car();
		Car tesla = new Car();

		nissan.model = 2015;
		nissan.wheel = 4;

		audi.model = 2020;
		audi.wheel = 4;

		tesla.model = 2021;
		tesla.wheel = 4;

		System.out.println("Before assigning reference");
		System.out.println(nissan.model);
		System.out.println(nissan.wheel);

		System.out.println(audi.model);
		System.out.println(audi.wheel);

		System.out.println(tesla.model);
		System.out.println(tesla.wheel);
		
		
		System.out.println("After assigning reference");
		nissan = audi;
		audi = tesla;
		tesla = nissan;
		System.out.println(nissan.model=2022);
		System.out.println(nissan.wheel);

		System.out.println(audi.model);
		System.out.println(audi.wheel);

		System.out.println(tesla.model);
		System.out.println(tesla.wheel);
	}

}
