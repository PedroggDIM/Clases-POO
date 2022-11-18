package UD1_UA8_bucles;

import java.util.Scanner;

public class D8_2_67_for_RecorreNumeros {

	public static void main(String[] args) {

		muestraIntervaloNum();

	}

	public static void muestraIntervaloNum() {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("Introduzca el primer número entero: ");
		n1 = sc.nextInt();

		int n2;
		System.out.print("Introduzca el segundo número entero: ");
		n2 = sc.nextInt();

		if (n1 < n2) {
			// Muestra los números del n1 al n2 (ambos incluidos).
			for (int i = n1; i <= n2; i++) {
				System.out.println(i);
			}
		} else if (n1 > n2) {
			// Muestra los números del n1 al n2 (ambos incluidos).
			for (int i = n1; i >= n2; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("Son iguales.");
		}
		sc.close();

	}

}
