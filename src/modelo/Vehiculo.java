package modelo;

import modelo.Vehiculo.Coche;

/**
 * @author Alber 2023 clase Vehiculo
 * 
 */





public abstract class Vehiculo {
	

public static void main(String[] args) {
		
		
		// aquí el la lógica
		
		System.out.println(" hola");
		
		
		Coche mercedes = new Coche("mercedes"," ADV3556", 100, 10) ;
		
		mercedes.avanzarVehiculo(5);
		
		mercedes.infoVehiculo();
		
		};
	
	
	
	
	
	
   // definición de las clases y métodos

   /**
    * 
    * Clase abstracta Vehiculo
    * 
    */

	protected String marca;
	protected String matricula;
	protected Integer kilometros;
	protected Integer cap_deposito;
	protected Integer estado_deposito;
	

	public Vehiculo(String marca, String matricula, Integer kilometros, Integer cap_deposito, Integer estado_deposito) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.kilometros = kilometros;
		this.cap_deposito = cap_deposito;
		this.estado_deposito = estado_deposito;
	}

	
	
	// getters y setters
	

	/**
	 * @return la marca
	 */
	public String getMarca() {
		return marca;
	}




	/**
	 * @return la matricula
	 */
	public String getMatricula() {
		return matricula;
	}




	/**
	 * @return los kilometros del marcador
	 */
	public Integer getKilometros() {
		return kilometros;
	}



	/**
	 * @return la capacidad del deposito  cap_deposito
	 */
	public Integer getCap_deposito() {
		return cap_deposito;
	}




	/**
	 * @return el estado actual del depósito estado_deposito
	 */
	public Integer getEstado_deposito() {
		return estado_deposito;
	}



	/**
	 * @param marca establece la marca del vehículo
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}




	/**
	 * @param matricula establece la matrícula del vehículo
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	/**
	 * @param kilometros establece los kilometros del vehiculo
	 */
	public void setKilometros(Integer kilometros) {
		this.kilometros = kilometros;
	}



	/**
	 * @param cap_deposito establece la capacidad litros deposito
	 */
	public void setCap_deposito(Integer cap_deposito) {
		this.cap_deposito = cap_deposito;
	}





	/**
	 * @param estado_deposito establece el estado del deposito
	 */
	public void setEstado_deposito(Integer estado_deposito) {
		this.estado_deposito = estado_deposito;
	}



	// métodos a implementar en las clases que heredan 
	
	
	public abstract void llenarDeposito();

	public abstract void avanzarVehiculo(Integer kilometros);
	
	public abstract void infoVehiculo();
	
	
	
	
	
	/**
	 * clase Coches
	 * 
	 */
	
	
	public static class Coche extends Vehiculo{

		public Coche(String marca, String matricula, Integer kilometros, Integer estado_deposito) {
			super(marca, matricula, kilometros,10, estado_deposito);

		}

		@Override
		public void llenarDeposito() {
			
			// establecemos en 10 litros, lleno
			this.setEstado_deposito(10);
			
			
		}

		@Override
		public void avanzarVehiculo(Integer kilometros) {
			
			//Integer avanzakm = this.getKilometros()+kilometros;
			this.setKilometros(this.getKilometros()+kilometros);
			this.setEstado_deposito(getEstado_deposito()-kilometros*2);
			
						
		}

		@Override
		public void infoVehiculo() {
			
			System.out.println(" ******* Estado del Coche ******** ");
			System.out.println(" _________________________________ ");
			System.out.println("                                   ");
			System.out.println(" Kilometros:" + this.getKilometros());
			System.out.println(" _________________________________ ");
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}



