package UD1_UA9_arrays;

import java.util.Arrays;

public class D12_2_3_Abecedario {

	public static void main(String[] args) {
		/*
		 * Dadas dos Array de tipo char. La 1ª esta formada por el abecedario en
		 * mayúsculas, rellene la 2ª a partir de la 1ª pero en orden inverso.
		 */

		char[] abcdarioDirecto = new char[26];
		char[] abcdarioInverso = new char[abcdarioDirecto.length];
		int contador = 0;

		for (char i = 'A'; i <= 'Z'; i++) {
			abcdarioDirecto[contador] = i;
			contador++;
		}

		System.out.println(Arrays.toString(abcdarioDirecto));

		for (int i = 0; i < abcdarioDirecto.length; i++) {
			abcdarioInverso[i] = abcdarioDirecto[abcdarioDirecto.length - 1 - i];
		}

		System.out.println(Arrays.toString(abcdarioInverso));

	}

}
