package UD1_UA8_bucles;

import java.util.Scanner;

public class D11_1_AdivinaNumAleatoreo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aleatoreo = (int) (Math.random() * 100);
		// System.out.println(aleatoreo);
		int contador = 1;
		int num;
		System.out.print("Introduzca un número entero: ");
		num = sc.nextInt();

		while (num != aleatoreo) {
			if (aleatoreo > num) {
				System.out.println("Debe introducir un número mayor");
				contador++;
				System.out.print("Introduzca un número entero: ");
				num = sc.nextInt();
			} else if (aleatoreo < num) {
				System.out.println("Debe introducir un número menor");
				contador++;
				System.out.print("Introduzca un número entero: ");
				num = sc.nextInt();
			} else {
				System.out.println("Acertó con el número");
			}
		}
		System.out.println("Acertó el número a adivinar que era: " + aleatoreo + " en " + contador + " veces");
		sc.close();
	}
}
