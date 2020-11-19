 

package sommer13;

import java.util.Date;

public class Dog extends Pet implements Comparable<Dog>, Mobility {
	private String breed;
	private int weight;
	
	public Dog(String name, char gender, Date acquired, String breed, int weight) {
		super(name, gender, acquired);
		this.breed = breed;
		this.weight = weight;
	}
	
	
	public String getBreed() {
		return breed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String move() {
		return "Walks on a leash";
	}
	
	@Override
	public String sound() {
		return "Barks or howls";
	}
	

	// Return a string representation of this object.
	public String toString() {
		return "Dog name = " + super.getName() + ", " + breed + ", " + super.getGender() + "\n" +
				move() + ", weight " + weight + "\n" + sound() + ", acquired " + super.getAcquired();
	}
	

	@Override
	public int compareTo(Dog o) {
		if (getWeight() > o.getWeight())
		{
			return 1;
		}
		else if (getWeight() < o.getWeight())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}

}
