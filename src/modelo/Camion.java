package modelo;

public class Camion extends Vehiculo {

	/**
	 * clase Camion hereda de vehiculo
	 * 
	 */

	// constructor que carga por defecto 100 litros de deposito.

	public Camion(String marca, String matricula, Integer kilometros) {
		super(marca, matricula, kilometros, 100);

	}

	@Override
	public void llenarDeposito() {

		// establecemos en 100 litros, lleno
		this.setEstado_deposito(100);

	}

	@Override
	public void avanzarVehiculo(Integer kilometros) {

		// comprobamos si queda combustible para avanzar

		if (this.getEstado_deposito() != 0) {

			// establecemos el nuevo cuentakilometros suma lo avanzado
			// restamos los litros consumidos

			for (int i = 1; i < kilometros || i == kilometros; i++) {

				this.setEstado_deposito(getEstado_deposito() - 3);
				this.setKilometros(getKilometros() + 1);

				if (this.getEstado_deposito() == 0) {

					this.setEstado_deposito(0);

				

					break;

				}
				;

			}
		}

	}

	@Override
	public void infoVehiculo() {
		String estado_deposito = " Deposito vacio ";

		if (this.getEstado_deposito() > 0) {

			estado_deposito = this.getEstado_deposito().toString() + "L";
		}
		;
		System.out.println("");
		System.out.println(" ******* Estado de los camiones ******** ");
		System.out.println(" _________________________________ ");
		System.out.println("                                   ");
		System.out.println(
				" Camion: " + this.getMarca().toUpperCase() + " con matricula " + this.getMatricula().toUpperCase());
		System.out.println(" Kilometros: " + this.getKilometros());
		System.out.println(" Estado deposito: " + estado_deposito);
		System.out.println(" _________________________________ ");
		System.out.println("");
	}

}
	