 

package sommer21;

public class Employee {
	
	// Attributes
	private String id = null;
	private String lastName = null;
	private String firstName = null;
	private int salary = 0;
	
	// Construct an Employee Object
	public Employee(String id, String lastName, String firstName, int salary) {
		
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		
	}
	
	String getID() {
		return id;
	}
	
	String getLastName() {
		return lastName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	int getSalary() {
		return salary;
	}
	
	// Return a string representation of this object.
	public String toString() {
		
		// Format salary
		String strSalary = String.format("$%,3d", salary);
		
		return "ID " + getID() + ":" + getLastName() + ", " + getFirstName() +
				", salary " + strSalary;
	}

}