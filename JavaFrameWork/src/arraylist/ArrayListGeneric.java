package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListGeneric {

	public static void main(String[] args) { // Generic mean same type, specific type
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//Insertion order
		arrayList.add(1);
		arrayList.add(500);
		arrayList.add(79);
		arrayList.add(301);
		arrayList.add(5);
		arrayList.add(557);
		arrayList.add(791);
		arrayList.add(10);
		System.out.println("\nBiggest number : " + Collections.max(arrayList));

		System.out.println("\nUsing for each Unsorted List :");
		for (Integer i : arrayList) {
			System.out.println(arrayList.indexOf(i) + ": " + i);
		}

		Collections.sort(arrayList);

		System.out.println("\nUsing for each Sorted List : ");
		for (Integer i : arrayList) {
			System.out.println(arrayList.indexOf(i) + ": " + i);
		}

		System.out.println("\nUsing Iterator  : ");
		Iterator i = arrayList.iterator();
		while (i.hasNext()) {
			Object object = i.next();
			System.out.println(object);

		}

		System.out.println("\n__Using for each Sorted List : ");
		// for(DataType giveVariableName : fromWhichArrayList)
		for (Integer a : arrayList) {
			if (a < 100) {
				System.out.println(a);
			}
		}

	}

}
