package Person;

public class Person {

	String name;
	int age;
	boolean isCitizen;

	public Person(int age, boolean isCitizen) {
		this.age = age;
		this.isCitizen = isCitizen;
	}

	// Constructor that takes object of the type Person..
	// basically using constructor to initialize another constructor
	Person(Person o) {
		// o.intruductionPerson();
		o.canVote();
	}

	public boolean canVote() {
		if (age >= 18 && isCitizen == true) {
			return true;
		} else 
			return false;
	}

	public void intruductionPerson() {
		System.out.println("My name is  " + name + ". I am " + age + " years old. ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person intruductionPerson2() {
		System.out.println("My name is  " + name + ". I am " + age + " years old. ");
		return null;
	}

}
