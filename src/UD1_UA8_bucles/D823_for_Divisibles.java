package UD1_UA8_bucles;
public class D823_for_Divisibles {
	
//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
	public static void main(String[] args) {

		muestraDivisibles();

	}

	public static void muestraDivisibles() {
		// Muestra los números del 1 al 100 (ambos incluidos).
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
