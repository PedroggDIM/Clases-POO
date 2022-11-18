package UD1_UA8_bucles;

import java.util.Scanner;

public class D76_Suma_dowhile {
	/*
	 * 3 . Programa que lea 10 números desde teclado en un proceso repetitivo y
	 * muestre la suma. Realizar el programa con do-while
	 */
	public static void main(String[] args) {

		System.out.println("La suma de los 10 números introducidos es: " + sumaNumeros());

	}

	public static int sumaNumeros() {

		Scanner sc = new Scanner(System.in);
		int numero;
		int sumaNumero = 0;
		int contador;
		contador = 10;

		do {
			System.out.print("Introduzca un número entero: ");
			numero = sc.nextInt();
			sumaNumero = sumaNumero + numero;
			//sumaNumero += numero; 
			contador--;
		} while (contador > 0);
        sc.close();
		return sumaNumero;
		
	}

}
