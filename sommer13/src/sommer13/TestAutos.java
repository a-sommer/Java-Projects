  
// This program creates an ArrayList of five or six Automobiles. It displays the elements in the ArrayList,
// then sorts the autos by year and displays the ArrayList once more.

package sommer13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class TestAutos {
	
	public static void main(String[] args) {
		// Create an ArrayList with 5 or 6 Automobiles.
		Automobile hyundai = new Automobile("Hyundai", "IONIQ Hybrid", 2019, 22400);
		Automobile dodge = new Automobile("Dodge", "Challenger", 2016, 26995);
		Automobile toyota = new Automobile("Toyota", "Prius", 2017, 33100);
		Automobile porsche = new Automobile("Porsche", "911", 2000, 65590);
		Automobile ford = new Automobile("Ford", "F-150", 2014, 47895);
		
		Automobile[] cars = {hyundai, dodge, toyota, porsche, ford};
		
		// Create an ArrayList of type Automobile from the cars array
		ArrayList<Automobile> list = new ArrayList<>(Arrays.asList(cars));
		
		// Display message
		System.out.println("AN ARRAYLIST OF CARS IN MAIN");
		
		// Display elements in ArrayList.
		for (Automobile car : list)
		{
			// Display the car and it's details.
			System.out.println(car);
		}
		
		// Sort autos by year.
		Collections.sort(list);
		
		// Display message
		System.out.println("SORTED ARRAYLIST OF CARS IN MAIN");
		
		// Display sorted ArrayList.
		for (Automobile vehicle: list) {
			System.out.println(vehicle);
		}
		
		
	}
	
	

}
