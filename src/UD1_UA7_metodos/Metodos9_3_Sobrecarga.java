package UD1_UA7_metodos;

public class Metodos9_3_Sobrecarga {

	public static void main(String args[]) {
       
		//nuevaLinea("hola", 10);
		nuevaLinea("adios");
		//nuevaLinea(3);
		
	}

	public static void nuevaLinea(int num) {
		nuevaLinea("**", num);
	}

	public static void nuevaLinea(String mensaje, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(mensaje);
		}
	}

	public static void nuevaLinea(String mensaje) {
		nuevaLinea(mensaje, 3);
	}
}
