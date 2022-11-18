package UD1_UA8_bucles;

import java.util.Scanner;

public class D11_2_NumMayorMenor {
	/*
	 * Crea un método que pida números (se pedirá por teclado la cantidad de números
	 * a introducir). El programa debe informar de cuantos números introducidos son
	 * mayores que 0, menores que 0 e iguales a 0.
	 */
	public static void main(String[] args) {
		pideNumeros();
	}

	// Método que pide números e indica > < = cero.
	public static void pideNumeros() {
		Scanner sc = new Scanner(System.in);
		int mayores = 0;
		int menores = 0;
		int iguales = 0;

		int num;
		System.out.print("Introduzca la cantidad de números enteros a comparar con cero: ");
		num = sc.nextInt();
		// Compruebo que el número introducido es mayor que cero.
		do {
			if (num <= 0) {
				System.out.println(
						"El número introducido debe ser un entero positivo. Por favor, introduce un nuevo valor.");
				num = sc.nextInt();
			}
		} while (num <= 0);

		for (int i = 0; i < num; i++) {
			int numIntroducido;
			System.out.println("Introduzca un número entero: ");
			numIntroducido = sc.nextInt();
			if (numIntroducido < 0) {
				menores++;
			} else if (numIntroducido > 0) {
				mayores++;
			} else {
				iguales++;
			}
		}
		System.out.println("Introducidos: " + num + "\nMayores que cero: " + mayores + "\nMenores: " + menores
				+ "\nIguales a cero: " + iguales);
	}
}
