 

package sommer20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		// Create an array of Employee objects
		Employee[] employees = {
				new Employee("23232", "Baker", "Amy", 100000),
				new Employee("11111", "Scott", "Bob", 65000),
				new Employee("12345", "Baker", "Tom", 200000),
				new Employee("24680", "Scott", "Ann", 90000),
				new Employee("56789", "Jones", "Dan", 130000),
				new Employee("45454", "Perez", "Ava", 105000),
				new Employee("67765", "Jones", "Don", 140000),
				new Employee("13579", "Jones", "Pat", 80000)};
		
		// Create an ArrayList from the employees array
		ArrayList<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(employees));
		
		// Sort employeeList by last name, then by first name
		java.util.Collections.sort(employeeList, Comparator.comparing(Employee::getLastName)
				.thenComparing(Employee::getFirstName));
		
		// Display message
		System.out.println("Staff Alpha sorted by names");
		System.out.println();
		// Display all employees alphabetically sorted by name
		employeeList.forEach(e -> System.out.println(e));
		System.out.println();		
		
		// Create a LinkedList from employeeList
		LinkedList<Employee> linkedList = new LinkedList<Employee>(employeeList);
		
		// Create an iterator capable of cycling forward and
		// backward through the linkedList
		ListIterator<Employee> listIterator = linkedList.listIterator();
		
		// Iterate forward through the linkedList
		// without generating any output
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		
		// Display all employees in reverse alphabetical order
		System.out.println("Staff sorted Reverse Alpha");
		System.out.println();
		
		listIterator = linkedList.listIterator(linkedList.size());
		// Iterate backwards through linkedList to
		// print the employees in reverse alphabetical order
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
