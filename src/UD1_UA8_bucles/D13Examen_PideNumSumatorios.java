package UD1_UA8_bucles;

import java.util.Scanner;
//Programa que pida 10 números, haga la suma, y cuente los positivos y negativos
public class D13Examen_PideNumSumatorios {

	public static void main(String[] args) {

		pideNumeros();

	}

// Método que pide 10 números al usuario y hace cálculos
	public static void pideNumeros() {

		Scanner sc = new Scanner(System.in);
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		int num = 10;
		int suma = 0;

		for (int i = 0; i < num; i++) {
			int numIntroducido;
			System.out.println("Introduzca un número entero: ");
			numIntroducido = sc.nextInt();
			if (numIntroducido < 0) {
				suma = suma + numIntroducido;
				negativos++;
			} else if (numIntroducido > 0) {
				suma = suma + numIntroducido;
				positivos++;
			} else {
				ceros++;
			}
		}
		System.out.println("La suma de los numeros introducidos es: " + suma);
		System.out.println("Los números positivos son:  " + positivos);
		System.out.println("La números negativos son:  " + negativos);
	}

}
