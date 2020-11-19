 
// This program creates a Reptile pet, and an array of Dog pets.
// It displays the details of the pets, which the dogs sorted by weight (low to high).

package sommer13;

import java.util.Date;

public class TestPet {

	public static void main(String[] args) {
		
		
		// Create at least one Reptile pet & display it
		Reptile reptile = new Reptile("Slinky", 'M', new Date(), "rock python");
		
		System.out.println(reptile);
		
		// Display message
		System.out.println("All dogs sorted by weight");
		
		// Create an array of dogs
		Dog[] dogs = {
			new Dog("Pedro", 'M', new Date(), "chihuahua", 14),
			new Dog("Marley", 'M', new Date(), "pug", 20),
			new Dog("Sacha", 'F', new Date(), "beagle", 25),
			new Dog("Butch", 'M', new Date(), "Alsatian", 90)};
		
		// Sort by weight
		java.util.Arrays.sort(dogs);
		
		// Display all data for all dogs (sorted by weight)
		for (Dog dog: dogs) {
			System.out.println(dog);
		}
		
	}

}
