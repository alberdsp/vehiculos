package modelo;

public class Coche extends Vehiculo {

	/**
	 * clase Coches hereda de vehiculo
	 * 
	 */

	 // constructor que carga por defecto 10 litros de deposito.
	
	public Coche(String marca, String matricula, Integer kilometros) {
	
		super(marca, matricula, kilometros, 10);

	}

	@Override
	public void llenarDeposito() {

		// establecemos en 10 litros, lleno
		this.setEstado_deposito(10);

	}

	@Override
	public void avanzarVehiculo(Integer kilometros) {
		// comprobamos si queda combustible para avanzar

		if (this.getEstado_deposito() != 0) {

			// establecemos el nuevo cuentakilometros suma lo avanzado
			// restamos los litros consumidos

			for (int i = 1; i < kilometros || i == kilometros; i++) {

				this.setEstado_deposito(getEstado_deposito() - 2);
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
		};
		System.out.println("");
		System.out.println(" ******* Estado de los coches ******** ");
		System.out.println(" _________________________________ ");
		System.out.println("                                   ");
		System.out.println(
				" Coche: " + this.getMarca().toUpperCase() + " con matricula " + this.getMatricula().toUpperCase());
		System.out.println(" Kilometros: " + this.getKilometros());
		System.out.println(" Estado deposito: " + estado_deposito);
		System.out.println(" _________________________________ ");
		System.out.println("");

	}

}
	
	
	
	
	

