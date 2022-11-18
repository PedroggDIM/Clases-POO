package UD1_UA8_bucles;

import java.util.Scanner;

public class D11_7_SumaFactoriales {
	/*
	 * Leer por teclado un número entero N no negativo y mostrar la suma de los
	 * factoriales de todos los números desde 0 hasta N.
	 */
	public static void main(String[] args) {
		sumatorioFactoriales();

	}
	static int sumatorioFactoriales() {
		int a;
		int factorial;
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		// Leer un número entero >= 0
		do {
			System.out.print("Introduce un número > 0: ");
			a = sc.nextInt();
		} while (a < 0);

		for (int i = 0; i <= a; i++) { // para cada número desde 1 hasta N

			// se calcula su factorial
			factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}

			// se muestra el factorial
			System.out.println(i + factorial);

			// se suma el factorial o
			suma += factorial;
		}
		return suma;
	}

}
