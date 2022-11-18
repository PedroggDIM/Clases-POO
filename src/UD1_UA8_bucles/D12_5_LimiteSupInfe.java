package UD1_UA8_bucles;
import java.util.Scanner;
/*
 * Programe un método que pida, por teclado, el limite inferior y el superior
 *  de un intervalo. Si el límite inferior es mayor
 *  que el superior lo tiene que volver a pedir.Posteriormente se van
 *  introduciendo números hasta que se introduzca el 0. 
 *   Cuando termine el programa dará las siguientes informaciones:
La suma de los números que están dentro del intervalo
Cuántos números están fuera del intervalo.
Informar si hemos introducido algún número igual a los límites del intervalo. 
 */
public class D12_5_LimiteSupInfe {

	public static void main(String[] args) {

		numInfeSuperior();

	}
// Método que pide los límites inferior y superiro y calcula 
	public static void numInfeSuperior() {

		Scanner sc = new Scanner(System.in);
		int limiteInfe;
		int limiteSupe;
		int numero = 0;
		int contadorNumerosDentro = 0;
		int sumaNumerosDentro = 0;
		int contadorNumerosFuera = 0;
		int numeroIgualLimites = 0;
        //  solicito límite inf y sup
		do {
			System.out.print("Introduzca el límite inferior: ");
			limiteInfe = sc.nextInt();
			System.out.print("Introduzca el límite superior: ");
			limiteSupe = sc.nextInt();
		} while (limiteInfe > limiteSupe);
		
        //  pido números al usuario
		do {
			System.out.println("Introduzca un número: ");
			numero = sc.nextInt();
			if (numero > limiteInfe && numero < limiteSupe) {
				contadorNumerosDentro++;
				sumaNumerosDentro = sumaNumerosDentro + numero;
			} else if (numero < limiteInfe || numero > limiteSupe) {
				contadorNumerosFuera++;
			} else {
				numeroIgualLimites++;
			}
		} while (numero != 0);

		System.out.println("Suma de los números en el intervalo: " + sumaNumerosDentro);
		System.out.println("Números fuera: " + contadorNumerosFuera);
		System.out.println("Números igual a los límites: " + numeroIgualLimites);
		sc.close();

	}
}