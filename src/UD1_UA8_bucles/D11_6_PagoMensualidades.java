package UD1_UA8_bucles;

public class D11_6_PagoMensualidades {
	/*
	 * Una persona compró un producto a pagar en 10 meses. El primer mes pago 10€,
	 * el segundo mes pago 20€, el tercer mes 40€ y así sucesivamente.
	 * **Realice un método que se le pase por parámetros lo que cuesta el producto y
	 * cuanto quiere pagar en la primera mensualidad y nos diga cuantas
	 * mensualidades ha tenido que emplear.
	 * **Programe otro método para que también que cuantía es la de la última cuota 
	 * **Programe otro método que nos diga el total de cuotas y lo que vamos a pagar en cada cuota y el pendiente que nos
	 * queda después de abonar esa cuota
	 */
	public static void main(String[] args) {
		cuantasMensualidades(100, 10);
	}

	static void cuantasMensualidades(double precioProducto, double primeraCuota) {
		int contador = 0;
		double sumaMensualidades = 0;

		while (sumaMensualidades < precioProducto) {
			sumaMensualidades += primeraCuota;
			primeraCuota *= 2;
			contador = contador + 1;
		}
		System.out.println("Vd. va a pagar el producto en: " + contador + " Cuotas");
	}

	/*
	 * Continuado con el ejercicio anterior: Programe otro método para que también
	 * que cuantía es la de la última cuota
	 */
	static void cuantasCuotasUltimaCuota(double precioProducto, double primeraCuota) {
		int contador = 0;
		double sumaMensualidades = 0;
		double cuotaPendiente = 0;

		while (sumaMensualidades < precioProducto) {
			contador = contador + 1;
			cuotaPendiente = precioProducto - sumaMensualidades;
			sumaMensualidades += primeraCuota;
			primeraCuota = (primeraCuota < cuotaPendiente) ? primeraCuota : cuotaPendiente;
			primeraCuota *= 2;

		}
		System.out.println("Vd. va a tener que abonar: " + contador + " Cuotas. " + "La última cuota será de: "
				+ cuotaPendiente + "€.");
	}

	/*
	 * Programe otro método que nos diga el total de cuotas y lo que vamos a pagar
	 * en cada cuota y el pendiente que nos queda en esa cuota.
	 */

	static void datosCuotas(double precioProducto, double primeraCuota) {
		cuantasMensualidades(precioProducto, primeraCuota);
		int contador = 0;
		double sumaMensualidades = 0;
		double cuotaPendiente = 0;

		while (sumaMensualidades < precioProducto) {
			contador = contador + 1;
			cuotaPendiente = precioProducto - sumaMensualidades;
			sumaMensualidades += primeraCuota;
			primeraCuota = (primeraCuota < cuotaPendiente) ? primeraCuota : cuotaPendiente;
			System.out.println("En la cuota nº " + contador + " tiene que abonar => " + primeraCuota
					+ "€. Queda pendiente " + (cuotaPendiente - primeraCuota) + "€.");
			primeraCuota *= 2;

		}

	}

}
