package UD1_UA8_bucles;

public class D11_4_FiguraAlfabetoConsola {
	public static void main(String args[]) {
		piramideLetras();
	}

	/*
	 * Realice un método que muestre por consola la siguiente "piramide"
	 * ZYXWVUTSRQPONMLKJIHGFEDCBA 
	 * YXWVUTSRQPONMLKJIHGFEDCBA 
	 * XWVUTSRQPONMLKJIHGFEDCBA
	 * WVUTSRQPONMLKJIHGFEDCBA 
	 * VUTSRQPONMLKJIHGFEDCBA 
	 * UTSRQPONMLKJIHGFEDCBA
	 * TSRQPONMLKJIHGFEDCBA 
	 * SRQPONMLKJIHGFEDCBA 
	 * RQPONMLKJIHGFEDCBA 
	 * QPONMLKJIHGFEDCBA
	 * PONMLKJIHGFEDCBA 
	 * ONMLKJIHGFEDCBA 
	 * NMLKJIHGFEDCBA 
	 * LKJIHGFEDCBA 
	 * LKJIHGFEDCBA
	 * KJIHGFEDCBA 
	 * JIHGFEDCBA 
	 * IHGFEDCBA 
	 * HGFEDCBA 
	 * GFEDCBA 
	 * FEDCBA 
	 * EDCBA 
	 * DCBA 
	 * CBA 
	 * BA 
	 * A
	 */
	static void piramideLetras() {
		for (char x = 'Z'; x >= 'A'; x--) {
			for (char y = x; y >= 'A'; y--) {
				System.out.print(y);
			}
			//System.out.println(x); //Imprime primer for de Z a A
			System.out.println();
		}
	}
}
