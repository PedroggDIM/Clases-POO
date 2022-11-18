package UD1_UA4_operadores;

public class OperaLogicos {

	public static void main(String[] args) {
		
		boolean v = true;
		boolean f = false;

		System.out.println(v + " & " + v + " = " + (v & v));
		System.out.println(v + " & " + f + " = " + (v & f));
		System.out.println(v + " | " + f + " = " + (v | f));
		System.out.println(f + " | " + f + " = " + (f | f));
		System.out.println("!" + v + " = " + !v);
		System.out.println("!" + f + " = " + !f);

	}

}
