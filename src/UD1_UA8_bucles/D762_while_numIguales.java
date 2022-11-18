package UD1_UA8_bucles;

import java.util.Scanner;

public class D762_while_numIguales {
	/*
	 * ​2 . Realiza un programa en Java que lea dos números pasados por teclado en
	 * un proceso repetitivo. Este proceso terminará cuando los números leídos sean
	 * iguales.
	 */
	public static void main(String[] args) {

		sonIguales();

	}

	public static void sonIguales() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		do {
			System.out.print("Introduzca un número entero: ");
			n1 = sc.nextInt();
			System.out.println("Ingrese otr número entero: ");
			n2 = sc.nextInt();
		} while (n1 != n2);
		System.out.println(n1 + " es igual a " + n2);
	}
}
