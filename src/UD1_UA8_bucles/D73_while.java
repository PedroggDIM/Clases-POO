package UD1_UA8_bucles;

public class D73_while {

	public static void main(String[] args) {

		int edad = 20;

		while (edad >= 18) {
			System.out.println("Es usted mayor de edad porque tiene " + edad);
			edad--;  // sin esto quedaría en bucle infinito
		}

	}

}
