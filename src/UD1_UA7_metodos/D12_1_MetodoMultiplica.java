package UD1_UA7_metodos;

public class D12_1_MetodoMultiplica {

	public static void main(String[] args) {
        int num1 = 4;
        int num2 = 4;
		System.out.println(multiplica(num1, num2));
		
		multiplica2(num1, num2);

	}

	// Método para multiplicar dos enteros
	public static int multiplica(int x, int y) {
		int resultado;
		resultado = x * y;
		return resultado;
	}
	
	public static void multiplica2(int x, int y) {
		System.out.println(x * y);
	}

}
