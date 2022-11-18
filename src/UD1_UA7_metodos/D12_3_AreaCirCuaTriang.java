package UD1_UA7_metodos;

import java.awt.geom.PathIterator;
import java.util.Scanner;

public class D12_3_AreaCirCuaTriang {
	/*
	 * Crea una aplicación que nos calcule el área de un circulo
	 * (area=PI*Rcuadrado), cuadrado (lado * lado) triangulo ((b * h) / 2) Pediremos
	 * que figura queremos calcular su área y según lo introducido pedirá los
	 * valores necesarios para calcular el área. Crea un método por cada figura para
	 * calcular cada área, este devolverá un número real. Muestra el resultado por
	 * pantalla
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del polígono a calcular el área: circulo, triangulo, cuadrado");
		String figura;
		figura = sc.nextLine();

		switch (figura) {
		case "circulo":
			double radio;
			System.out.println("Ingrese el radio del círculo");
			radio = sc.nextDouble();
			System.out.println("El área del círculo de radio: " + radio + " es: " + areaCirculo(radio));
			break;
		case "cuadrado":
			double lado;
			System.out.println("Ingrese el lado del cuadrado");
			lado = sc.nextDouble();
			System.out.println("El área del cuadrado de lado: " + lado + " es: " + areaCuadrado(lado));
			break;
		case "triangulo":
			double base;
			double altura;
			System.out.println("Ingrese la base: ");
			base = sc.nextDouble();
			
			
			System.out.println("Ingrese la altura: ");
			altura = sc.nextDouble();
			System.out.println("El área del triángulo de base: " + base + " y altura: " + altura + " es: "
					+ areaTriangulo(base, altura));
			break;
		default:
			System.out.println("Ha introducido mal el nombre, vuelva a intentarlo.");
			break;

		}

	}

	// Método calcula el área del círculo.
	public static double areaCirculo(double radio) {
		double areaCir;
		areaCir = Math.PI * Math.pow(radio, 2);
		return areaCir;
	}

	// Método calcula el área del cuadrado.
	public static double areaCuadrado(double lado) {
		double areaCuadra;
		areaCuadra = lado * lado;
		return areaCuadra;
	}

	// Método calcula el área del triángulo.
	public static double areaTriangulo(double base, double altura) {
		double areaTrian;
		areaTrian = (base * altura) / 2;
		return areaTrian;
	}

}
