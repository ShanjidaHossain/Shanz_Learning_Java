package learning.collection.framework.list.arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Student2Tester {
	public static void main(String[] args) {
		List<Student2> students = new ArrayList<Student2>();
		/*
		 * students.add(new Student(1001, "Steve", true)); students.add(new
		 * Student(1002, "Rachel", false)); students.add(new Student(1003, "Monica",
		 * true)); students.add(new Student(1004, "David", true));
		 */

		ListIterator<Student2> itr = students.listIterator();
		
		System.out.println("Display the student names");
		while (itr.hasNext()) {
			System.out.println(itr.next().getStudentName());
		}

		System.out.println("Display the student names in reverse order");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous().getStudentName());
		}

	}
}
