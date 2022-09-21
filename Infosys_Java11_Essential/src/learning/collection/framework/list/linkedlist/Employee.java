package learning.collection.framework.list.linkedlist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private Integer employeeId;
	private String name;
	private Double salary;

	Employee(Integer employeeId, String name, Double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

//Below code receives object as argument to compare with the current calling object. 
//It compares employeeId of both the objects and returns the result in integer.
	@Override
	public int compareTo(Employee employee) {
		// Code helps to sort the employeeIds of current object and the object passed in
		// the argument
		if (employeeId == employee.employeeId)
			return 0;
		else if (employeeId > employee.employeeId) {
			return 1;
		} else
			return -1;
	}	
	
	@Override
	public String toString() {		
		return this.employeeId+" "+this.name+" "+this.salary;
	}
}