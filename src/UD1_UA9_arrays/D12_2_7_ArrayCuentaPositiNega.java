package UD1_UA9_arrays;
import java.util.Scanner;

/*
 * 7. Partiendo del ejercicio 4, realiza un método que nos diga cuantos números
 * son positivos y cuantos negativos.
 */
public class D12_2_7_ArrayCuentaPositiNega {

	public static void main(String[] args) {

		int[] miArray = new int[10];
		cuantosPositivos(rellenarArray(miArray));

	}

	public static int[] rellenarArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + " de la array");
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static void cuantosPositivos(int[] array) {
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorceros = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				contadorPositivos++;
			} else if (array[i] < 0) {
				contadorNegativos++;
			} else {
				contadorceros++;
			}
		}
		System.out.println(((contadorceros > 0) ? "Hay " + contadorceros + " ceros en el array, " : " ")
				+ ((contadorPositivos > 0) ? "hay " + contadorPositivos + " positivos en el array, " : " ")
				+ ((contadorNegativos > 0) ? "Hay " + contadorNegativos + " negativos1 en el array " : " "));
	}
}
