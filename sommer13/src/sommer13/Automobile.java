 


package sommer13;


public class Automobile implements Comparable<Automobile> {
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Automobile(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public String getMake() {
		return make; 
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public int compareTo(Automobile o) {
		if (getYear() > o.getYear())
		{
			return 1;
		}
		else if (getYear() < o.getYear())
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	
	// Return a string representation of this object.
	public String toString() {
		return  "Make: " + make + ", Model: " + model + ", year made: " + year + ", Price: $" +  String.format("%,3.2f", price);
	}
}
