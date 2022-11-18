package UD1_UA9_arrays;

import java.util.Arrays;
import java.util.Vector;

public class D12_1_12_Array_Crea_Rellena {

//Cree una Array de tipo int de longitud 100 y que cada posición tenga su índice.
//Ejemplo : int[] ejemplo = {0,1,2};
	public static void main(String[] args) {

		int [] numeros = new int[100];
		// Para rellenarlo uso un bucle for.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
			//System.out.println(numeros[i]);			
		}
		System.out.println(Arrays.toString(numeros));

//2. En el anterior array las posiciones estén ocupadas al reves. Ejemplo:
//		int [] ejemplo = {2, 1, 0};
		System.out.println("\n**Segunda parte**");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros.length - i - 1;
		}
		System.out.println(Arrays.toString(numeros));

	}

}
