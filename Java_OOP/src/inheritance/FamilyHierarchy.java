package inheritance;

public class FamilyHierarchy {
	public static void main (String [ ] args) {
		Person person = new Person();
		person.personInfo();
		
		
		System.out.println("\n** Grand Father Info **");
		GrandFather grandFather = new GrandFather();
		grandFather.grandFatherInfo();
		
	
		System.out.println("\n** Dad Info **");
		Father father = new Father ();
		father.grandFatherInfo();
		father.fatherInfo();
		
		System.out.println("\n** My Info **");
		Me me = new Me();
		me.myInfo();	
		me.fatherInfo();
		me.grandFatherInfo();
		
		System.out.println("\n** Aunt Info **");
		Aunt aunt = new Aunt();
		aunt.auntInfo();
		aunt.grandFatherInfo();
		
		System.out.println("\n** Cousin Info **");
		Cousin_Aunt cousin = new Cousin_Aunt();
		cousin.cousinInfo();
		cousin.auntInfo();
		cousin.grandFatherInfo();	
	
	}
	
}
