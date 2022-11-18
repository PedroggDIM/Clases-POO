package UD1_UA7_metodos;

public class D12_4_MetodosRadioArea {
	// Dadas las coordenadas x e y del centro de una circunferencia (xc, yc) y de
	// uno de sus puntos (xp, yp), debe implementar el cálculo del área dedicha
	// circunferencia

	public static void main(String[] args) {

		int xc = 0;
		int yc = 0;
		int xp = 0;
		int yp = 0;
		double radio;

		radio = modVector(xc, yc, xp, yp);
		System.out.println("El radio del circulo mide " + radio);
		System.out.println("El área del circulo es " + areaCircl(radio));
	}

	public static double modVector(int xc, int yc, int xp, int yp) {
		return Math.sqrt(Math.pow((xp - xc), 2) + Math.pow((yp - yc), 2));
	}

	public static double areaCircl(double r) {
		return Math.PI * Math.pow(r, 2);
	}

}
