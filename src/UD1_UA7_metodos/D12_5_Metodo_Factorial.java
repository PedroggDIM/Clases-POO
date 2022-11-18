package UD1_UA7_metodos;

public class D12_5_Metodo_Factorial {

	public static void main(String[] args) {
		
	System.out.println(facto(4));
	System.out.println(facto2(4));

	}
	// Factorial con un método
	public static int facto(int numero) {
		int factorial=1;
		while ( numero!=0) {
			 factorial=factorial*numero; 
			 numero--;
			}
		return factorial;
	}
	
	// Método recursivo
	public static int facto2(int numero) {
		int resultado;

		if (numero != 1 && numero > 0) {
			resultado = facto2(numero - 1) * numero;
		} else if (numero < 0) {
			resultado = 0;
			System.out.println("NO SE PUEDE CALCULAR EL FACTORIAL DE UN NÚMERO NEGATIVO");
		} else {
			resultado = 1;
		}
		return resultado;
	}
}
