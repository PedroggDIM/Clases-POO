package UD1_UA5_condicionales;

public class D9_2_if_else {

	public static void main(String args[]) {

		int a = 3;
		String mensaje = "Hola";

		if (a + 1 < 10) {
			boolean prueba = true;
			System.out.println(prueba);
			a = 0;
			System.out.println(mensaje);
			
			System.out.println(prueba); // prueba es variable local
		}

		// System.out.println(prueba);    // Da error dice que la variable no existe
		                                 // porque está declarada dentro del if
		
		System.out.println(a); // Esta variable al no ser local como prueba.
	}
}
