package UD1_UA8_bucles;

public class D8_2_5_FactorialNum_For {

	public static void main(String[] args) {

		int numero = 6;
		System.out.println("El factorial de " + numero + " es " + factorialNum(numero));
	}

	public static int factorialNum(int numero) {

		int factorial = 1;

		for (int i = numero; i != 0; i--) {
			System.out.println(i);
			factorial = factorial * i;
		}
		return factorial;

	}

}
