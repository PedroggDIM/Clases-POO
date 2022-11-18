package UD1_UA5_condicionales;

public class D13_3_NumMayor {

	public static void main(String[] args) {
		//Realice un programa que solicite por teclado
		//dos números enteros y diga si uno es mayor o menor.
		int a = 3;
		int b = 8;
		
		if (a > b) {
			System.out.println("El número "+ a + " es mayor que el número " + b );
		} else if (a < b) { // Podemos poner tantas else if como queramos.
			System.out.println(("El número "+ a + " es menor que el número " + b ));
		} else {                 // Solo poner último else porque ninguna de las otras se cumple.
			System.out.println("Los dos números son iguales");
		}
	}
}
