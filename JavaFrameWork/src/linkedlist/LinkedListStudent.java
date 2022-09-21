package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

import arraylist.Cuny;

public class LinkedListStudent {

	public static void main(String[] args) {

		LinkedList<Student> list = new LinkedList<Student>();

		Student s1 = new Student(101, "Shanjida ", "Bachelor");
		Student s2 = new Student(102, "Sazzad ", "Masters");

		list.add(s1);
		list.add(s2);

		System.out.println("\n____________using iterator___________");
		System.out.println("Size of the Linked List: " + list.size());

		ListIterator<Student> i = list.listIterator();
		while (i.hasNext()) {
			Student currentCuny = i.next();
			System.out.println(currentCuny.id + " , " + currentCuny.name + " , " + currentCuny.className);
		}

		System.out.println("\n____________Using for each___________");
		System.out.println("Size of the Linked List: " + list.size()); // should be 11

		for (Student s : list) {
			System.out.println(s.id  + " , " + s.name + " , " + s.className);
		}
	}

}
