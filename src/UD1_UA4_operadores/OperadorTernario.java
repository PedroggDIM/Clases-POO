package UD1_UA4_operadores;

public class OperadorTernario {

	public static void main(String[] args) {
		/*
		 * Dadas las variables tipo int firstNum, secondNum , apuntando a los valores 5,
		 * 10. Mediante un operador ternario , utilizando firstNum y secondNum, haga que
		 * una tercera variable denominada result tipo int apunte al valor -5. Comprueba
		 * el resultado por consola.
		 */
		//Ejercicio 14.3
				int firstNum = 5;
				int secondNum = 10;
				int result;
				
				result = (firstNum > secondNum)? 8 : -5;  //  devuelve -5
				System.out.println(result);	

	}

}
