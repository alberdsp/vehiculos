package modelo;

public class Camion extends Vehiculo{
	
	
	


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

	     
		 // establecemos el nuevo cuentakilometros suma lo avanzado
		
		this.setKilometros(this.getKilometros() + kilometros);
		
		 // restamos los litros correspondieste por cada kilometro avanzado
		
		this.setEstado_deposito(getEstado_deposito() - kilometros*3);

	}

	@Override
	public void infoVehiculo() {
		String estado_deposito = " Deposito vacio ";

		if (this.getEstado_deposito() > 0) {

			estado_deposito = this.getEstado_deposito().toString() + "L";
		};
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
	
	