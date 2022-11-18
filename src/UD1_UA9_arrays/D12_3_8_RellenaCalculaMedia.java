package UD1_UA9_arrays;
/*
 * 8. Programa Java que llene un array con 10 números enteros que se leen por
 * teclado. A continuación calcula y muestra la media de los valores positivos y
 * la de los valores negativos del array.
 */
import java.util.Scanner;

public class D12_3_8_RellenaCalculaMedia {
	public static void main(String args[]) {
		int[] miArray = new int[10];

		calculaMedias(rellenarArray(miArray));
	}

	public static int[] rellenarArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + " de la array");
			array[i] = sc.nextInt();
		}
		return array;
	}
	public static void calculaMedias(int[] array) {
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorceros = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;

		for (int numero : array) {
			if (numero > 0) {
				contadorPositivos++;
				sumaPositivos += numero;
			} else if (numero < 0) {
				contadorNegativos++;
				sumaNegativos += numero;
			} else {
				contadorceros++;
			}
		}
		System.out.println(((contadorceros > 0) ? "Hay " + contadorceros + " ceros en el array, " : " ")
				+ ((contadorPositivos > 0) ? "hay " + contadorPositivos + " positivos en el array y la media es "
								+ sumaPositivos / contadorPositivos + ", " : " ")
				+ ((contadorNegativos > 0) ? "hay " + contadorNegativos + " negativos en el array y la media es "
								+ sumaNegativos / contadorNegativos	: " "));
	}
}
