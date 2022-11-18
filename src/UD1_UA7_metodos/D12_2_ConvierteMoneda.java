package UD1_UA7_metodos;

import java.util.Scanner;
import javax.lang.model.element.Element;

public class D12_2_ConvierteMoneda {
	/*
	 * Crea un aplicación que nos convierta una cantidad de euros introducida por
	 * teclado a otra moneda, estas pueden ser a dólares, yenes o libras. El método
	 * tendrá como parámetros, la cantidad de euros y la moneda a pasar que será un
	 * String, este no devolverá ningún valor, mostrara un mensaje indicando el
	 * cambio (void). El cambio de divisas son: 0.87 libras es un 1 €// 0.99 dolares
	 * es un 1 € 140.52 yenes es un 1 €
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double euros;
		String dolares = "dolares";
		String yenes = "yenes";
		String libras = "libras";
		System.out.println("Introduzca la cifra en euros.");
		euros = sc.nextDouble();

		conversor(euros, dolares);
	}

	public static void conversor(double euros, String moneda) {
		double A_LIBRAS = 0.87;
		double A_DOLARES = 0.99;
		double A_YENES = 140.52;
		double cambio;
		switch (moneda) {
		case "dolares":
			cambio = euros * A_DOLARES;
			System.out.println(euros + " euros convertido a dólares son: " + cambio + " dólares.");
			break;
		case "yenes":
			cambio = euros * A_YENES;
			System.out.println(euros + " euros convertido a yenes son: " + cambio + " yenes.");
			break;
		case "libras":
			cambio = euros * A_LIBRAS;
			System.out.println(euros + " euros convertido a libras son: " + cambio + " libras.");
			break;
		default:
			System.out.println("Ingrese los datos correctamente.");
		}
	}
}
