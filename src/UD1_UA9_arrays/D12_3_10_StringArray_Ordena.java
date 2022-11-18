package UD1_UA9_arrays;
import java.util.Arrays;
/*
 * Dada la siguiente array de alumnos {"Pepe", "María", "Josefina",
 * "jose", "Manuel", "alonso", "Valentina"}, 
 * Realiza un método que permita ordenarlos por orden alfabético.
 */
public class D12_3_10_StringArray_Ordena {

	public static void main(String[] args) {
       
		String[] clase = { "Pepe", "María", "Josefina", "jose", "Manuel", "alonso", "Valentina" };

		System.out.println(Arrays.toString(ordenaNombres(clase))); 
	}
	
	public static String[] ordenaNombres(String[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					String auxiliar = array[i];
					array[i] = array[j];
					array[j] = auxiliar;
				}
			}
		}

		return array;
	}
}
