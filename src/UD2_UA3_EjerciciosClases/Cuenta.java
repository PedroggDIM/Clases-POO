package UD2_UA3_EjerciciosClases;

public class Cuenta {
	// Ejer 10.1
	private String titularString;
	private double cantidad;

	public Cuenta(String titular, double cantidad) {
		// Se puede usar el método o el this.
		setTitularString(titular); // this.titularString = titular;
		setCantidad(cantidad);
	}

//Las cuentas por defecto como mínimo tienen un titular
	public Cuenta(String titular) {
		// con this puedo llamar a los parámetros o al otro constructor.
		// Probarlo poniendo this con punto y this sin nada
		// Con this llamo al primer constructor y le paso el titular que tengo
		// en este por parámetro y cero que lo pongo yo
		this(titular, 0);
	}

//Genero getter y setter; los setter protected.	
	public String getTitularString() {
		return titularString;
	}

	protected void setTitularString(String titularString) {
		this.titularString = titularString;
	}

	protected void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}

//Método ingresar	
	public void ingresar(double ingreso) {
		if (ingreso > 0) {
			this.cantidad = this.cantidad + ingreso;
		}
	}

//Método retirar
	public void retirar(double retiro) {
		// if(this.cantidad - retiro < 0) También se puede poner:
		if (getCantidad() - retiro < 0) {
			System.out.println("Solo puede retirar " + this.cantidad);
			setCantidad(0);
		} else {
			setCantidad(getCantidad() - retiro);
		}
	}

//Creo el toString()	
	@Override
	public String toString() {
		return "Cuenta [titularString=" + titularString + ", cantidad=" + cantidad + " euros]";
	}

}
