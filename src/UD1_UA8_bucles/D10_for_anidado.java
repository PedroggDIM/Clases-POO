package UD1_UA8_bucles;

public class D10_for_anidado {

	public static void main(String[] args) {
       // independientes
		for (int i = 5; i >= 1; i--) {
			System.out.print(i);
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
              
		}
		System.out.println("");
		
	  // dependientes		
		for (int i = 0; i <= 3; i++) {
			System.out.println("Bucle externo, i=" + i);
			int j = 1;
			while (j <= i) {
				System.out.println("... Bucle interno, j=" + j);
				j++;
			}
		}
	}
}
