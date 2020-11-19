 

package sommer21;
import java.util.*;

public class TestTreeMap {

	public static void main(String[] args) {
		// Create an array of Employee objects
		Employee[] employees = {
			new Employee("12345", "Baker", "Tom", 200000),
			new Employee("56789", "Jones", "Dan", 130000),
			new Employee("24680", "Scott", "Ann", 90000),
			new Employee("13579", "Jones", "Pat", 80000),
			new Employee("11111", "Scott", "Bob", 65000),
			new Employee("23232", "Baker", "Amy", 100000),
			new Employee("45454", "Perez", "Ava", 105000),
			new Employee("67765", "Jones", "Don", 140000)};
				
		// Create an ArrayList from the employees array
		ArrayList<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(employees));
				
		// Display all employees
		System.out.println("All Employees\n");
				
		// For each employee object in employeeList...
		for(Employee e: employeeList) {
			// ...print all employees
			System.out.println(e);
			
		}
				
		// Create a TreeMap that uses Strings for keys and Employee as values
		TreeMap<String, Employee> treeMap = new TreeMap<String, Employee>();
		
		// For each employee object in employeeList...
		for (Employee e : employeeList) {
			
			// ...add elements to treeMap
			treeMap.put(e.getID(), e);
		}
		
		// Display all Employee by ID #
		System.out.println("\nEmployees By ID #\n");
		
		// Print all employees by ID # 
		treeMap.forEach((id, employee) -> System.out.println(employee));
	}
}
