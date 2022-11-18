package UD1_UA4_operadores;

public class VariablesCharCompara {

	public static void main(String[] args) {
		
		char b = 'B';
		char c = 'b';
		char d = 'p';
		char s = 'a';
		Character k = 'A';
		Character t = 'a';

		boolean op1 = b > c;
		boolean op2 = d > c;
		boolean op3 = d > b;
		boolean op4 = k > t;
		boolean op5 = k > b;
		boolean op6 = s == t;
		boolean op7 = t < c;  
		
//Si se imprimieran por consola `op1, op2, op3, op4, op5, op6 y op7` , ¿Qué mostraría? ¿Por qué?		
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);
		System.out.println(op5);
		System.out.println(op6);
		System.out.println(op7);
		
		
	}
}
