 package UD1_UA9_arrays;

import java.util.Scanner;

public class D12_2_5_RellenaSuma_Metodos {
	/*
	 * Cree un array de números donde le indicamos por teclado el tamaño del array,
	 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra
	 * por pantalla el valor de cada posición y la suma de todos los valores. 
	 * Haz un método para rellenar el array (que tenga como parámetros los números entre
	 * los que tenga que generar), para mostrar el contenido y la suma del array y
	 * un método para generar número aleatorio.
	 */
	public static void main(String[] args) {
		mostrarArray(rellenarNumAleatorioArray(crearArray(), 5, 3));		
	}	
	// método en el que indicamos el tamaño del array
	public static int[] crearArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud de la array que desea");
		int[] array = new int[sc.nextInt()];  //Declaro el array con tamaño.
		return array;
	}
	
	// método que rellena aleatoriamente el array.
	// método que recibe un array de int[] y dos parámetros.
	public static int[] rellenarNumAleatorioArray(int array[], int a, int b) {
		for (int i = 0; i < array.length; i++) {
			// Generamos un número entre los parámetros pasados
			array[i] = ((int) Math.floor(Math.random() * (a - b) + b));
		}
		return array;
	}
	// método que muestra el array.
	static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("En el índice " + i + " está el valor " + array[i]);
		}
	}
}
