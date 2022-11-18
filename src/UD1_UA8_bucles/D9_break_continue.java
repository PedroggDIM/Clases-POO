package UD1_UA8_bucles;

public class D9_break_continue {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println("La i vale " + i);
			if (i == 2) {
				break; // break rompe el bucle, lo acaba y sale
			}
			i++;
		}
		
	//////////////////////////////////////////////////////////////////////	
		
		System.out.println("--------------------------------------");

		while (i <= 10) {
			i++;
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("La i vale " + i);
		}

	}

}
