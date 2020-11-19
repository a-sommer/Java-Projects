 


package sommer13;
import java.util.Date;

public abstract class Pet {
	protected String name;
	protected char gender;
	protected Date acquired;
	
	public Pet(String name, char gender, Date acquired) {
		this.name = name;
		this.gender = gender;
		this.acquired = acquired;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public Date getAcquired() {
		return acquired;
	}
	
	// Abstract method Sound
	public abstract String sound();
	
}
