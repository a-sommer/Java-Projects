 

package sommer19;

import java.util.ArrayList;
import java.util.Arrays;

public class Project1 {

	// Static method that takes an array of
	// a generic type as its only argument
	public static <E> int elementsInArray(E[] list) {
		int x = 0;
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
			x++;
		}
		System.out.println();
		
		// Return the number of elements in array
		return x;
	}
	
	// This method displays the list elements all on
	// one line and returns the sum of the elements.
	public static double listAdder(ArrayList<? extends Number> list) {
		double sum = 0;
		
		for (Number e: list) {
			
			if (e instanceof Integer) {
				System.out.print(e + " ");
				sum += (Integer)e;
			}
			if (e instanceof Byte) {
				System.out.print(e + " ");
				sum += (Byte)e;
			
			}
			if (e instanceof Double) {
				System.out.print(e + " ");
				sum += (Double)e;
			}
		}
		
		// Return the sum
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		
		Integer[] integers = { 12, 21, 7, 16, 8, 13 };
		String[] strings = { "one", "two", "three", "four" };
		Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Byte[] bytes = { 12, 20, 4, 7};
		int elements = 0;
		
		System.out.println("Here is an integer array");
		elements = elementsInArray(integers);
		System.out.println("That array held " + elements + " elements");
		
		System.out.println("Here is a String array");
		elements = elementsInArray(strings);
		System.out.println("That array held " + elements + " elements");
		
		System.out.println("Here is a Double array");
		elements = elementsInArray(doubles);
		System.out.println("That array held " + elements + " elements");
		
		// Variable holds the total
		double total = 0;
		
		ArrayList<Number> integers2 = new ArrayList<Number>(Arrays.asList(integers));
		total = listAdder(integers2);
		System.out.println("\n" + "Integer list totals " + total);
		
		ArrayList<Number> doubles2 = new ArrayList<Number>(Arrays.asList(doubles));
		// Add 6.6 to ArrayList
		doubles2.add(6.6);
		total = listAdder(doubles2);
		System.out.println("\n" + "Double list totals " + total);
		
		ArrayList<Number> bytes2 = new ArrayList<Number>(Arrays.asList(bytes));
		total = listAdder(bytes2);
		System.out.println("\n" + "Byte list totals " + total);
		

	}

}
