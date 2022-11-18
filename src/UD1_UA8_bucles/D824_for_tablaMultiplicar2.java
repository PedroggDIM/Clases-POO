package UD1_UA8_bucles;

public class D824_for_tablaMultiplicar2 {

	public static void main(String[] args) {
		
		// Tabla de multiplicar del 2
		int numero = 2;
		System.out.println("Tabla de multiplicar del 2: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + numero + " = " + (i * numero));
		}
		
		tablaMultiplica2();
	}

	// Con un método
	public static void tablaMultiplica2() {
		// Tabla de multiplicar del 2
		int numero = 2;
		System.out.println("Tabla de multiplicar del 2: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + numero + " = " + (i * numero));

		}

	}
}
