package UD1_UA8_bucles;

public class D11_3_NumPares_EntreDos {
//Realiza un programa que nos indique la cantidad de numeros
//pares que hay entre dos números que le pasemos
	public static void main(String[] args) {

		numParesEntreDos(0, 12);
	}

	// Método que indica los pares entre dos.
	public static void numParesEntreDos(int num1, int num2) {
		// Primero calculo el mayor y menor para tenerlos ordenados en el bucle
		int mayor = 0;
		int menor = 0;
		int contadorPares = 0;
		if (num1 > num2) {
			mayor = num1;
			menor = num2;
		} else if (num2 > num1) {
			mayor = num2;
			menor = num1;
		} else {
			System.out.println("Ambos números son iguales");
		}
		// calculo los pares recorriendo todo el rango 
		for (int i = menor; i <= mayor; i++) {

			// System.out.print(i + " ");
			if (i % 2 == 0) {
				contadorPares++;
			}
		}
		System.out.println(contadorPares);
	}
}
