 
// This program returns the maximum element in an array.

package sommer19;

public class Exercise_195 {

	public static void main(String[] args) {
		

	}
	
	public static <E extends Comparable<E>> E max (E[] list) {
		
		E max = list[0];
		
		for (int i = 1; i < list.length; i++) {
			if (max.compareTo(list[i]) > 0) {
				max = list[i];
				
			}
		}
		
		return max;
	}

}
