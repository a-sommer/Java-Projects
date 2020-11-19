 


package sommer13;

import java.util.Date;

public class Reptile extends Pet implements Mobility {
	private String type;
	
	// Constructor
	public Reptile(String name, char gender, Date acquired, String type) {
		super(name, gender, acquired);
		this.type = type;
	}
	
	@Override
	public String move() {
		return "Must be caged, crawls or slithers";
	}
	
	@Override
	public String sound() {
		return "Not much sound, maybe a hiss";
	}
	
	// Return a string representation of this object.
	public String toString() {
		return "Reptile name = " + super.getName() + ", " + type + ", " + 
				super.getGender() + "\n" + move() + "\n" + sound() + ", acquired " +
				super.getAcquired();
	}

}
