package UD1_UA5_condicionales;

public class gil280922Quick {
	// jornada 40 horas.
	// la hora a 16 euros.
	// hora extra a 20 euros.

	public static void main(String[] args) {

		int salario = 16;
		int salarioExtra = 20;
		int jornadaLaboral = 40;
		int horasTrabajadas = 49;

		if (horasTrabajadas <= jornadaLaboral) {
			System.out.println("El salario será de: " + horasTrabajadas * salario + " euros.");
		} else {
			System.out.println("El salario será de: "
					+ ((jornadaLaboral * salario) + (horasTrabajadas - jornadaLaboral) * salarioExtra));
		}

//Con operador ternario:
		int total;
		total = (horasTrabajadas <= jornadaLaboral) ? (horasTrabajadas * salario) : ((jornadaLaboral * salario) + (horasTrabajadas - jornadaLaboral) * salarioExtra);
		System.out.println(total);

	}
}
