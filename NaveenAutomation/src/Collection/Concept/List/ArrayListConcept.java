package Collection.Concept.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		/*
		 * Dynamic Array - Size is not fixed 1. Can contain duplicate values/elements 2.
		 * Maintains insertion order 3. Synchronized 4. Allows Random Access
		 * 
		 * non generic vs generics:
		 * 
		 * non generics: ArrayList ar = new ArrayList(); --> Did not have to specifiy
		 * data type arr.add(1); ar.add(10.02);
		 * 
		 * Generic : Is now available after JDK 1.5 ArrayList<Integer> arr = new
		 * ArrayList<>();
		 */

		// Non Generic
		/*
		 * ArrayList arrayListNonGenericMixType = new ArrayList();
		 * arrayListNonGenericMixType.add(10); arrayListNonGenericMixType.add(10.2);
		 * arrayListNonGenericMixType.add('s');
		 * arrayListNonGenericMixType.add("Shanjida");
		 * arrayListNonGenericMixType.add(true);
		 * System.out.println(arrayListNonGenericMixType);
		 */

		// Generic
		ArrayList<Integer> arrIntType = new ArrayList<Integer>();
		arrIntType.add(1);
		arrIntType.add(2);
		arrIntType.add(3);
		arrIntType.add(0, 1);
		System.out.println(arrIntType);

		ArrayList<String> strDType = new ArrayList<String>();
		strDType.add("S");
		strDType.add("H");
		strDType.add("A");
		strDType.add("N");
		System.out.println(strDType);

		// Employee class object
		ArrayListConceptEmployee e1 = new ArrayListConceptEmployee("Shanjida", 29, "Dev");
		ArrayListConceptEmployee e2 = new ArrayListConceptEmployee("Hossain", 30, "QA");
		ArrayListConceptEmployee e3 = new ArrayListConceptEmployee("Yasmeen", 28, "DB");

		ArrayList<ArrayListConceptEmployee> objectArray = new ArrayList<ArrayListConceptEmployee>();
		objectArray.add(e1);
		objectArray.add(e2);
		objectArray.add(e3);

		// Use iterator to traverse the value in the list
		Iterator<ArrayListConceptEmployee> it = objectArray.iterator();
		while (it.hasNext()) {
			ArrayListConceptEmployee emp = (ArrayListConceptEmployee) it.next();
			System.out.println("---- Employee Information ---");
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		// addAll()
		ArrayList<String> strDType1 = new ArrayList<String>();
		strDType1.add("Developer");
		strDType1.add("Java");
		strDType1.add("SQL");
		strDType1.add("EF Core");

		ArrayList<String> strDType2 = new ArrayList<String>();
		strDType2.add("Automation");
		strDType2.add("Selenium");
		strDType2.add("TDD & BDD");
		strDType2.add("Cucumber");

		strDType1.addAll(strDType2);

		for (int i = 0; i < strDType1.size(); i++) {
			System.out.println(strDType1.get(i));
		}

	}

}
