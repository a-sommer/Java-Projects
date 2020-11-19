 

package sommer11;

public class CruiseShip extends Ship {
	private int passengers;
	private String zone;
	
	public CruiseShip(String name, int year, boolean isAfloat, int passengers, String zone) {
		super(name, year, isAfloat);
		this.passengers = passengers;
		this.zone = zone;
	}

	public int getPassengers() {
		return passengers;
	}
	
	public String getZone() {
		return zone;
	}
	
	// Return a string representation of this object.
	public String toString() {
		return super.toString() + "\n" + passengers + " passenger capacity, operating in the " + zone;
	} 
}
