 

package sommer11;


import java.util.ArrayList;
import java.util.Arrays;

public class ShipTest {
	
	public static void main(String[] args) {
		
		// Make two objects with declared type Ship
		// but actual type CruiseShip
		Ship cruiseShip = new CruiseShip("Magic", 1998, true, 2700, "Caribbean");
		Ship cruiseShip2 = new CruiseShip("Titanic", 1912, false, 1300, "Atlantic Ocean");
		
		// Make one object of declared type Ship but actual type CargoShip
		Ship cargoShip = new CargoShip("El Faro", 1974, false, "containers", 391);
		
		// Make one object of declared type CargoShip and actual type CargoShip
		CargoShip cargoShip2 = new CargoShip("Seawise Giant", 1979, false, "crude oil", 564763);
		
		// Make a ship of declared type WarShip and actual type WarShip
		WarShip warShip = new WarShip("USS Nimitz", 1972, true, "super carrier", "United States Navy");
		
		// Code all of these ships into
		// an array of type Ship named fleet
		Ship[] fleet = {cruiseShip, cruiseShip2, cargoShip, cargoShip2, warShip};
		
		// Display message
		System.out.println("AN ARRAY OF SHIPS IN MAIN");
		
		// Display all ships and their data
		for (Ship ship: fleet) {
			System.out.println(ship);
		}
		
		// Create an ArrayList of type Ship from the fleet array
		ArrayList<Ship> list = new ArrayList<>(Arrays.asList(fleet));
		
		// Display message
		System.out.println("ARRAYLIST OF SHIPS FROM A METHOD");
		
		// Pass this ArrayList to a method named ShipShow
		// that also displays all ships and returns an integer
		int result = shipShow(list);
		
		// Display how many ships sank
		System.out.println(result + " of these ships sank!");
		
	}
	
	// This method removes the CargoShip that was declared,
	// adds another warShip instance to the ArrayList
	// Processes the ArrayList and print the data for each ship
	// Count the number of ships that are not afloat
	// and returns the number of ships that sank. 
	public static int shipShow(ArrayList<Ship> list) {
		
		// Remove the cargoShip
		list.remove(2);
		
		// Add another WarShip instance to the ArrayList
		list.add(new WarShip("USS John Warner", 2015, true, "attack submarine", "United States Navy"));
		
		// Count the number of ships that are not afloat
		int sunkShip = 0; 
		 
		
		for(Ship ship : list) {
			
			boolean result = ship.isAfloat();
			
			// If the result is false...
			if (!result) {
				// add 1 to the sunkShip count.
				sunkShip += 1;
			}
			
			// Display ship and its details.
			System.out.println(ship);
		}
		
		// Return result
		return sunkShip;
	}

}
