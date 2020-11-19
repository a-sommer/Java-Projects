 

package sommer11;

public class CargoShip extends Ship {
	private String cargo;
	private int capacity;
	
	public CargoShip(String name, int year, boolean isAfloat, String cargo, int capacity) {
		super(name, year, isAfloat);		
		this.cargo = cargo;
		this.capacity = capacity;
	}
	
	
	// Return a string representation of this object.
	public String toString() {
			return super.toString() + "\n" + "Capacity of " + cargo + " is " + capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	

}
