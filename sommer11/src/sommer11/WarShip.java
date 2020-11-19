 

package sommer11;

public class WarShip extends Ship {
	private String type;
	private String nation;
	
	
	public WarShip(String name, int year, boolean isAfloat, String type, String nation) {
		super(name, year, isAfloat);		
		this.type = type;
		this.nation = nation;
	}
	
	// Return a string representation of this object.
	public String toString() {
			return super.toString() + "\n" + "Type: " + type + ", operated by " + nation;
	}

}
