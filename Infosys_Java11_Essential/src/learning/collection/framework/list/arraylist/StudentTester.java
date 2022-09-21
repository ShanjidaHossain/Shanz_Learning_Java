package learning.collection.framework.list.arraylist;

import java.util.ArrayList;
import java.util.List;

class StudentTester {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1001, "Steve", true));
		studentList.add(new Student(1002, "Rachel", false));
		studentList.add(new Student(1003, "Monica", true));
		studentList.add(new Student(1004, "David", true));

		List<String> studentNames = new ArrayList<String>();
		// Iteration of the studentList using for-each loop
		for (Student student : studentList) {
			studentNames.add(student.getStudentName());
			System.out.println("Student ID : " + student.getStudentId());
			System.out.println("Student Name : " + student.getStudentName());
			System.out.println("Course Registered : " + student.getCourseRegistered());
		}
		System.out.println("Student Names : " + studentNames);

	}
}