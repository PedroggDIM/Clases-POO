package UD1_UA9_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class D12_1_4_RellenaArrayyMuestraMetodos {

	public static void main(String[] args) {

		int[] miArray = new int[10];
		// rellenrArray(miArray);
		mostrarArray(rellenarArray(miArray));
	}

	public static int[] rellenarArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + " de la array");
			array[i] = sc.nextInt();
		}
		return array; // array: es un int[]

	}

	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("En el índice " + i + " está el valor " + array[i]);
		}
	}
}
