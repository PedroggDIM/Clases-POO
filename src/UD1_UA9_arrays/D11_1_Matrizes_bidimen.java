package UD1_UA9_arrays;

import java.util.Arrays;

public class D11_1_Matrizes_bidimen {

	public static void main(String[] args) {
		
		int[][] matriz = { { 1, 2, 3, 4, 5, 6 }, { 9, 8, 7, 6, 8, 9 }, { 9, 8, 7, 6, 8, 9 }, { 9, 8, 7, 6, 8, 9 },
				{ 9, 8, 7, 6, 8, 9 } };
		System.out.println(matriz.length);
		System.out.println(matriz);
		System.out.println(Arrays.toString(matriz));

		for (int k = 0; k < matriz.length; k++) {
			for (int j = 0; j < matriz[0].length; j++) {
				// hacer la operación que se necesite
				System.out.print(matriz[k][j] + "\t");
				// uso \t para alinear las columnas
			}
			System.out.println(); // siguiente fila

		}

		System.out.println("----------------------------------------------------------------------------");

		for (int[] numero : matriz) {
			for (int num : numero) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}

	}

}
