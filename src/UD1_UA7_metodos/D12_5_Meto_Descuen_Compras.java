package UD1_UA7_metodos;

import java.util.Scanner;

import javax.lang.model.element.Element;

/*
 * Programa que nos pida la cantidad de piezas compradas, y el precio por pieza,
 * Si se compran 100 o más piezas, se dará el 20% de descuento
 * Calcular el total a pagar usando un método.
 */
public class D12_5_Meto_Descuen_Compras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el número de piezas compradas (100 o más 20% decuento):  ");
		int numPiezas;
		numPiezas = sc.nextInt();

		System.out.println("Ingrese el precio por pieza:  ");
		double precioPieza;
		precioPieza = sc.nextDouble();

		System.out.println("El precio de " + numPiezas + " piezas, a " + precioPieza + " euros, con la oferta es: "
				+ precioTotal(numPiezas, precioPieza));

	}

	public static double precioTotal(int numPiezas, double precioPieza) {
		double porcentajeDescuento = 0.20;
		double precioFinal;
		if (numPiezas >= 100) {
			precioFinal = (numPiezas * precioPieza) - ((numPiezas * precioPieza) * porcentajeDescuento);
		} else {
			precioFinal = numPiezas * precioPieza;
		}
		return precioFinal;
	}

}
