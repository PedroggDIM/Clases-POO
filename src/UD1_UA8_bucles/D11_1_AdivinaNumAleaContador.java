package UD1_UA8_bucles;

import java.util.Scanner;

public class D11_1_AdivinaNumAleaContador {
/*
 * Cree el juego de adivinar un número, con las siguientes condiciones:
​Generará un número aleatorio del 1 al 100.
Irá pidiendo números por teclado y responderá si el número buscado es mayor o menor que el introducido.
Se termina cuando se acierta el número, además indicará en que número de intento se ha acertado.
Cuando se llegue al límite de intentos mostrara el número aleatorio que se ha generado
 */
	public static void main(String[] args) {
		
		adivinaNumero();

	}
	
	public static void adivinaNumero() {
		Scanner scanner = new Scanner(System.in);
		int numeroAleatorio;
		int intento;
		int contador = 10;
		// Obtención de número aleatorio
		/**
		 * (int)=> El casteo (casting) es un procedimiento para transformar una variable
		 * primitiva de un tipo a otro, o transformar un objeto de una clase a otra
		 * clase siempre y cuando haya una relación de herencia entre ambas.
		 */
		numeroAleatorio = (int) (Math.random() * 100 + 1);
		System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. " + "Tienes 10 intentos.");
		System.out.println(numeroAleatorio);
		// Realización del bucle do-while
		do {
			System.out.println("Número contador: " + contador);
			System.out.print("Introduce el número que creas posible: ");
			intento = scanner.nextInt();
			if (intento > numeroAleatorio) {
				System.out.println("El número que buscas es menor, te quedan " + (contador - 1) + " intentos: ");
			} else if (intento < numeroAleatorio) {
				System.out.println("El número que buscas es mayor, te quedan " + (contador - 1) + " intentos: ");
			} else {
				System.out.print("¡CORRECTO! " + numeroAleatorio + " era el número que estabas "
						+ "buscando, has necesitado " + (10 - (contador - 1)) + " intentos.");
			}
			contador--;
		} while (intento != numeroAleatorio && contador > 0);
		if (contador == 0) {
			System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
		}
	}
}
