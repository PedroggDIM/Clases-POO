package UD1_UA5_condicionales;

public class D13_1_ifParImpar {

	public static void main(String[] args) {
		 
		int numero = 0;
		
		if (numero != 0) {
			if(numero % 2 ==0) {
				System.out.println(numero + " es par.");
			}else {
				System.out.println(numero + " es impar.");
			}
		}else {
			System.out.println(numero + " cero no es par ni impar.");
		}
		 

	}

}
