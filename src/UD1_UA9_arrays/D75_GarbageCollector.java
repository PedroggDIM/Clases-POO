package UD1_UA9_arrays;

public class D75_GarbageCollector {

	public static void main(String[] args) {
	
		//Declaro 2 arrays
		int array1[], array2[];
		
		array1 = new int[100];  //Reservo la memoria
		array2 = new int [20]; 
	    array1 = array2;
		array1 = null;
		/* todavía se tiene acceso  a la array de 100 elementos array1
		 * desde array2
		 */
		 array2 = null; 
		/* el Garbage Collector elimina el array de 100 
		 * elementos porque es inaccesible
		 */

	}

}
