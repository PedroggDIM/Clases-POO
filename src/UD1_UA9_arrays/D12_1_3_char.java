package UD1_UA9_arrays;

import java.util.Arrays;
/*
 * Dados dos Array de tipo char. El 1ª esta formado por el abecedario en
 * mayúsculas, rellene la 2ª a partir de la 1ª pero en orden inverso.
 */
public class D12_1_3_char {

	public static void main(String[] args) {
	//int numeros[] = new int[100];	
		char[] mayus = new char[26];
		char[] mayusI = new char[26];
		int cont = 0;
		for(char i = 'A'; i<= 'Z'; i++) {
			mayus[cont] = i;
			cont++;
		}
        System.out.println(Arrays.toString(mayus));
        
        for(int i = 0; i < mayusI.length; i++) {
        	//El valor cero del segundo lo igualo al último del primero
        	// y voy recorriendo.
        	mayusI[i] = mayus[mayus.length - i -1];
        }
        System.out.println(Arrays.toString(mayusI));
	}

}
