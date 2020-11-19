 

package sommer11;

public class Ship {
	
	private String name;
	private int year; 
	private boolean isAfloat;
	
	// Construct a ship object
	public Ship(String name, int year, boolean isAfloat) {
		this.name = name;
		this.year = year;
		this.isAfloat = isAfloat;
	}
	
	
	public boolean isAfloat() {
		
		// Return results
		return isAfloat;
	}
	
	// Set a new Afloat
	public void setAfloat(boolean isAfloat) {
		this.isAfloat = isAfloat;
	}
	
	// Get name
	public String getName() {
		return name;
	}
	
	// Get year
	public int getYear() {
		return year;
	}
	
	// Return a string representation of this object.
	public String toString() {
		return "Ship Name: " + name + ", year launched: " + year + ", is afloat: " + isAfloat;
	}
	


}
