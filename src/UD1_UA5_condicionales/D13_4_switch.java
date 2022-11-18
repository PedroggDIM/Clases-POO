package UD1_UA5_condicionales;

public class D13_4_switch {

	public static void main(String[] args) {
		
        int numero = 0;
        switch (numero%2) {
		case 0:
			System.out.println("El número es par");
			break;
      
		default:
			System.out.println("El número es impar");
			break;
		}
	}

}
