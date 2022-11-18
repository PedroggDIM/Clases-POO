package UD1_UA5_condicionales;

import java.util.Scanner;

public class D13_4_Scanner_OrdenaNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Realice un programa que solicite por teclado tres números enteros y los
		 * ordene de mayor a menor
		 */
		int numA, numB, numC;

		System.out.println("Introduzca un numero entero");
		numA = sc.nextInt();

		System.out.println("Introduzca otro numero entero");
		numB = sc.nextInt();

		System.out.println("Introduzca el último numero entero");
		numC = sc.nextInt();

		if (numA > numB && numA > numC && numB > numC) {
			System.out.println("El orden es: " + numA + " " + numB + " " + numC);
		} else if (numA < numB && numA > numC && numB > numC) {
			System.out.println("El orden es: " + numB + " " + numA + " " + numC);
		} else if (numA < numB && numA < numC && numB > numC) {
			System.out.println("El orden es: " + numB + " " + numC + " " + numA);
		} else if (numA > numB && numA > numC && numB > numC) {
			System.out.println("El orden es: " + numA + " " + numC + " " + numB);
		} else if (numA > numB && numA < numC && numB < numC) {
			System.out.println("El orden es: " + numC + " " + numA + " " + numB);
		} else {
			System.out.println("El orden es: " + numC + " " + numB + " " + numA);
		}

		
	}
}
