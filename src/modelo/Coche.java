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

		 // establecemos el nuevo cuentakilometros suma lo avanzado
		
		this.setKilometros(this.getKilometros() + kilometros);
		
		 // restamos los litros correspondieste por cada kilometro avanzado
		this.setEstado_deposito(getEstado_deposito() - kilometros * 2);

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
	
	
	
	
	

