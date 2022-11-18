package UD1_UA9_arrays;
import java.util.Scanner;
public class D12_3_9_Media {

	public static void main(String[] args) {
		mediaAltura();
	}
	/*
	 * 9. Programa Java para leer la altura de N personas y calcular la altura
	 * media. Calcular cuántas personas tienen una altura superior a la media y
	 * cuántas tienen una altura inferior a la media. El valor de N se pide por
	 * teclado y debe ser entero positivo.
	 */

	static void mediaAltura() {
		double[] alturaPersonas;
		double mediaAlturas = 0;
		Scanner sc = new Scanner(System.in);
		int numeroPersonas = 0;
		int contadorMas = 0;
		int contadorMenos = 0;
		int contadorMedia = 0;
		do {
			System.out.println("Introduce el numero de personas: ");
			numeroPersonas = sc.nextInt();
		} while (numeroPersonas <= 0);

		alturaPersonas = new double[numeroPersonas];

		System.out.println("Introduce altura personas: ");

		for (int i = 0; i < alturaPersonas.length; i++) {
			System.out.print("persona " + (i + 1) + " = ");
			alturaPersonas[i] = sc.nextDouble();
			mediaAlturas += alturaPersonas[i];
		}

		mediaAlturas /= alturaPersonas.length;

		for (int i = 0; i < alturaPersonas.length; i++) {
			if (mediaAlturas > alturaPersonas[i]) {
				contadorMas++;
			} else if (mediaAlturas < alturaPersonas[i]) {
				contadorMenos++;
			} else {
				contadorMedia++;
			}
		}
		System.out.println("Estatura media: " + mediaAlturas);
		System.out.println("Personas con estatura superior a la media: " + contadorMas);
		System.out.println("Personas con estatura inferior a la media: " + contadorMenos);
		System.out.println((contadorMedia > 0) ? "Personas con estatura inferior a la media: " + contadorMenos : "");

	}

}
