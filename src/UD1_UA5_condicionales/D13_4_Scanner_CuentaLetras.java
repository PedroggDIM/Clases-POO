package UD1_UA5_condicionales;

import java.util.Scanner;

public class D13_4_Scanner_CuentaLetras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * Realice un programa que solicite por teclado una palabra y nos diga: (Utilice
		 * switch) Si tiene una letra Si tiene dos letras Si tiene más de dos letras que
		 * nos diga "Tengo muchas letras"
		 */

		String mensaje;

		System.out.println("Introduzca su palabra");

		mensaje = sc.nextLine();
		// sc.nextLine(); // Para que no se salte
		int longitudmensaje = mensaje.length();
		//System.out.println(mensaje);
		switch (longitudmensaje) {
		case 1:
			System.out.println("tengo " + longitudmensaje + " letra"); // mensaje tiene 1 letra
			break;
		case 2:
			System.out.println("tengo " + longitudmensaje + " letras"); // mensaje tiene 2 letras
			break;
		default:
			System.out.println("Tengo muchas letras (más de 3 letras)"); // mensaje tiene más de 2 letras
			break;
		}

	}
	/*Con un if también se podría hacer con sentencias de tipo:
	  if(cadena.length() == 1){
	        System.out.println("Tiene una letra");
	    }else if(cadena.length == 2){
	           System.out.println("Tiene dos letras.");
	        }else if(cadena.length == 3){
	              System.out.println("Tiene tres letras.");
	            }else{
	                  System.out.println(Tiene más de tres letras.");
	                }	    
	 */

}
