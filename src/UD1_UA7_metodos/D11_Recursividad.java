package UD1_UA7_metodos;

public class D11_Recursividad {

	public static void main(String[] args) {
       System.out.println(factorial(4));
	}

	// Método recursivo
	public static int factorial(int numero) {
		int resultado;

		if (numero != 1 && numero > 0) {
			resultado = factorial(numero - 1) * numero;
		} else {
			resultado = 1;
		}
		return resultado;
	}

}
