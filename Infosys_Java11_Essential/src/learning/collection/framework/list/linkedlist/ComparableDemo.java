package learning.collection.framework.list.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableDemo {
	public static void main(String[] args) {
		//creating employee objects
		Employee employee1 = new Employee(341, "John", 35000.00);
		Employee employee2 = new Employee(103, "Sam", 30000.00);
		Employee employee3 = new Employee(221, "Albert", 40000.00);
		
		//Adding employee objects to list
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		//Displaying employee objects before sorting
		System.out.println(employeeList);
		
		// Below sort() method uses compareTo() method to sort the given objects
		Collections.sort(employeeList);
		
		//Displaying employee objects after sorting
		System.out.println(employeeList);	
		
	}
}
