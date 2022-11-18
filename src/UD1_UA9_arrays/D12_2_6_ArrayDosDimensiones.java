package UD1_UA9_arrays;
/*
 * Realice un método que construya una matriz identidad de dos dimensiones.
 * Programe otro método que la muestre por pantalla de forma formateada
 */
public class D12_2_6_ArrayDosDimensiones {

	public static void main(String[] args) {
		
		muestraMatriz(construyeMatrizIdentidad(10));

	}
	
public static int[][] construyeMatrizIdentidad(int dimension) {
		int[][] matriz = new int[dimension][dimension];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j == i) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		return matriz;

	}
	
	
public static void muestraMatriz(int[][] matriz) {
		for (int[] numero : matriz) {
			for (int num : numero) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}

}
