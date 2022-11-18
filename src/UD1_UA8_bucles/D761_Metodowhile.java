package UD1_UA8_bucles;

public class D761_Metodowhile {
	/*
	 * Programa que permita demostrar la conjetura de Collatz. La conjetura dice: Si
	 * es número par se divide entre 2 y si es número impar se multiplica por 3 y se
	 * suma 1 al resultado. Operar consecutivamente un valor numérico de entrada
	 * hasta obtener el valor de 1
	 */
	public static void main(String[] args) {
		int numero = 25;
		collatz(numero);
	}

	public static void collatz(int numero) {
		while (numero != 1) {
			if (numero % 2 == 0) {
				numero = numero / 2;
			} else {
				numero = (numero * 3) + 1;
			}
		}
		System.out.println(numero);
	}

}
